import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);

        nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Задание 2");
        System.out.println(task2(nums));
        System.out.println();

        String str = "one six two three two four five five. six seven eight two nine five ten";
        System.out.println("Задание 3");
        System.out.println(task3(str));
        System.out.println();

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println("Задание 4");
        System.out.println(task4(strings));
        System.out.println();

    }

    //Задание 1
    public static void task1(List<Integer> nums) {
        System.out.println("Задание 1");

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();
    }

    //Задание 2
    private static Set<Integer> task2(List<Integer> nums) {
        Set<Integer> values = new HashSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                values.add(num);
            }
        }
        return new TreeSet<>(values);
    }

    //Задание 3
    private static Set<String> task3(String str) {
        String string = str.replaceAll("[.,;:?!\\-_]", " ");

        Set<String> values = new HashSet<>(List.of(string.split(" +")));

        return values;
    }

    //Задание 4
    private static Map<String, Integer> task4(List<String> str) {
        Map<String, Integer> countDuplicate = new HashMap<>();
        for (String s : str) {
            if (!countDuplicate.containsKey(s)) {
                countDuplicate.put(s, 1);
            } else {
                countDuplicate.put(s, countDuplicate.get(s) + 1);
            }
        }
        return countDuplicate;
    }

}
