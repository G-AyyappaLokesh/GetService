package com.digit;

public class User {
	
	private long id;
	private String name;
	private double salary;
	private String place;
	
	public User(long id, String name, double salary, String place){
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.place = place;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + ", place=" + place + "]";
	}
	

}
