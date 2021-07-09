package com.applicationB.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applicationB.Model.Player;

@RestController
public class _Controller {

	
	@GetMapping("/getAllPlayer")
	public List<Player> getAllPlayer() {

		return Arrays.asList(new Player("Sachin Tendulkar"), 
				new Player("Ms Dhoni"), 
				new Player("Virat"));

	}
}
