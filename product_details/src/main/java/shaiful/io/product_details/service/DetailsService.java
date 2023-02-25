package shaiful.io.product_details.service;

import org.springframework.stereotype.Service;
import shaiful.io.product_details.model.ProductDetails;

import java.util.List;
import java.util.Map;

@Service
public class DetailsService {

    Map<Integer, ProductDetails> productDetailsMap = Map.of(
            1, new ProductDetails(1, "Monitor description", List.of("lg", "monitor", "HD"), "LG", 100),
            2, new ProductDetails(2, "Monitor description", List.of("lg", "monitor", "HD"), "LG", 100),
            3, new ProductDetails(2, "Monitor description", List.of("lg", "monitor", "HD"), "LG", 100)
    );

    public ProductDetails getProductDetails(Integer id){
        return productDetailsMap.get(id);
    }
}
