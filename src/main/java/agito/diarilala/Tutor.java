package agito.diarilala;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@ToString

public class Tutor extends Person{
    private final String relationshipNature;

    public Tutor(int id, String firstName, String lastName, Instant birthDate , String email, String number, String relationshipNature) {
        super(id, firstName, lastName, birthDate, email, number);
        this.relationshipNature = relationshipNature;
    }
}
