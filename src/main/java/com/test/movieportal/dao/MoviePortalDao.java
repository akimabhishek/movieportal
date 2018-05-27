package com.test.movieportal.dao;

import java.util.List;

import com.test.movieportal.entity.Movie;

public interface MoviePortalDao {

	public List<Movie> ListAllMovies();
	public void updateMovie(Movie movie);
	public void deleteMovie(String name);
	public Movie getmoviebyName(String name);
}
