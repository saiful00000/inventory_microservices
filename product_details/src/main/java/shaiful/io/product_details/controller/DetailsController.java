package shaiful.io.product_details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shaiful.io.product_details.model.ProductDetails;
import shaiful.io.product_details.service.DetailsService;

@RestController
public class DetailsController {
    private DetailsService detailsService;

    @Autowired
    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping("/details/{productId}")
    public ProductDetails getProductDetails(@PathVariable("productId") int productId) {
        return detailsService.getProductDetails(productId);
    }
}
