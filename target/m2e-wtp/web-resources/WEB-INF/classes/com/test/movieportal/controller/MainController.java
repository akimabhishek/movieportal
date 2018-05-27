package com.test.movieportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.movieportal.entity.Movie;
import com.test.movieportal.service.MoviePortalService;

@Controller
public class MainController {
	
	@Autowired
	MoviePortalService moviePortalService;
	
	@Transactional
	@RequestMapping(value="/allmovies", method=RequestMethod.GET)
	public ModelAndView getallmovies() {
		ModelAndView model = new ModelAndView("movielist");
		List<Movie> movies = moviePortalService.ListAllMovies();
		model.addObject("movies",movies);
		System.out.println(movies);
		return model;
	}
	
	@Transactional
	@RequestMapping(value="/success",method=RequestMethod.GET) 
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView("welcome");
		return model;
	}
	
}
