package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class prodmov {
     
	 @Id
	   @GeneratedValue
	    private int movieid;
		private String moviename;
		private String hero;
		private String heroine;
		private int Productionid;
		private String Productionname;
		public prodmov() {
			super();
			// TODO Auto-generated constructor stub
		}
		public prodmov(int movieid, String moviename, String hero, String heroine, int productionid,
				String productionname) {
			super();
			this.movieid = movieid;
			this.moviename = moviename;
			this.hero = hero;
			this.heroine = heroine;
			Productionid = productionid;
			Productionname = productionname;
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
		public int getProductionid() {
			return Productionid;
		}
		public void setProductionid(int productionid) {
			Productionid = productionid;
		}
		public String getProductionname() {
			return Productionname;
		}
		public void setProductionname(String productionname) {
			Productionname = productionname;
		}
		@Override
		public String toString() {
			return "movieid=" + movieid + ", moviename=" + moviename + ", hero=" + hero + ", heroine="
					+ heroine + ", Productionid=" + Productionid + ", Productionname=" + Productionname ;
		}
		
		
}
