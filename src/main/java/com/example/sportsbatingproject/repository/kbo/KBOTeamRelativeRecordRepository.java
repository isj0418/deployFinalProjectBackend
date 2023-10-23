package com.example.sportsbatingproject.repository.kbo;

import com.example.sportsbatingproject.repository.kbo.entity.KBOTeamRelativeRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBOTeamRelativeRecordRepository extends JpaRepository<KBOTeamRelativeRecordEntity, Long> {
}
