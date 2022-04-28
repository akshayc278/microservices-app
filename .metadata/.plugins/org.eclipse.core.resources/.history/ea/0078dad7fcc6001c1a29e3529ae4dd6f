package com.moviecatalog.base.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.moviecatalog.base.bean.ListOfMovieCatalog;
import com.moviecatalog.base.bean.ListOfRatings;
import com.moviecatalog.base.bean.Movie;
import com.moviecatalog.base.bean.MovieCatalog;
import com.moviecatalog.base.bean.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientBuider;

	@RequestMapping("/{userId}")
	public ListOfMovieCatalog getCatalog(@PathVariable int userId) {
		// get all movie rating
		ListOfRatings ratings = restTemplate.getForObject("http://localhost:8082/data/user/" + userId,
				ListOfRatings.class);

		// get movie info for movie id
		List<Rating> listRating = ratings.getListOfRating();

		ListOfMovieCatalog listOfMovieCatalog = new ListOfMovieCatalog();
		listOfMovieCatalog.setListOfMovieCatalog(listRating.stream().map(r -> {
			Movie movie = restTemplate.getForObject("http://localhost:8081/info/" + r.getRatings(), Movie.class);
			return new MovieCatalog(movie.getName(), "sci fi movie", r.getRatings());

		}).collect(Collectors.toList()));
		return listOfMovieCatalog;

		// Using webClient(new Way)

	}

	@RequestMapping("/webclient/{userId}")
	public List<MovieCatalog> getCatalogUsingWebClient(@PathVariable int userId) {
		// get all movie rating
		List<Rating> ratings = Arrays.asList(new Rating("m1", 4), new Rating("m2", 5));

		// get movie info for movie id
		return ratings.stream().map(r -> {
			Movie movie = webClientBuider.build().get().uri("http://localhost:8081/info/" + r.getRatings()).retrieve()
					.bodyToMono(Movie.class).block();
			return new MovieCatalog(movie.getName(), "sci fi movie", r.getRatings());

		}).collect(Collectors.toList());

	}
}
