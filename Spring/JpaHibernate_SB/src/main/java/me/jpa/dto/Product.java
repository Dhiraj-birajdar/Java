package me.jpa.dto;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
//    @Column(name = "available_quantity")
    private double availableQuantity;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
