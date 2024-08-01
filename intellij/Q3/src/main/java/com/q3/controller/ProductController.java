package com.q3.controller;

import com.q3.entity.Product;
import com.q3.repository.ProductRepository;
import com.q3.repository.Status;
import com.q3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    private final ProductRepository repository;

    @PutMapping("/update-product")
    public ResponseEntity<String> update(@RequestBody Product p){
        System.out.println(p);
        if(service.update(p) == Status.SUCCESS)
            return ResponseEntity.ok("Success: Updated successfully");
        else if(service.update(p) == Status.NOT_EXISTS)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not exists: Product not exists");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
    }

    @GetMapping("/products/{price}")
    public ResponseEntity<?> getAbovePrice(@PathVariable double price){
        List<Product> lp = service.getAbovePrice(price);
        if(lp.size() == 0)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No products found");

        if(lp.size()>0)
            return ResponseEntity.ok(lp);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong");

    }

    @GetMapping("/top-expensive/{n}")
    public ResponseEntity<?> getNMostExpensive(@PathVariable int n){
        List<Product> lp = service.getNMostExpensive(n);
        if(lp.size()==0)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No products found");
        if(lp.size()>0)
            return ResponseEntity.ok(lp);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong");
    }







    @PostMapping("")
    public String add(@RequestBody Product p){
        repository.add(p);
        return "Product Added Succssfully";

    }

    @GetMapping("")
    public ResponseEntity<?> all(){
        return ResponseEntity.ok(repository.getAll());
    }


}
