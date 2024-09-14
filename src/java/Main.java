import org.w3c.dom.ls.LSOutput;

public class Main{

    public static void main(String[] arguments) {
        Person p = new Person("Anand", 36, "M");

        System.out.println(p.getName() + " : " + p.getAge() + " : " + p.getGender());
        //
        Person p1 = new Person("Hritik", 9, "NA");
        System.out.println(p1.getName() + " : " + p1.getAge() + " : " + p1.getGender());

        //
        Person p2 = new Person("Ram");
        System.out.println(p2.getName());
        p2.setAge(28);
        System.out.println(p2.getName() + " : " + p2.getAge());
    }
}