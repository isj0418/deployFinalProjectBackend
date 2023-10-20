package com.example.sportsbatingproject.repository.kleague;

import com.example.sportsbatingproject.repository.kleague.entity.KleaguePlayerDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KleaguePlayerDetailRepository extends JpaRepository<KleaguePlayerDetailEntity , String> {
}
