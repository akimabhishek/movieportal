package com.test.movieportal.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	private int id;
	private String name;
	private int year;
	private String plot;
	private String image;
	@ManyToMany
	private Collection<Actors> actor = new ArrayList<Actors>();
	@ManyToOne
	private Producer producer;
	@ManyToOne
	private MainTable mainTable;
	
	public MainTable getMainTable() {
		return mainTable;
	}
	public void setMainTable(MainTable mainTable) {
		this.mainTable = mainTable;
	}
	public Producer getProducer() {
		return producer;
	}
	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	public Collection<Actors> getActor() {
		return actor;
	}
	public void setActor(Collection<Actors> actor) {
		this.actor = actor;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
