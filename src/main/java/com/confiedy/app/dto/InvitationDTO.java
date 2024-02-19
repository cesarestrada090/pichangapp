package com.confiedy.app.dto;

public class InvitationDTO {

    private Long invitationId;
    private UserDTO inviter;
    private String email;
    // Otros campos y relaciones


    public Long getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(Long invitationId) {
        this.invitationId = invitationId;
    }

    public UserDTO getInviter() {
        return inviter;
    }

    public void setInviter(UserDTO inviter) {
        this.inviter = inviter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}