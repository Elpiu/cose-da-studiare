package creazionali.converter;

import lombok.Data;

@Data
public class UserDto {
    private String nome;
    private String cognome;

    public UserDto(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
}
