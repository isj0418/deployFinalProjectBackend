package com.example.sportsbatingproject.repository.kbo;

import com.example.sportsbatingproject.repository.kbo.entity.KBOHitterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBOHitterRepository extends JpaRepository<KBOHitterEntity, Long> {
}
