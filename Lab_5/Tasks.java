package Lab_5;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    public static double task1(List<Integer> list)
    {
        return list
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
    }

    public static List<String> task2(List<String> list)
    {
        return list
                .stream()
                .map(s -> s = "_new_" + s.toUpperCase(Locale.ENGLISH))
                .toList();
    }

    public static List<Integer> task3(List<Integer> list)
    {
        return list
                .stream()
                .filter(n -> Collections.frequency(list, n) == 1)
                .map(n -> n * n)
                .toList();

    }

    public static List<String> task4(Collection<String> list, String first)
    {
        return list
                .stream()
                .filter(n -> n.startsWith(first))
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
    }

    public static <T> T task5(Collection<T> list)
    {
        return list
                .stream()
                .skip(list.size() - 1)
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("Collection is empty"));
    }

    public static int task6(int[] array)
    {
        return Arrays
                .stream(array)
                .filter(x -> x % 2 ==0 )
                .sum();

    }

    public static Map<Character, String> task7(List<String> list)
    {
        return list
                .stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toMap(s -> s.charAt(0), s -> s.substring(1)));

    }
}


