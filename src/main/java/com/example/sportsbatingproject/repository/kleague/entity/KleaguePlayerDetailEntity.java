package com.example.sportsbatingproject.repository.kleague.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "k_league_player_detail")
public class KleaguePlayerDetailEntity {
    @Id
    private String k_league_player_id;
    @Column
    private String player_name;
    @Column
    private String player_team;
    @Column
    private String player_position;
    @Column
    private String player_number;
    @Column
    private String player_nationality;
    @Column
    private String player_height;
    @Column
    private String player_weight;
    @Column
    private String player_birthdate;



}
