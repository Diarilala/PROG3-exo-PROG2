package agito.diarilala;


import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Person {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final Instant birthDate;
    private final String email;
    private final String number;
}
