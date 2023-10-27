package com.example.sportsbatingproject.service.kleague;

import com.example.sportsbatingproject.controller.kleague.dto.KleagueTeamDTO;
import com.example.sportsbatingproject.repository.kleague.KleagueTeamRepository;
import com.example.sportsbatingproject.repository.kleague.entity.KleagueTeamEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class KleagueTeamService {
    private final KleagueTeamRepository kleagueTeamRepository;
    public List<KleagueTeamDTO> findAll() {
        List<KleagueTeamEntity> kleagueTeamEntityList = kleagueTeamRepository.findAll();
        List<KleagueTeamDTO> kleagueTeamDTOList = new ArrayList<>() ;

        for(KleagueTeamEntity kleagueTeamEntity : kleagueTeamEntityList) {
            kleagueTeamDTOList.add(KleagueTeamDTO.toKleagueDTO(kleagueTeamEntity));
        }
        return kleagueTeamDTOList;
    }
}
