package in.learning.java.lec8Collections.wrapperClasses;

public class wrapperClass {
    public static void main(String[] args) {
        Integer first=Integer.valueOf(5);
        Integer second=Integer.valueOf("5");
        Integer third=55;
        System.out.println(first.toString());

        System.out.println("Type: " + first.getClass().getName());
        System.out.println("Type: " + second.getClass().getName());
        System.out.println("Type: " + third.getClass().getName());

        String s=String.valueOf(first);

        System.out.println("Type: " + s.getClass().getName());
        System.out.println("value : " + s);



    }
}
