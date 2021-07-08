package com.example.demo.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Movie {
	
	   @Id
	   @GeneratedValue
	    private int movieid;
		private String moviename;
		private String hero;
		private String heroine;
		private LocalDate date;
		private String lang;
		private int length;
		private String type;
		private int prodid;
		
		
	   public Movie() {
		   super();
	   }

		public Movie(int movieid, LocalDate ld, String hero, String heroine, String lang2, int length2, String mname,
				int pid, String type2) {
			super();
			this.movieid = movieid;
			this.date = ld;
			this.hero = hero;
			this.heroine = heroine;
			this.lang = lang2;
			this.length= length2;
			this.moviename = mname;
			this.prodid = pid;
			this.type = type2;
		}


		

		public int getMovieid() {
			return movieid;
		}

		

		


	

		public void setMovieid(int movieid) {
			this.movieid = movieid;
		}


		public String getMoviename() {
			return moviename;
		}


		public void setMoviename(String moviename) {
			this.moviename = moviename;
		}


		public String getHero() {
			return hero;
		}


		public void setHero(String hero) {
			this.hero = hero;
		}


		public String getHeroine() {
			return heroine;
		}


		public void setHeroine(String heroine) {
			this.heroine = heroine;
		}


		public LocalDate getDate() {
			return date;
		}


		public void setDate(LocalDate date) {
			this.date = date;
		}
		
		


		


		public String getLang() {
			return lang;
		}


		public void setLang(String lang) {
			this.lang = lang;
		}


		public int getLength() {
			return length;
		}


		public void setLength(int length) {
			this.length = length;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public int getProdid() {
			return prodid;
		}


		public void setProdid(int prodid) {
			this.prodid = prodid;
		}

		@Override
		public String toString() {
			return "movieid=" + movieid + ", moviename=" + moviename + ", hero=" + hero + ", heroine=" + heroine
					+ ", date=" + date + ", lang=" + lang + ", length=" + length + ", type=" + type + ", prodid=" + prodid
					;
		}
		


		
		
		
	}

