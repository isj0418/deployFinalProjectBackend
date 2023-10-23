package com.example.sportsbatingproject.repository.kleague;

import com.example.sportsbatingproject.repository.kleague.entity.KleaguePlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KleaguePlayerRepository extends JpaRepository<KleaguePlayerEntity, String> {
}
