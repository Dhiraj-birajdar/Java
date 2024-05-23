package com.accidents.pojo;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Car {
	
	@Id
	private int id;
	@Column(name = "company")
	private String company;
	private String owner;
	private double cost;
		
	public Car() {
		super();
	}
	public Car(int id, String company, String owner, double cost) {
		super();
		this.id = id;
		this.company = company;
		this.owner = owner;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", owner=" + owner + ", cost=" + cost + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(company, cost, id, owner);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(company, other.company)
				&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(owner, other.owner);
	}
	
	
	

}
