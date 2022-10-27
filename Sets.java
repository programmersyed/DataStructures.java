import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Ball> Balls = new HashSet();
        Balls.add(new Ball("Blue"));
        Balls.add(new Ball("Blue"));
        Balls.add(new Ball("Red"));
        Balls.add(new Ball("Yellow"));
        Balls.remove(new Ball("Red"));
        Balls.forEach(System.out::println);
        System.out.println(Balls.size());
        Balls.remove(new Ball("Red"));
//If you want order to matter change it form Hashset to Treeset

    }
    record Ball(String color){

    }
}
