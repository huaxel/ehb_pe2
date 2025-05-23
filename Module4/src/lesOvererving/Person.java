package lesOvererving;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

    public Person(LocalDate dateOfBirth, String name) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
