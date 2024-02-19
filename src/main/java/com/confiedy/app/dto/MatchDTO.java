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


    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public TeamDTO getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamDTO homeTeam) {
        this.homeTeam = homeTeam;
    }

    public TeamDTO getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamDTO awayTeam) {
        this.awayTeam = awayTeam;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public LocalTime getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(LocalTime matchTime) {
        this.matchTime = matchTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public Integer getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(Integer awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }
}