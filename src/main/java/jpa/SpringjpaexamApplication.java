package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jpa.domain.Movie;
import jpa.service.MovieService;

@SpringBootApplication
public class SpringjpaexamApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringjpaexamApplication.class, args);
	}
	
	@Autowired
	MovieService movieResrvice;

	// 데이터 생성
	public void run(String...args) {
		movieResrvice.save(new Movie("LaLaLand"));
		movieResrvice.save(new Movie("Zootopia"));
		movieResrvice.save(new Movie("LionKing"));
	}
}