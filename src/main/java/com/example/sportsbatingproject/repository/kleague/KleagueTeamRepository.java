package com.example.sportsbatingproject.repository.kleague;

import com.example.sportsbatingproject.repository.kleague.entity.KleagueTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KleagueTeamRepository extends JpaRepository<KleagueTeamEntity, Long> {
}
