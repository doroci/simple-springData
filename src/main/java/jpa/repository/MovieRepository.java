package jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.domain.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
