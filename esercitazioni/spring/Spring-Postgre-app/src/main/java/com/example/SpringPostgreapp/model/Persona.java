package com.example.SpringPostgreapp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Data
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cf_persona", referencedColumnName = "codiceFiscale", unique = true)
    private IdentificativoPersonale identificativoPersonale;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "data_nascita")
    private Date dataNascita;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "persona_know_lenguage",
        joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "lenguage_id")
    )
    private List<LinguaggiProg> linguaggiProgs = new ArrayList<>();


}
