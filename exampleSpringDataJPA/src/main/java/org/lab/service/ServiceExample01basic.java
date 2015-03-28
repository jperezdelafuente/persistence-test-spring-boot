package org.lab.service;

import java.util.List;

import org.lab.model.Movie;

public interface ServiceExample01basic {

	public void saveMovie(String title);

	public List<Movie> findMovie(String title);

	public List<Movie> findAllMovieWithList();

	public void printMovieWithStream();

}
