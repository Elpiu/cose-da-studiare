package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import static model.Regex.*;



@Data
@Entity
@Table(name = "employe")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(unique = true, length = 50)
    @Pattern(regexp = UserRegex, message = UserMessg)
    private String username;

    @NotBlank(message = CampoMust)
    @Column(length = 30)
    private String fristname;

    @NotBlank(message = CampoMust)
    @Column(length = 30)
    private String lastname;

    @NotBlank(message = CampoMust)
    @Email
    private String email;

    public Employe(String username, String fristname, String lastname, String email) {
        this.username = username;
        this.fristname = fristname;
        this.lastname = lastname;
        this.email = email;
    }

    public Employe() {

    }
}
