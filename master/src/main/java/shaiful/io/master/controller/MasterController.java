package shaiful.io.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import shaiful.io.master.model.Product;
import shaiful.io.master.service.MasterService;

import java.util.List;

@RestController
public class MasterController {
    private MasterService masterService;

    @Autowired
    public MasterController(MasterService masterService) {
        this.masterService = masterService;
    }

    @GetMapping("/get-products")
    public List<Product> getProducts(){
        return masterService.getProducts();
    }
}
