package com.springjpa.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class City {
    @Id
    private int id;
    private String name;
    @Column(name = "countrycode")
    private String countryCode;
    private String district;
    private int population;
}
