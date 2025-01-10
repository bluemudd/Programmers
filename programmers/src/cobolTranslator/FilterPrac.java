package cobolTranslator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterPrac {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(numbers).filter(i -> i % 2 == 0).forEach(System.out::println);

        String [] words = {"apple", "bat", "cat", "dog", "elephant", "fox"};

        Stream<String> stringStream = Stream.of(words).filter(i -> i.length() < 4);
        stringStream.forEach(System.out::println);

        String[] names = {"Alice", "bob", "Charlie", "david", "Eve"};

        Stream<String> stringStream1 = Stream.of(names)
                .filter(i -> Character.isUpperCase(i.charAt(0)));
        stringStream1.forEach(System.out::println);


        List<Integer> numbers1 = Arrays.asList(5, 12, 19, 25, 30, 35, 40);
        numbers1 = numbers1.stream().filter(i -> i>= 10 && i <= 30).toList();
        numbers1.stream().forEach(System.out::println);



    }
}
