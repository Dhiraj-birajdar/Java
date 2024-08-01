package me.jpa;

import me.jpa.dto.Category;
import me.jpa.dto.Product;
import me.jpa.dto.User;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class JpaHibernateSbApplication {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;

    public static void main(String[] args) {

        var app =SpringApplication.run(JpaHibernateSbApplication.class, args);

        var main = app.getBean(JpaHibernateSbApplication.class);
        Category category = new Category();
        category.setDescription("Computer peripherals");
        category.setName("Keyboards");
        main.categoryRepository.save(category);

        // Creating and saving a Product
        Product product = new Product();
        product.setDescription("Mechanical keyboard with RGB lighting");
        product.setName("Mechanical Keyboard 1");
        product.setPrice(BigDecimal.valueOf(99.99));
        product.setAvailableQuantity(10);
        product.setCategory(category);
        main.productRepository.save(product);

        System.out.println("Category and Product saved successfully.");
//        User u = new User();
//        System.out.println(u);


    }

//    static void hi(String string, int id, boolean flag, short number)

}
