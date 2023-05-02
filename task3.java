// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
// Используйте итератор

import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int sum = getSum(list);
        System.out.println(sum);
    }

    public static int getSum(LinkedList<Integer> list) {
        int sum = 0;
        for (int i = 0; i <= list.size(); i++) {
            sum += i;
        }
        return sum;
    }
}
