package com.example.sportsbatingproject.repository.kbo;

import com.example.sportsbatingproject.repository.kbo.entity.KBOPitcherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBOPitcherRepository extends JpaRepository<KBOPitcherEntity, Long> {

}
