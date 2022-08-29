package creazionali.converter;

import lombok.Data;

@Data
public class User {
    private String fullname;

    public User(String fullname) {
        this.fullname = fullname;
    }
}
