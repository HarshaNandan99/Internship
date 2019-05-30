package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Stud database table.
 * 
 */
@Entity
@NamedQuery(name="Stud.findAll", query="SELECT s FROM Stud s")
public class Stud implements Serializable {
	private static final long serialVersionUID = 1L;

	private String area;

	
	private int height;

	@Id
	private int id;

	public Stud() {
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}