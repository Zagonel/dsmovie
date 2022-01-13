package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.devsuperior.dsmovie.entitites.Score;
import com.devsuperior.dsmovie.entitites.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
	
}
