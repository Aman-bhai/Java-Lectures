package in.learning.java.lec8Collections.List;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(5);
        s.push(4);
        s.push(9);
        s.push(3);
        System.out.println("Print Stack Elements : "+s);
        s.pop();
        System.out.println("Print Stack Elements : "+s);
        System.out.println("Print Top Element of Stack : "+s.peek());
        System.out.println("Check Size of stack : "+s.size());
        System.out.println("Check Stack is Empty or Not : "+s.isEmpty());
        System.out.println("Search Element is stack : "+s.search(4));
    }
}
