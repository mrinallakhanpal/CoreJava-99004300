package com.example.Movie.Ticket;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Ticket {
	@Id
	String movieName;
	String circleType;
	LocalDate dateofBooking;
	LocalDate showDate;
	int noOfTickets;
	String shows;
	
	public Ticket(String movieName, String circleType, LocalDate dateofBooking, LocalDate showDate, int noOfTickets,
			String shows) {
		super();
		this.movieName = movieName;
		this.circleType = circleType;
		this.dateofBooking = dateofBooking;
		this.showDate = showDate;
		this.noOfTickets = noOfTickets;
		this.shows = shows;
	}
	public String getShows() {
		return shows;
	}
	public void setShows(String shows) {
		this.shows = shows;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCircleType() {
		return circleType;
	}
	public void setCircleType(String circleType) {
		this.circleType = circleType;
	}
	public LocalDate getDateofBooking() {
		return dateofBooking;
	}
	public void setDateofBooking(LocalDate dateofBooking) {
		this.dateofBooking = dateofBooking;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	@Override
	public String toString() {
		return "Ticket movieName=" + movieName + ", circleType=" + circleType + ", dateofBooking=" + dateofBooking
				+ ", showDate=" + showDate + ", noOfTickets=" + noOfTickets + ", shows=" + shows ;
	}
	
	
	/*
<table>
<c:forEach items="${list}" var="l">
<tr>
<td><c:out value="${l.getMovieName()}"></c:out></td>
<td><c:out value="${l.getCircleType()}"></c:out></td>
<td><c:out value="${l.getDateofBooking()}"></c:out></td>
<td><c:out value="${l.getShowDate()}"></c:out></td>
<td><c:out value="${l.getNoOfTickets()}"></c:out></td>
<td><c:out value="${l.getShows()}"></c:out></td>
</tr>
</table>*/
	
}
