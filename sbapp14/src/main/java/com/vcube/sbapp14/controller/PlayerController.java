package com.vcube.sbapp14.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp14.model.Player;
import com.vcube.sbapp14.repo.PlayerInterface;

@RestController
@RequestMapping("api/b1")
public class PlayerController {
	@Autowired
	PlayerInterface playerRepo;

	// insertPlayers
	@PostMapping("insertPlayers")
	public Player insertPlayer(@RequestBody Player player) {
		return playerRepo.save(player);
	}

	// getAllPlayers
	@GetMapping("getAllPlayers")
	public List<Player> getAllPlayers() {
		return playerRepo.findAll();
	}

	// getPlayerById
	@GetMapping("getPlayerById/{pid}")
	public Player getPlayerById(@PathVariable int pid) {
		return playerRepo.findById(pid).orElseThrow(() -> new RuntimeException("null"));
	}

	@PutMapping("updatePlayer/{id}")
	public Player updatePlayer(@PathVariable int pid, @RequestBody Player player) {
		Player existing = playerRepo.findById(pid).orElseThrow(() -> new RuntimeException("Player not found"));

		existing.setPname(player.getPname());
		existing.setPrate(player.getPrate());
		return playerRepo.save(existing);
	}
	
	@DeleteMapping("deletePlayer/{pid}")
	public String deletePlayer(@PathVariable int pid) {
		playerRepo.deleteById(pid);
		return "Player deleted by id" + pid;
	}

}
