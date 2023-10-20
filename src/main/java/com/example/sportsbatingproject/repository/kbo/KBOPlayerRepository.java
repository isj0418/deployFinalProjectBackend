package com.example.sportsbatingproject.repository.kbo;

import com.example.sportsbatingproject.repository.kbo.entity.KBOPlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBOPlayerRepository extends JpaRepository<KBOPlayerEntity, Long> {
}
