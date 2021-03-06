package com.movieinfo.base.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfo.base.bean.Movie;

@RestController
@RequestMapping("/info")
public class MovieInfoController {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		return new Movie(movieId,"Dil Se");
	}
}
