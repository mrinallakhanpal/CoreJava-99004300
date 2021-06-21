package com.movie.moviedetails;



public class Movie {
	private int movie_id,length,production_id;
	private String movie_name,hero_name,heroine,release_date,language,movie_type;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int movie_id, String movie_name, String hero_name, String heroine,String release_date,
			String language,int length,String movie_type,int production_id) {
		super();
		this.movie_id = movie_id;
		this.length = length;
		this.production_id = production_id;
		this.movie_name = movie_name;
		this.hero_name = hero_name;
		this.heroine = heroine;
		this.release_date = release_date;
		this.language = language;
		this.movie_type = movie_type;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getProduction_id() {
		return production_id;
	}

	public void setProduction_id(int production_id) {
		this.production_id = production_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getHero_name() {
		return hero_name;
	}

	public void setHero_name(String hero_name) {
		this.hero_name = hero_name;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMovie_type() {
		return movie_type;
	}

	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}

	@Override
	public String toString() {
		return "Movie movie_id=" + movie_id + ", length=" + length + ", production_id=" + production_id
				+ ", movie_name=" + movie_name + ", hero_name=" + hero_name + ", heroine=" + heroine + ", release_date="
				+ release_date + ", language=" + language + ", movie_type=" + movie_type;
	}

	
	
	
}
