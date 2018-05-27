package com.test.movieportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.movieportal.entity.Movie;

@Service
public interface MoviePortalService {

	public List<Movie> ListAllMovies();
	public void updateMovie(Movie movie);
	public void deleteMovie(String name);
	public Movie getmoviebyName(String name);
	
}
