package net.honux.login.web;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class User {


    @Id
    private Long id;

    private String email;

    private LocalDateTime createdDate = LocalDateTime.now();

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + email + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
