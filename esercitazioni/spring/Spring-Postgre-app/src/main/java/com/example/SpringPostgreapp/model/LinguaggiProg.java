package com.example.SpringPostgreapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "linguaggi_prog")
public class LinguaggiProg {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "linguaggio", nullable = false)
    private String nomeLinguaggio;


}