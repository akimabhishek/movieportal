package com.test.movieportal.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Actors {
	
	@Id
	private int id;
	private String name;
	private String sex;
	private Date dob;
	private String bio;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="actor")
	private Collection<Movie> movie = new ArrayList<Movie>();
	
	/*@ManyToOne
	private MainTable mainTable;
	 
	public MainTable getMainTable() {
		return mainTable;
	}
	public void setMainTable(MainTable mainTable) {
		this.mainTable = mainTable;
	}*/
	public Collection<Movie> getMovie() {
		return movie;
	}
	public void setMovie(Collection<Movie> movie) {
		this.movie = movie;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	/*@Override
	public String toString() {
		return "Actors [id=" + id + ", name=" + name + ", sex=" + sex + ", dob=" + dob + ", bio=" + bio + ", movie="
				+ movie + "]";
	}*/
	
	
}
