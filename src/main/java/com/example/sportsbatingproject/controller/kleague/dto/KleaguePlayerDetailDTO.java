package com.example.sportsbatingproject.controller.kleague.dto;

import com.example.sportsbatingproject.repository.kleague.entity.KleaguePlayerDetailEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KleaguePlayerDetailDTO {
    private String k_league_player_id;
    private String player_name;
    private String player_team;
    private String player_position;
    private String player_number;
    private String player_nationality;
    private String player_height;
    private String player_weight;
    private String player_birthdate;
    public static  KleaguePlayerDetailDTO toKleaguePlayerDetailDTO(KleaguePlayerDetailEntity kleaguePlayerDetailEntity){
        KleaguePlayerDetailDTO kleaguePlayerDetailDTO = new KleaguePlayerDetailDTO();
        kleaguePlayerDetailDTO.setK_league_player_id(kleaguePlayerDetailEntity.getK_league_player_id());
        kleaguePlayerDetailDTO.setPlayer_name(kleaguePlayerDetailEntity.getPlayer_name());
        kleaguePlayerDetailDTO.setPlayer_team(kleaguePlayerDetailEntity.getPlayer_team());
        kleaguePlayerDetailDTO.setPlayer_position(kleaguePlayerDetailEntity.getPlayer_position());
        kleaguePlayerDetailDTO.setPlayer_number(kleaguePlayerDetailEntity.getPlayer_number());
        kleaguePlayerDetailDTO.setPlayer_nationality(kleaguePlayerDetailEntity.getPlayer_nationality());
        kleaguePlayerDetailDTO.setPlayer_height(kleaguePlayerDetailEntity.getPlayer_height());
        kleaguePlayerDetailDTO.setPlayer_weight(kleaguePlayerDetailEntity.getPlayer_weight());
        kleaguePlayerDetailDTO.setPlayer_birthdate(kleaguePlayerDetailEntity.getPlayer_birthdate());
        return kleaguePlayerDetailDTO;
    }
}
