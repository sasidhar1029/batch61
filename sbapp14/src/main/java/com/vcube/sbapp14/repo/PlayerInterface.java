package com.vcube.sbapp14.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.sbapp14.model.Player;

public interface PlayerInterface extends JpaRepository<Player,Integer>{

}
