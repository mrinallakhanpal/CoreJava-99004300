package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class cost {
	 @Id
	   @GeneratedValue
	    private int movieid;

	public cost() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cost(int movieid) {
		super();
		this.movieid = movieid;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

}
