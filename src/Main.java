public class Main {
    public static void main(String[] args) {
//        PersonName nikita = new PersonName("Nikita", "Babaev", null);
//
//        Person person = new Person(new PersonName("Nikita", null, null), 14, new Person(new PersonName("Alexander", "Babaev", null), 43, null));
//
//        System.out.println(person);

//        Department markup = new Department("Вёрстка");
//
//        Employee nastya = new Employee("Настя", markup);
//        Employee nastya2 = new Employee("Настя", markup);
//        Employee andrew = new Employee("Андрей", markup);
//        markup.chief = nastya;
//
//        System.out.println(andrew);
//        System.out.println(nastya);
//        System.out.println(nastya2);
//        System.out.println(nastya2.department.employers.toString());

//        Student student1 = new Student("Вася", new ArrayList<>(List.of(1, 2, 3)));
//        Student student2 = new Student("Петр", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
//        student1.marks.set(0, 5);
//
//        System.out.println(student1);
//        System.out.println(student2);

//        Point start = new Point(1, 5);
//        Point end = new Point(5, 3);
//
//        Curve c1 = new Curve(new ArrayList<>(List.of(start, new Point(2, 8), end)));
//        Curve c2 = new Curve(new ArrayList<>(List.of(start, new Point(2, -5), new Point(4, -8), end)));
//
//        System.out.println(c1);
//        System.out.println(c2);
//
//        start.x = -2;
//
//        System.out.println(c1);
//        System.out.println(c2);

//        1.3.3
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");

        a.addPath(b, 5);
        a.addPath(d, 6);
        a.addPath(f, 1);

        b.addPath(a, 5);

        c.addPath(b, 3);
        c.addPath(d, 4);

        d.addPath(a, 6);
        d.addPath(c, 4);
        d.addPath(e, 2);

        e.addPath(f, 2);

        f.addPath(e, 2);
        f.addPath(b, 1);

        System.out.println(f);


    }
}