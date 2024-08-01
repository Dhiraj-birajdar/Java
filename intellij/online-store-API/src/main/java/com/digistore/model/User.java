package com.digistore.model;
 import org.springframework.data.annotation.Id;
   import org.springframework.data.mongodb.core.mapping.Document;
   import lombok.Data;

 import java.util.List;

@Data
   @Document(collection = "users")
   public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private Profile profile;
    private List<String> roles;


    @Data
    public static class Profile {
        private String firstName;
        private String lastName;
        private String address;
        private String phone;
    }
}