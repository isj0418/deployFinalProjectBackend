package com.example.sportsbatingproject.controller.kleague.dto;

import com.example.sportsbatingproject.repository.kleague.entity.KleaguePlayerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class KleaguePlayerDTO {
    private String k_league_player_id;
    private String k_league_player_team;
    private String k_league_player_name;
    private String k_league_player_num;
    private String k_league_player_img_url ;
    public static KleaguePlayerDTO toKleaguePlayerDTO(KleaguePlayerEntity kleaguePlayerEntity) {
        KleaguePlayerDTO kleaguePlayerDTO = new KleaguePlayerDTO();
        kleaguePlayerDTO.setK_league_player_id(kleaguePlayerEntity.getK_league_player_id());
        kleaguePlayerDTO.setK_league_player_name(kleaguePlayerEntity.getK_league_player_name());
        kleaguePlayerDTO.setK_league_player_team(kleaguePlayerEntity.getK_league_player_team());
        kleaguePlayerDTO.setK_league_player_img_url(kleaguePlayerEntity.getK_league_player_img_url());
        kleaguePlayerDTO.setK_league_player_num(kleaguePlayerEntity.getK_league_player_num());

        return kleaguePlayerDTO;
    }
}
