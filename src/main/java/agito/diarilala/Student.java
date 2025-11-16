package agito.diarilala;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString

public class Student extends Person{
    private final String group;
    private final String tutor;

    public Student(int id, String firstName, String lastName, Instant birthDate, String email, String number, String group, String tutor) {
        super(id, firstName, lastName, birthDate, email, number);
        this.group = group;
        this.tutor = tutor;
    }
}
