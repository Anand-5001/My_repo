

public class Child extends Parent {


    public static void main(String[] args){
        Parent c=new Parent();
        System.out.println("Constructor with no arguments");

        System.out.println("Constructor with two arguments as follows");
        Parent d=new Parent(13,"Hritik");
        System.out.println("age"+" : "+d.age+" - "+"Name"+" : "+d.name);

        System.out.println("Constructor with three arguments as follows");
        Parent e=new Parent(37,"Anand","M");
        System.out.println("age"+" : "+e.age+" - "+"Name"+" : "+e.name+" - "+"gender"+" : "+e.gender);



    }
}
