package com.example.SpringPostgreapp.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;


@Data
@Entity
@Table(name = "employe")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(unique = true, length = 50)
    @Pattern(regexp = Regex.UserRegex, message = Regex.UserMessg)
    private String username;

    @Min(message = "Too jung for work", value = 16)
    @Column(nullable = true)
    @Max(message = "Too old for work", value = 90)
    private int age;

    @NotBlank(message = "Campo obbligatorio!")
    @Column(length = 30)
    private String fristname;

    @NotBlank(message = Regex.CampoMust)
    @Column(length = 30)
    private String lastname;

    @NotBlank(message = Regex.CampoMust)
    @Email
    private String email;

    @Column(name = "insert_ts")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date    insertTimestamp;

    @Column(name = "update_ts")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date    updateTimestamp;

    public Employe(String username, String fristname, String lastname, String email, int age) {
        this.username = username;
        this.fristname = fristname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    @SuppressWarnings("unused")
    @PrePersist
    private void onInsert() {
        this.insertTimestamp = new Date();
        this.updateTimestamp = this.insertTimestamp;
    }

    @SuppressWarnings("unused")
    @PreUpdate
    private void onUpdate() {
        this.updateTimestamp = new Date();
    }

    public Employe() {

    }
}
