import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonName implements Cloneable {
    String firstName, lastName, patronymic;

    public PersonName(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    @Override
    public PersonName clone() throws CloneNotSupportedException {
        return (PersonName) super.clone();
    }

    @Override
    public String toString() {
        return Stream.of(new String[]{firstName, lastName, patronymic})
                .filter(Objects::nonNull)
                .collect(Collectors.joining(" "));
    }
}
