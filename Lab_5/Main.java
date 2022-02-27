package Lab_5;

import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 4, 4, 6);
        List<String> list1 = List.of("StarPlatinum", "Atum", "Anubis", "TheWorld", "HermitPurple");
        Collection<String> list3 = List.of("abstract", "string", "bool", "add", "exception");
        List<String> list4 = List.of("Geb", "Emperor", "Horus");
        int [] arr = {1, 2, 3, 4, 6, 2};
        int [] arr2 = {1, 3, 7, 9};

        System.out.println("-----------------Task 1-----------------");
        System.out.println(Tasks.task1(list));

        System.out.println("-----------------Task 2-----------------");
        System.out.println(Tasks.task2(list1));

        System.out.println("-----------------Task 3-----------------");
        System.out.println(Tasks.task3(list));

        System.out.println("-----------------Task 4-----------------");
        System.out.println(Tasks.task4(list3, "a"));

        System.out.println("-----------------Task 5-----------------");
        System.out.println(Tasks.task5(list));

        System.out.println("-----------------Task 6-----------------");
        System.out.print("Sum of even elements: ");
        System.out.println(Tasks.task6(arr));
        System.out.print("Sum of even elements(if there are no honest): ");
        System.out.println(Tasks.task6(arr2));

        System.out.println("-----------------Task 7-----------------");
        System.out.println(Tasks.task7(list4));
    }
}
