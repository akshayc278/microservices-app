package com.moviecatalog.base.bean;

import java.util.List;

public class ListOfMovieCatalog {
	private List<MovieCatalog> listOfMovieCatalog;

	public ListOfMovieCatalog() {

	}

	public ListOfMovieCatalog(List<MovieCatalog> listOfMovieCatalog) {
		this.listOfMovieCatalog = listOfMovieCatalog;
	}

	public List<MovieCatalog> getListOfMovieCatalog() {
		return listOfMovieCatalog;
	}

	public void setListOfMovieCatalog(List<MovieCatalog> listOfMovieCatalog) {
		this.listOfMovieCatalog = listOfMovieCatalog;
	}
	

}
