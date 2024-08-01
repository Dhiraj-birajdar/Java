package com.digistore.model;
import org.springframework.data.annotation.Id;
   import org.springframework.data.mongodb.core.mapping.Document;
   import lombok.Data;

   import java.util.Date;
   import java.util.List;

   @Data
   @Document(collection = "orders")
   public class Order {
       @Id
       private String id;
       private String userId;
       private List<Item> items;
       private double totalPrice;
       private String status;
       private Date createdDate;

       @Data
       public static class Item {
           private String productId;
           private int quantity;
           private double price;
       }
   }