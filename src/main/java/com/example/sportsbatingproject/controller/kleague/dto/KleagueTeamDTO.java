package com.example.sportsbatingproject.controller.kleague.dto;

import com.example.sportsbatingproject.repository.kleague.entity.KleagueTeamEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KleagueTeamDTO {
    private long k_Team_Id;
    private String k_league_Ranking;
    private String k_league_club_Name;
    private String k_league_club_Game;
    private String k_league_Win_Point;
    private String k_league_Win;
    private String k_league_Draw;
    private String k_league_Lose;
    private String k_league_Score;
    private String k_league_Lose_Score;
    private String k_league_Gainor_Loss;
    private String k_league_recent ;
    public static KleagueTeamDTO toKleagueDTO(KleagueTeamEntity kleagueTeamEntity) {
        KleagueTeamDTO kleagueTeamDTO = new KleagueTeamDTO();
        kleagueTeamDTO.setK_Team_Id(kleagueTeamEntity.getK_Team_Id());
        kleagueTeamDTO.setK_league_Ranking(kleagueTeamEntity.getK_league_Ranking());
        kleagueTeamDTO.setK_league_club_Name(kleagueTeamEntity.getK_league_club_Name());
        kleagueTeamDTO.setK_league_club_Game(kleagueTeamEntity.getK_league_club_Game());
        kleagueTeamDTO.setK_league_Win_Point(kleagueTeamEntity.getK_league_Win_Point());
        kleagueTeamDTO.setK_league_Win(kleagueTeamEntity.getK_league_Win());
        kleagueTeamDTO.setK_league_Draw(kleagueTeamEntity.getK_league_Draw());
        kleagueTeamDTO.setK_league_Lose(kleagueTeamEntity.getK_league_Lose());
        kleagueTeamDTO.setK_league_Score(kleagueTeamEntity.getK_league_Score());
        kleagueTeamDTO.setK_league_Lose_Score(kleagueTeamEntity.getK_league_Lose_Score());
        kleagueTeamDTO.setK_league_Gainor_Loss(kleagueTeamEntity.getK_league_Gainor_Loss());
        kleagueTeamDTO.setK_league_recent(kleagueTeamEntity.getK_league_recent());

        return kleagueTeamDTO;
    }

}
