package com.q2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
// todo: lombok gette/setter causes issue with field name and incoming json key name use @JsonProperty
@Component
public class Employee {

    @JsonProperty("eId")
    private int eId;

    @JsonProperty("eName")
    private String eName;

    @JsonProperty("eAge")
    private int eAge;

    @JsonProperty("ePosition")
    private String ePosition;

    @JsonProperty("eSalary")
    private double eSalary;

//    public Employee() {
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return eId == employee.eId && eAge == employee.eAge && Double.compare(eSalary, employee.eSalary) == 0 && Objects.equals(eName, employee.eName) && Objects.equals(ePosition, employee.ePosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eId, eName, eAge, ePosition, eSalary);
    }

//    public int geteId() {
//        return eId;
//    }
//
//    public void seteId(int eId) {
//        this.eId = eId;
//    }
//
//    public String geteName() {
//        return eName;
//    }
//
//    public void seteName(String eName) {
//        this.eName = eName;
//    }
//
//    public int geteAge() {
//        return eAge;
//    }
//
//    public void seteAge(int eAge) {
//        this.eAge = eAge;
//    }
//
//    public String getePosition() {
//        return ePosition;
//    }
//
//    public void setePosition(String ePosition) {
//        this.ePosition = ePosition;
//    }
//
//    public double geteSalary() {
//        return eSalary;
//    }
//
//    public void seteSalary(double eSalary) {
//        this.eSalary = eSalary;
//    }
}
