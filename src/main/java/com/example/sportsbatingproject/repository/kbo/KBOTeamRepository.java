package com.example.sportsbatingproject.repository.kbo;

import com.example.sportsbatingproject.repository.kbo.entity.KBOTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBOTeamRepository extends JpaRepository<KBOTeamEntity, Long> {
}
