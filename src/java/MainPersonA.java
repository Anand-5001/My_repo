public class MainPersonA {

    public static void main(String[] args){
        PersonA p = new PersonA();
        System.out.println("This is Person details");
        p.name="Anand";
        p.age=37;
        p.display();

        Student s = new Student();
        System.out.println("This is Student details");
        s.name="Hritik";
        s.age=9;
        s.grade='B';
        s.display();

        Teacher t = new Teacher();
        System.out.println("This is Teacher details");
        t.name="Sir";
        t.age=40;
        t.subject="java";
        t.display();

    }
}
