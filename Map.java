import java.util.HashMap;



public class Map {
    public static void main(String[] args) {
java.util.Map<Integer,Person> dora = new HashMap<>();
        dora.put(1,new Person("Alexa"));
        dora.put(2,new Person("Alexa"));
        dora.put(2,new Person( "alexander"));
        System.out.println(dora.size());
        System.out.println(dora.get(1));
        System.out.println(dora.containsKey(3));
        System.out.println(dora.entrySet());
        System.out.println(dora.keySet());
        System.out.println(dora);
        dora.entrySet().forEach(x -> System.out.println(x.getKey()+" "+x.getValue()));
        dora.remove(2);
        System.out.println(dora);
        System.out.println(dora.getOrDefault(4, new Person("Maryam")));


    }

    record Person (String name){

    }
}
