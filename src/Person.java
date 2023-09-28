public class Person {
    Person father;
    PersonName fullName;
    int age;

    public Person(PersonName fullName, int age, Person father) {
        this.fullName = fullName;
        this.age = age;
        this.father = father;
    }

    @Override
    public String toString() {
        PersonName personName;
        try {
            personName = fullName.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        if (fullName.lastName == null) {
            personName.lastName = father.fullName.lastName;
        }

        if (fullName.patronymic == null) {
            personName.patronymic = father.fullName.firstName + "ович";
        }

        return personName.toString();
    }
}
