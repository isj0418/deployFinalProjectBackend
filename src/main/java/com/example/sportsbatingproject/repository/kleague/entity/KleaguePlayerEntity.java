package com.example.sportsbatingproject.repository.kleague.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "K_League_Player")
public class KleaguePlayerEntity {
    @Id
    private String k_league_player_id;
    @Column
    private String k_league_player_team;
    @Column
    private String k_league_player_name;
    @Column
    private String k_league_player_num;
    @Column
    private String k_league_player_img_url ;

}
