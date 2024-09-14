public class Demo{
        public static void main(String[] args) {
                String A1 = "Hello World";
                String A2 = "anandparamaje@gmail.com";

                System.out.println(A1 == A2); // true
                System.out.println(A1.toLowerCase()); // hello world
                System.out.println(A1.toUpperCase()); // HELLO WORLD
                System.out.println(+A1.length()); // 11
                System.out.println(A1.concat(" Morning")); //Hello World Morning
                System.out.println(A1.charAt(0)); //H
                System.out.println(A1.equals("Hello World")); //true
                System.out.println(A1.contains("W")); // true
                System.out.println(A1.indexOf('o')); //4
                System.out.println(A1.replaceAll("World","Guys")); // Hello Guys

        }


}