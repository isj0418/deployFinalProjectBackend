package com.example.sportsbatingproject.service.kleague;

import com.example.sportsbatingproject.controller.kleague.dto.KleaguePlayerDTO;
import com.example.sportsbatingproject.repository.kleague.KleaguePlayerRepository;
import com.example.sportsbatingproject.repository.kleague.entity.KleaguePlayerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class KleaguePlayerService {
    private final KleaguePlayerRepository kleaguePlayerRepository;
    public List<KleaguePlayerDTO> findAll() {
        List<KleaguePlayerEntity> kleaguePlayerEntityList = kleaguePlayerRepository.findAll();
        List<KleaguePlayerDTO> kleaguePlayerDTOList = new ArrayList<>() ;

        for(KleaguePlayerEntity kleaguePlayerEntity : kleaguePlayerEntityList) {
            kleaguePlayerDTOList.add(KleaguePlayerDTO.toKleaguePlayerDTO(kleaguePlayerEntity));
        }
        return kleaguePlayerDTOList;
    }


}
