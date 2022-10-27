import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<Integer> first = new Stack<>();
        first.push(2);
        first.push(3);
        first.push(4);
        System.out.println(first.peek());
        System.out.println(first.size());
        System.out.println(first.pop());
        System.out.println(first.size());
        System.out.println(first.empty());
        System.out.println(first.firstElement());
    }
}
