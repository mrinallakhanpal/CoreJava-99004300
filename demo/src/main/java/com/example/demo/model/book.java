package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class book {
	 @Id
	   @GeneratedValue
	    private int movieid;
		private String moviename;
		private int tickets;
		private String classtype;
		private LocalDate date;
		private String showtype;
		public book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public book(int movieid, String moviename, int tickets, String classtype, LocalDate date, String show) {
			super();
			this.movieid = movieid;
			this.moviename = moviename;
			this.tickets = tickets;
			this.classtype = classtype;
			this.date = date;
			this.showtype = show;
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
		public int getTickets() {
			return tickets;
		}
		public void setTickets(int tickets) {
			this.tickets = tickets;
		}
		public String getClasstype() {
			return classtype;
		}
		public void setClasstype(String classtype) {
			this.classtype = classtype;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		public String getShow() {
			return showtype;
		}
		public void setShow(String show) {
			this.showtype = show;
		}
		@Override
		public String toString() {
			return "movieid=" + movieid + ", moviename=" + moviename + ", tickets=" + tickets + ", classtype="
					+ classtype + ", date=" + date + ", show=" + showtype ;
		}
		
		
}
