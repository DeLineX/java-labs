import java.util.ArrayList;

public class Student {
    ArrayList<Integer> marks;
    String name;

    public Student(String name, ArrayList<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, marks);
    }
}
