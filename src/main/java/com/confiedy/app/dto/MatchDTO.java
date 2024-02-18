package com.confiedy.app.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class MatchDTO {

    private Long matchId;
    private TeamDTO homeTeam;
    private TeamDTO awayTeam;
    private LocalDate matchDate;
    private LocalTime matchTime;
    private String location;
    private Integer homeTeamScore;
    private Integer awayTeamScore;
    // Otros campos y relaciones

    // Constructor por defecto, getters y setters
}