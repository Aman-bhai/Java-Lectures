package in.learning.java.lec8Collections.List;

import java.util.Arrays;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> vec1=new Vector<>();
        System.out.println("Intially Capacity of Vector1 : "+ vec1.capacity());
        Vector<Integer> vec2=new Vector<>(5);
        vec2.add(5);
        vec2.add(7);
        vec2.add(9);
        vec2.add(1);
        vec2.add(4);
        System.out.println("Capacity of Vector2 : "+ vec2.capacity());
        vec2.add(0);
        System.out.println("Capacity of Vector2 : "+ vec2.capacity());

        Vector<Integer> vec3=new Vector<>(5,3);
        vec3.add(5);
        vec3.add(7);
        vec3.add(9);
        vec3.add(1);
        vec3.add(4);
        System.out.println("Capacity of Vector3 : "+ vec3.capacity());
        vec3.add(0);
        System.out.println("Capacity of Vector3 increment : "+ vec3.capacity());

        Vector<Integer>vecc=new Vector<>(Arrays.asList(1,3,4,56,6));
        System.out.println("Vector creating using ArrayList : "+vecc);

    }
}
