package jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jpa.domain.Movie;
import jpa.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	
	// ex) http://localhost:8080/moive/get/1
	@RequestMapping(value = "/get/{movieNo}", method = RequestMethod.GET)
	public Movie get(@PathVariable Long movieNo) {
		return movieService.getMovie(movieNo);
	}
	
	// ex) http://localhost:8080/movie/save.do?movieName=LaLaLand
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public Movie add(Movie movie){
		return movieService.save(movie);
	}
	// ex) http://localhost:8080/movie/save/LaLaLand
	@RequestMapping(value = "/save/{movieName}", method = RequestMethod.GET)
	public Movie add2(@PathVariable String movieName) {
		return movieService.save(new Movie(movieName));
	}
	
	// ex) http://localhost:8080/movie/delete/1
	@RequestMapping(value="/delete/{movieNo}", method = RequestMethod.GET)
	public void delete(@PathVariable Long movieNo){
		movieService.delete(movieNo);
	}
	
	// http://localhost:8080/movie/getAll
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	public List<Movie> getAll(){
		return movieService.getAll();
	}
}
