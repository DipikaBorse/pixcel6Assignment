package com.example.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Animal {
	@Id
private int id;
private String name;
private String Category;
private String Description;
private String life_span;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getLife_span() {
	return life_span;
}
public void setLife_span(String life_span) {
	this.life_span = life_span;
}
@Override
public String toString() {
	return "Animal [id=" + id + ", name=" + name + ", Category=" + Category + ", Description=" + Description
			+ ", life_span=" + life_span + ", getId()=" + getId() + ", getName()=" + getName() + ", getCategory()="
			+ getCategory() + ", getDescription()=" + getDescription() + ", getLife_span()=" + getLife_span()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
/**
 * @param id
 * @param name
 * @param category
 * @param description
 * @param life_span
 */
public Animal(int id, String name, String category, String description, String life_span) {
	this.id = id;
	this.name = name;
	Category = category;
	Description = description;
	this.life_span = life_span;
}

 Animal() {
	
}
	
}
