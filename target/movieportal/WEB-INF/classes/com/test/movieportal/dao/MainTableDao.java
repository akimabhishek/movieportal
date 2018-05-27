package com.test.movieportal.dao;

import java.util.List;

import com.test.movieportal.entity.Actors;
import com.test.movieportal.entity.MainTable;
import com.test.movieportal.entity.Movie;

public interface MainTableDao {
	
	public List<MainTable> getAll();
	/*public void deleteMovie(String name);
	public void deleteActor(String name);
	public void updateMovie(Movie moive);
	public void updateActor(Actors actor);*/
	
}
