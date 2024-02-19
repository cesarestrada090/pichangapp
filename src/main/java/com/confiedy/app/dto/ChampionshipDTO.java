package com.confiedy.app.dto;

import java.time.LocalDate;

public class ChampionshipDTO {

    private Long championshipId;
    private String championshipName;
    private UserDTO captain;
    private LocalDate championshipDate;
    // Otros campos y relaciones


    public Long getChampionshipId() {
        return championshipId;
    }

    public void setChampionshipId(Long championshipId) {
        this.championshipId = championshipId;
    }

    public String getChampionshipName() {
        return championshipName;
    }

    public void setChampionshipName(String championshipName) {
        this.championshipName = championshipName;
    }

    public UserDTO getCaptain() {
        return captain;
    }

    public void setCaptain(UserDTO captain) {
        this.captain = captain;
    }

    public LocalDate getChampionshipDate() {
        return championshipDate;
    }

    public void setChampionshipDate(LocalDate championshipDate) {
        this.championshipDate = championshipDate;
    }
}
