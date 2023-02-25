package shaiful.io.product_cetalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shaiful.io.product_cetalog.model.Product.Product;
import shaiful.io.product_cetalog.service.CatalogService;

import java.util.List;

@RestController
public class CatalogController {

    private CatalogService catalogService;

    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return catalogService.getProducts();
    }
}
