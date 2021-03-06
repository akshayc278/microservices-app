package com.moviedata.base.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviedata.base.bean.ListOfRatings;
import com.moviedata.base.bean.Rating;

@RestController
@RequestMapping("/data")
public class MovieDataController {
	
	@RequestMapping("/{movieId}")
	public Rating getRaing(@PathVariable String movieId) {
		return new Rating("movieId", 4);
	}
	
	@RequestMapping("/user/{userId}")
	public ListOfRatings getRatingUser(@PathVariable String userId) {
		List<Rating> ratings = Arrays.asList(new Rating("m1", 4), new Rating("m2", 5));
		ListOfRatings listOfRatings=new ListOfRatings();
		listOfRatings.setListOfRating(ratings);
		return listOfRatings;
	}
}
