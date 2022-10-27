import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Lists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Red"));

        for (String color : colors){
            System.out.println("jerry");
        }
        colors.forEach(System.out::println);
    }
}



