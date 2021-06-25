package com.productiondao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.configure.Myconfig;
import com.production.Movie;
import com.production.Production;

public class MovieDao {

	public boolean InsertMovie(Movie m) throws SQLException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = Myconfig.getConnection();
		boolean b = false;
		PreparedStatement ps = con.prepareStatement("insert into movie values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, m.getMovie_id());
		ps.setString(2, m.getMovie_name());
		ps.setString(3, m.getHero_name());
		ps.setString(4, m.getHeroine());
		ps.setDate(5, m.get_date());
		ps.setString(6, m.getLanguage());
		ps.setInt(7, m.getLength());
		ps.setString(8, m.getMovie_type());
		ps.setInt(9, m.getProduction_id());

		b = ps.execute();
		System.out.println("Value inserted");
		return b;
	}

	public List<Movie> getAllDetails() throws SQLException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		List<Movie> movies = new ArrayList<Movie>();
		Connection con = Myconfig.getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from movie");
		while (rs.next()) {
			movies.add(new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
					LocalDate.parse(rs.getString(5)), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9)));
		}
		return movies;
	}

	public Movie getPlayerbyId(int id) throws SQLException, Exception {
		Connection con = Myconfig.getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from movie where movieid=" + id);
		Movie p = null;
		while (rs.next()) {
			p = new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5).toLocalDate(),
					rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
		}
		return p;
	}

	public int update(int mid, String mname, String mhname, String mhername, LocalDate dob, String lan, int len,
			String mtype, int pid) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = Myconfig.getConnection();
		PreparedStatement stmt = con.prepareStatement(
				"update movie set movieid=?,moviename=?,heroname=?,heroine=?,releasedate=?,language=?,length=?,movietype=?,productionid=? where movieid=?");
		stmt.setInt(1, mid);
		stmt.setString(2, mname);
		stmt.setString(3, mhname);
		stmt.setString(4, mhername);

		Movie m = new Movie();
		java.sql.Date dob1 = m.get_date1(dob);
		stmt.setDate(5, dob1);

		stmt.setString(6, lan);
		stmt.setInt(7, len);
		stmt.setString(8, mtype);
		stmt.setInt(9, pid);
		stmt.setInt(10, mid);

		int i = stmt.executeUpdate();
		System.out.println("Records updated");
		return i;
	}

	

}
