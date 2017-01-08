package jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpa.domain.Movie;
import jpa.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	MovieRepository movieRepo;
	
	@Override
	public Movie save(Movie movie) {
		return movieRepo.save(movie);
	}

	@Override
	public Movie getMovie(Long movieNo) {
		return movieRepo.findOne(movieNo);
	}

	@Override
	public void delete(Long movieNo) {
		movieRepo.delete(movieNo);
	}
	
	@Override
	public List<Movie> getAll() {
		return movieRepo.findAll();
	}

}
