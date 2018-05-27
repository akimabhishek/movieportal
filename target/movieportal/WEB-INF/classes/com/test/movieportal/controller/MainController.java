package com.test.movieportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.movieportal.entity.Movie;
import com.test.movieportal.service.MoviePortalService;

@Controller
public class MainController {
	
	@Autowired
	MoviePortalService moviePortalService;
	
	@RequestMapping(value="/allmovies", method=RequestMethod.GET)
	public ModelAndView getallmovies() {
		ModelAndView model = new ModelAndView("movieList");
		List<Movie> movies = moviePortalService.ListAllMovies();
		model.addObject("searchResult",movies);
		return model;
	}
	
	@RequestMapping(value="",method=RequestMethod.GET) 
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView("welcome");
		return model;
	}
	
}
