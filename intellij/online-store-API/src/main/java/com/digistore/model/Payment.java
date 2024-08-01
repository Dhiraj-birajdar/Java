package com.digistore.model;
import org.springframework.data.annotation.Id;
   import org.springframework.data.mongodb.core.mapping.Document;
   import lombok.Data;

   import java.util.Date;

   @Data
   @Document(collection = "payments")
   public class Payment {
       @Id
       private String id;
       private String orderId;
       private double amount;
       private String status;
       private Date paymentDate;
   }
