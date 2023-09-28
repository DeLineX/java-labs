import org.jetbrains.annotations.NotNull;

public class Employee {
    String name;
    @NotNull Department department;

    public Employee(String name, @NotNull Department department) {
        this.name = name;
        department.employers.add(this);
        this.department = department;
    }

    @Override
    public String toString() {
        if (this == department.chief) {
            return String.format("%s начальник отдела %s", name, department.name);
        }
        return String.format("%s работает в отделе %s", name, department.name);
    }
}
