package com.example.sportsbatingproject.service.kbo;

import com.example.sportsbatingproject.controller.kbo.dto.KBOHitterDTO;
import com.example.sportsbatingproject.controller.kbo.dto.KBOPitcherDTO;
import com.example.sportsbatingproject.controller.kbo.dto.KBOPlayerDTO;
import com.example.sportsbatingproject.repository.kbo.entity.KBOHitterEntity;
import com.example.sportsbatingproject.repository.kbo.entity.KBOPitcherEntity;
import com.example.sportsbatingproject.repository.kbo.entity.KBOPlayerEntity;
import com.example.sportsbatingproject.repository.kbo.KBOHitterRepository;
import com.example.sportsbatingproject.repository.kbo.KBOPitcherRepository;
import com.example.sportsbatingproject.repository.kbo.KBOPlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KBOPlayerService {
    private final KBOPlayerRepository kboPlayerRepository;
    private final KBOPitcherRepository kboPitcherRepository;
    private final KBOHitterRepository kboHitterRepository;

    public List<KBOPlayerDTO> findAllPlayers() {
        List<KBOPlayerEntity> kboPlayerEntities = kboPlayerRepository.findAll();
        List<KBOPlayerDTO> kboPlayerDTOList = new ArrayList<>();
        for (KBOPlayerEntity kboPlayerEntity : kboPlayerEntities) {
            kboPlayerDTOList.add(KBOPlayerDTO.toKBOPlayerDTO(kboPlayerEntity));
        }
        return kboPlayerDTOList;
    }

    public KBOPitcherDTO findPitcher(Long playerId) {
        Optional<KBOPitcherEntity> kboPitcherEntity = kboPitcherRepository.findById(playerId);
        KBOPitcherDTO kboPitcherDTO = new KBOPitcherDTO();
        if( kboPitcherEntity.isPresent()){
            kboPitcherDTO = KBOPitcherDTO.toKBOPitcherDTO(kboPitcherEntity.get());
        }
        return kboPitcherDTO;
    }

    public KBOHitterDTO findHitter(Long playerId) {
        Optional<KBOHitterEntity> kboHitterEntity = kboHitterRepository.findById(playerId);
        KBOHitterDTO kboHitterDTO = new KBOHitterDTO();
        if ( kboHitterEntity.isPresent()){
            kboHitterDTO = KBOHitterDTO.toKBOHitterDTO(kboHitterEntity.get());
        }
        return kboHitterDTO;
    }
}
