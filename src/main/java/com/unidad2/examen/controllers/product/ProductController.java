package com.unidad2.examen.controllers.product;

import com.unidad2.examen.models.product.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-examen/product/")
@CrossOrigin(origins = {"*"})
public class ProductController {

//    @GetMapping("/")
//    public ResponseEntity <List<Product>> getAll() {
//        return new ResponseEntity<>(
//                this.service.getAll(),
//                HttpStatus.OK
//        );
//    }


}
