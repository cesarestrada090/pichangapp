package com.confiedy.app.dto;

import java.time.LocalDateTime;
public class ParticipationConfirmationDTO {

    private Long confirmationId;
    private ChampionshipDTO championship;
    private TeamDTO team;
    private LocalDateTime confirmationDate;
    // Otros campos y relaciones


    public Long getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(Long confirmationId) {
        this.confirmationId = confirmationId;
    }

    public ChampionshipDTO getChampionship() {
        return championship;
    }

    public void setChampionship(ChampionshipDTO championship) {
        this.championship = championship;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public LocalDateTime getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(LocalDateTime confirmationDate) {
        this.confirmationDate = confirmationDate;
    }
}