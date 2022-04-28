package com.moviedata.base.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviedata.base.bean.Rating;

@RestController
@RequestMapping("/data")
public class MovieDataController {
	@RequestMapping("/{movieId}")
	public Rating getRaing(@PathVariable String movieId) {
		return new Rating("movieId", 4);
	}
}