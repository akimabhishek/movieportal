package com.test.movieportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.movieportal.dao.MoviePortalDao;
import com.test.movieportal.entity.Movie;

public class MoviePortalServiceImpl implements MoviePortalService {

	@Autowired
	MoviePortalDao moviePortalDao;
	
	public List<Movie> ListAllMovies() {
		return moviePortalDao.ListAllMovies();
	}
	
	public Movie getmoviebyName(String name) {
		return moviePortalDao.getmoviebyName(name);
	}
	
	public void updateMovie(Movie movie) {
		 moviePortalDao.updateMovie(movie);
	}
	
	public void deleteMovie(String name) {
		moviePortalDao.deleteMovie(name);
	}
	
	
}
