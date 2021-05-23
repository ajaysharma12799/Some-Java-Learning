package CollectionFramework;

import java.util.Stack;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.add(1);
        stack.add(3);
        stack.add(5);
        stack.add(2);
        stack.add(8);

        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search(8));

        System.out.print("Stack Element : ");
        for(Integer element : stack) {
            System.out.print(element + " ");
        }
    }
}
