import java.util.Collections;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами.Реализуйте метод,
// который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        LinkedList<Integer> reversedList = reverseList(list);
        System.out.println(reversedList);
    }

    public static LinkedList reverseList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}