package com.example.sportsbatingproject.service.kbo;

import com.example.sportsbatingproject.controller.kbo.dto.KBOTeamDTO;
import com.example.sportsbatingproject.controller.kbo.dto.KBOTeamRelativeRecordDTO;
import com.example.sportsbatingproject.repository.kbo.entity.KBOTeamEntity;
import com.example.sportsbatingproject.repository.kbo.entity.KBOTeamRelativeRecordEntity;
import com.example.sportsbatingproject.repository.kbo.KBOTeamRelativeRecordRepository;
import com.example.sportsbatingproject.repository.kbo.KBOTeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class KBOTeamService {
    private final KBOTeamRepository kboTeamRepository;
    private final KBOTeamRelativeRecordRepository kboTeamRelativeRecordRepository;

    public List<KBOTeamDTO> findRankAll() {
        List<KBOTeamEntity> kboTeamEntityList = kboTeamRepository.findAll();
        List<KBOTeamDTO> kboTeamDTOList = new ArrayList<>();
        for (KBOTeamEntity kboTeamEntity : kboTeamEntityList) {
            kboTeamDTOList.add(KBOTeamDTO.toKBOTeamDTO(kboTeamEntity));
        }
        return kboTeamDTOList;
    }

    public List<KBOTeamRelativeRecordDTO> findRecordAll(){
        List<KBOTeamRelativeRecordEntity> kboTeamRelativeRecordEntityList = kboTeamRelativeRecordRepository.findAll();
        List<KBOTeamRelativeRecordDTO> kboTeamRelativeRecordDTOList = new ArrayList<>();
        for(KBOTeamRelativeRecordEntity kboTeamRelativeRecordEntity : kboTeamRelativeRecordEntityList){
            kboTeamRelativeRecordDTOList.add(KBOTeamRelativeRecordDTO.toKBOTeamRelativeRecordDTO(kboTeamRelativeRecordEntity));
        }
        return kboTeamRelativeRecordDTOList;
    }
}
