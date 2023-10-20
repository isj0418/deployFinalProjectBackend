package com.example.sportsbatingproject.repository.kleague.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "K_league_Team")
public class KleagueTeamEntity {
    @Id
    private long k_Team_Id;
    @Column
    private String k_league_Ranking;
    @Column
    private String k_league_club_Name;
    @Column
    private String k_league_club_Game;
    @Column
    private String k_league_Win_Point;
    @Column
    private String k_league_Win;
    @Column
    private String k_league_Draw;
    @Column
    private String k_league_Lose;
    @Column
    private String k_league_Score;
    @Column
    private String k_league_Lose_Score;
    @Column
    private String k_league_Gainor_Loss;
    @Column
    private String k_league_recent ;
}
