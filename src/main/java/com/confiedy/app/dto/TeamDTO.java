package com.confiedy.app.dto;

import com.confiedy.app.entities.Usuario;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link Usuario}
 */

public class TeamDTO {

    private Long teamId;
    private String teamName;
    private String country;
    // Otros campos y relaciones


    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
