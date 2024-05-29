package com.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {

	@GetMapping("home")
	public String home() {
		return "<h1 style='color:red'>Welcome to home page</h1>"
				+ "<form action='http://localhost:8080/laptops'>"
				+ "Enter no of laptops:"
				+ "<input type='number' name='n'><br>"
				+ "<input type='submit' value='submit'>"
				+ "</form>";
	}
	
	@GetMapping("laptops")
	public List<Laptop> getLaptops(@RequestParam(defaultValue = "10") int n){
		
		List<Laptop> ll = new ArrayList<>();
        Random random = new Random();
        String[] brands = {"Dell", "HP", "Apple", "Lenovo", "Asus"};
        String[] names = {"Inspiron", "Pavilion", "MacBook", "ThinkPad", "VivoBook"};

        for (int i = 0; i < n; i++) {
            int id = i + 1;
            String brand = brands[random.nextInt(brands.length)];
            String name = names[random.nextInt(names.length)];
            int ram = (random.nextInt(4) + 1) * 8;
            int ssd = (random.nextInt(4) + 1) * 256; 
            double price = 500 + (random.nextInt(15) * 100);
            ll.add(new Laptop(id, name, brand, ram, ssd, price));
        }
        return ll;
	}
}
