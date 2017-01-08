package jpa.service;

import java.util.List;

import jpa.domain.Movie;

public interface MovieService {

	Movie save(Movie movie);
	Movie getMovie(Long movieNo);
	void delete(Long moiveNo);
	List<Movie> getAll();
	
}
