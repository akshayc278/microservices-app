package com.moviedata.base.bean;

import java.util.List;

public class ListOfRatings {
	private List<Rating> listOfRating;

	public ListOfRatings() {

	}

	public List<Rating> getListOfRating() {
		return listOfRating;
	}

	public void setListOfRating(List<Rating> listOfRating) {
		this.listOfRating = listOfRating;
	}

	public ListOfRatings(List<Rating> listOfRating) {
		this.listOfRating = listOfRating;
	}

}
