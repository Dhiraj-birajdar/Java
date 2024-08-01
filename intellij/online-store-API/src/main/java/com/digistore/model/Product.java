package com.digistore.model;
import org.springframework.data.annotation.Id;
   import org.springframework.data.mongodb.core.mapping.Document;
   import lombok.Data;

   @Data
   @Document(collection = "products")
   public class Product {
       @Id
       private String id;
       private String name;
       private String description;
       private double price;
       private String category;
       private int stock;
       private String imageUrl;
   }
