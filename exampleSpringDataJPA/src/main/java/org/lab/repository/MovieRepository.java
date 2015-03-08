package org.lab.repository;

import java.util.List;

import org.lab.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {

	List<Movie> findByTitle(String title);
}
