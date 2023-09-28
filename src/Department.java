import java.util.ArrayList;
import java.util.List;

public class Department {
    final List<Employee> employers = new ArrayList<>();
    String name;
    Employee chief;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Отдел %s, начальник %s", name, chief.name);
    }
}
