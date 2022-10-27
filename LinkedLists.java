import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> note = new LinkedList<>();
        note.add(new Person("Romero", 14));
        note.add(new Person("Jose", 15));
        note.addFirst(new Person("yusha", 16));
        note.addLast(new Person("Abraham", 20));
        ListIterator<Person> personListIterator = note.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }
    static record Person(String name, int age){

    }
}
