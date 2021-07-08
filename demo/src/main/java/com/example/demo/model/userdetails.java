package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class userdetails {
	 @Id
	   @GeneratedValue
	  private int uid;
	    private String username;
		private String userpassword;
		public userdetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		public userdetails(int uid,String username, String userpassword) {
			super();
		this.uid=uid;
			this.username = username;
			this.userpassword = userpassword;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getUserpassword() {
			return userpassword;
		}
		public void setUserpassword(String userpassword) {
			this.userpassword = userpassword;
		}
		@Override
		public String toString() {
			return "Userdetails [username=" + username + ", userpassword=" + userpassword + "]";
		}
		
		
		
}