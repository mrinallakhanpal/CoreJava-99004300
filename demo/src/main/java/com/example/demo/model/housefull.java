package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class housefull {
   
	  @Id
	   @GeneratedValue
	    private int movieid;
		private String moviename;
		private String showtype;
		LocalDate d;
		public housefull() {
			super();
			// TODO Auto-generated constructor stub
		}
		public housefull(int movieid, String moviename, String showtype, LocalDate d) {
			super();
			this.movieid = movieid;
			this.moviename = moviename;
			this.showtype = showtype;
			this.d = d;
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
		public String getShowtype() {
			return showtype;
		}
		public void setShowtype(String showtype) {
			this.showtype = showtype;
		}
		public LocalDate getD() {
			return d;
		}
		public void setD(LocalDate d) {
			this.d = d;
		}
		
		
}
