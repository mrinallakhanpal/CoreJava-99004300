package com.applicationA.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.applicationA.Model.Player;
import com.applicationA.Repository.PlayerRepository;

@RestController
public class _Controller {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private PlayerRepository playerRepository;

	@RequestMapping("/call")
	public List<Player> saveData() {

		Player[] responseEntity = restTemplate.getForObject("http://localhost:8082/getAllPlayer", Player[].class);

		List<Player> players = Arrays.asList(responseEntity);
		System.out.println(players);

		playerRepository.saveAll(players);

		return players;

	}
}
