package ie.atu.week6;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private ProductService myProduct;
    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }
    @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody Product product){
        //business logic to add this to a database
        //return list of all products from the database
     return myProduct.addProduct(product);
    }
    @GetMapping("/getProducts")
    public List<Product> getAllProducts() {
        return myProduct.getALlProducts();
    }

    @DeleteMapping("/deleteProducts/{id}")
    public List<Product> deleteProduct(@PathVariable int id){
        return myProduct.deleteProduct(id);
    }
}
