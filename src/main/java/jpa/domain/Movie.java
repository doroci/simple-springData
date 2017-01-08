package jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private Long moiveNo;

	@NotNull
	private String movieName;
	
	public Movie() {}
	
	public Movie(String movieName) {
		this.movieName = movieName;
	}

	public Long getMoiveNo() {
		return moiveNo;
	}

	public void setMoiveNo(Long moiveNo) {
		this.moiveNo = moiveNo;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movie [moiveNo=" + moiveNo + ", movieName=" + movieName + "]";
	}
	
	
	

}
