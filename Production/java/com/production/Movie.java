package com.production;
import java.util.*; 
import java.time.LocalDate;

public class Movie {
	private int movie_id,length,production_id;
	private String movie_name,hero_name,heroine,language,movie_type;
	
	LocalDate release_date;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int movie_id, String movie_name, String hero_name, String heroine,LocalDate release_date,
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

	

	public LocalDate getRelease_date() {
		return release_date;
	}

	public void setRelease_date(LocalDate release_date) {
		this.release_date = release_date;
	}
	
	public java.sql.Date get_date()
	{
		Date date=java.sql.Date.valueOf(getRelease_date());	//convertion of localdate to date 
		java.sql.Date sDate = convertUtilToSql(date);	//date object can't be directly pass to the sql so avoid class cast exception converto sql type;
		return sDate;
	}
	
	public java.sql.Date get_date1(LocalDate date)
	{
		Date date1=java.sql.Date.valueOf(date);	//convertion of localdate to date 
		java.sql.Date sDate = convertUtilToSql(date1);	//date object can't be directly pass to the sql so avoid class cast exception converto sql type;
		return sDate;
	}
	
	@Override
	public String toString() {
		return "Movie movie_id=" + movie_id + ", length=" + length + ", production_id=" + production_id
				+ ", movie_name=" + movie_name + ", hero_name=" + hero_name + ", heroine=" + heroine + ", release_date="
				+ release_date + ", language=" + language + ", movie_type=" + movie_type;
	}

	private java.sql.Date convertUtilToSql(Date release_date2) {
		// TODO Auto-generated method stub
		java.sql.Date sDate = new java.sql.Date(release_date2.getTime());
		return sDate;//return sql date 
	}

}
