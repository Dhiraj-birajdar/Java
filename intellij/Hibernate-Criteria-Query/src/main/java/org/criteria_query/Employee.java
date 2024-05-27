package org.criteria_query;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    private int id;
    private String name;
    private String profile;
    private String email;
    private int salary;
    private int age;
    private int experience;

    public Employee() {
    }

    public Employee(String name, String profile, String email, int salary, int age, int experience) {
        this.name = name;
        this.profile = profile;
        this.email = email;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && age == employee.age && experience == employee.experience && Objects.equals(name,
                employee.name) && Objects.equals(profile, employee.profile) && Objects.equals(email, employee.email);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, profile, email, salary, age, experience);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profile=" + profile +
                ", email=" + email +
                ", salary=" + salary +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
