package com.applicationA.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String playerName;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(Integer id, String playerName) {
		super();
		this.id = id;
		this.playerName = playerName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + "]";
	}

}
