package com.example.SpringPostgreapp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
public class IdentificativoPersonale  implements Serializable {
    @Id
    @Column(name = "codiceFiscale", nullable = false)
    private String codiceFiscale;

    @NotNull
    @Column(name = "country")
    private String country;


}
