package com.example.sportsbatingproject.service.kleague;

import com.example.sportsbatingproject.controller.kleague.dto.KleaguePlayerDetailDTO;
import com.example.sportsbatingproject.repository.kleague.KleaguePlayerDetailRepository;
import com.example.sportsbatingproject.repository.kleague.entity.KleaguePlayerDetailEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class KleaguePlayerDetailService {
    private final KleaguePlayerDetailRepository kleaguePlayerDetailRepository;
    @Transactional
    public KleaguePlayerDetailDTO findById(String kLeaguePlayerId) {
        Optional<KleaguePlayerDetailEntity> optionalEntity =kleaguePlayerDetailRepository.findById(kLeaguePlayerId);
        if(optionalEntity.isPresent()) {
            KleaguePlayerDetailEntity kleaguePlayerDetailEntity = optionalEntity.get();
            KleaguePlayerDetailDTO kleaguePlayerDetailDTO  = KleaguePlayerDetailDTO.toKleaguePlayerDetailDTO(kleaguePlayerDetailEntity);
            return kleaguePlayerDetailDTO;
        } else {
            return null ;
        }
    }

}
