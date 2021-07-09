package com.applicationA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applicationA.Model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
