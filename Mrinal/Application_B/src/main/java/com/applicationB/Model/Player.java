package com.applicationB.Model;

public class Player {

	private String playerName;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String playerName) {
		super();
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}

}
