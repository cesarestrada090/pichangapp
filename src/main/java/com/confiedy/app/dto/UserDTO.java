package com.confiedy.app.dto;

public class UserDTO {

    private Long userId;
    private String username;
    private String email;
    // Otros campos según necesidad

    // Constructor por defecto
    public UserDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}