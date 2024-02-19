package com.confiedy.app.dto;

public class PlayerRatingDTO {

    private Long ratingId;
    private MatchDTO match;
    private UserDTO user;
    private TeamDTO team;
    private UserDTO ratedPlayer;
    private Double ratingStrength;
    private Double ratingSpeed;
    private Double ratingTechnique;
    private Double ratingDefense;
    private Double ratingFinishing;
    // Otros campos y relaciones


    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public MatchDTO getMatch() {
        return match;
    }

    public void setMatch(MatchDTO match) {
        this.match = match;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public UserDTO getRatedPlayer() {
        return ratedPlayer;
    }

    public void setRatedPlayer(UserDTO ratedPlayer) {
        this.ratedPlayer = ratedPlayer;
    }

    public Double getRatingStrength() {
        return ratingStrength;
    }

    public void setRatingStrength(Double ratingStrength) {
        this.ratingStrength = ratingStrength;
    }

    public Double getRatingSpeed() {
        return ratingSpeed;
    }

    public void setRatingSpeed(Double ratingSpeed) {
        this.ratingSpeed = ratingSpeed;
    }

    public Double getRatingTechnique() {
        return ratingTechnique;
    }

    public void setRatingTechnique(Double ratingTechnique) {
        this.ratingTechnique = ratingTechnique;
    }

    public Double getRatingDefense() {
        return ratingDefense;
    }

    public void setRatingDefense(Double ratingDefense) {
        this.ratingDefense = ratingDefense;
    }

    public Double getRatingFinishing() {
        return ratingFinishing;
    }

    public void setRatingFinishing(Double ratingFinishing) {
        this.ratingFinishing = ratingFinishing;
    }
}