package agito.diarilala;

import java.time.Instant;
import lombok.*;

@Getter
@Setter
@ToString

public class Professor extends Person {
    private final String specialty;

    public Professor(int id, String firstName, String lastName, Instant birthDate, String email, String number, String specialty) {
        super(id, firstName, lastName, birthDate, email, number);
        this.specialty = specialty;
    }
}
