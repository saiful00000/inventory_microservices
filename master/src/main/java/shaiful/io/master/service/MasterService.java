package shaiful.io.master.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import shaiful.io.master.model.Catalog;
import shaiful.io.master.model.Details;
import shaiful.io.master.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class MasterService {
    private WebClient catalogClient;
    private WebClient detailsClient;

    @Autowired
    public MasterService(@Qualifier("catalogClient") WebClient catalogClient, @Qualifier("detailsClient") WebClient detailsClient) {
        this.catalogClient = catalogClient;
        this.detailsClient = detailsClient;
    }

    public List<Product> getProducts() {
        List<Catalog> catalogLost = catalogClient.get().uri("/products").retrieve().bodyToFlux(Catalog.class).collectList().block();

        List<Product> productList = new ArrayList<>();

        if (catalogLost != null) {
            for (Catalog catalog : catalogLost) {
                Details details = detailsClient.get().uri("/details/" + catalog.getId()).retrieve().bodyToMono(Details.class).block();
                if (details != null) {
                    productList.add(new Product(catalog.getId(), catalog.getName(), catalog.getPrice(), details.getDescription(), details.getTags(), details.getBrand(), details.getAvailableStock()));
                }
            }
        }

        return productList;
    }
}
