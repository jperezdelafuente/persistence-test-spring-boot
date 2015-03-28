package org.lab.service.impl;

import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.lab.model.Movie;
import org.lab.repository.MovieRepository;
import org.lab.service.ServiceExample01basic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceExample01basicImpl implements ServiceExample01basic {

	@Autowired
	MovieRepository repository;

	@Override
	public void saveMovie(String title) {
		repository.save(new Movie(title));
	}

	@Override
	public List<Movie> findMovie(String title) {
		return repository.findByTitle(title);
	}

	@Override
	public List<Movie> findAllMovieWithList() {
		return repository.findAllMovies();
	}

	@Override
	public void printMovieWithStream() {
		try (Stream<Movie> streamMovies = repository.streamAllMovies()) {
			streamMovies.forEach(movie -> System.out.println("Name: " + movie.getTitle()));
		}
	}
}
