package com.digistore.model;
import org.springframework.data.annotation.Id;
   import org.springframework.data.mongodb.core.mapping.Document;
   import lombok.Data;

   import java.util.List;

   @Data
   @Document(collection = "cart")
   public class Cart {
       @Id
       private String id;
       private String userId;
       private List<Item> items;

       @Data
       public static class Item {
           private String productId;
           private int quantity;
       }
   }
