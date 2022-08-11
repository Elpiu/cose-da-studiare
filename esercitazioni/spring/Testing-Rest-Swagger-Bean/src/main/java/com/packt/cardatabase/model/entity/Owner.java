package com.packt.cardatabase.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Owner {
    @OneToMany(cascade = CascadeType.ALL, mappedBy="owner")
    @JsonIgnore
    private List<Car> cars;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerId;
    private String firstname, lastname;

    public Owner(){}

    public Owner( String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
