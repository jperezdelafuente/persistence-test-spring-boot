package org.lab.repository;

import java.util.List;
import java.util.stream.Stream;

import org.lab.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface MovieRepository extends Repository<Movie, Long> {

	<S extends Movie> S save(S Movie);

	List<Movie> findByTitle(String title);

	@Query("select m from Movie m")
	List<Movie> findAllMovies();

	@Query("select m from Movie m")
	Stream<Movie> streamAllMovies();

}
