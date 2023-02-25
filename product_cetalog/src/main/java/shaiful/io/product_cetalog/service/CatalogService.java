package shaiful.io.product_cetalog.service;

import org.springframework.stereotype.Service;
import shaiful.io.product_cetalog.model.Product.Product;

import java.util.List;

@Service
public class CatalogService {

    List<Product> productList = List.of(
            new Product(1L, "LG Large Monitor", 11500.00),
            new Product(2L, "A4Tech Mouse", 500.00),
            new Product(3L, "AMD Processor", 500.00)
    );

    public List<Product> getProducts() {
        return  productList;
    }
}
