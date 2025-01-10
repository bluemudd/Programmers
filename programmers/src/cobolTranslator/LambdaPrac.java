package cobolTranslator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaPrac {
    public static void main(String[] args){
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        Arrays.stream(numbers).map(number -> number * 2)
//                .forEach(System.out::println);
//
//        List<String> words =
//                Arrays.asList("apple", "car", "java", "code", "dog");
//        words.stream().filter(word -> word.length() >= 4)
//                .forEach(System.out::println);
//
//        List<User> users = Arrays.asList(
//                new User("Alice", 30),
//                new User("Bob", 25),
//                new User("Charlie", 35)
//        );
//        users.stream()
//            .sorted((h1, h2) -> h2.age - h1.age)
//                .forEach((i) ->System.out.print(i.name+" "));
//
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        Stream<Integer> intStream = list.stream();
//        intStream.forEach(System.out::print);
//
//        intStream = list.stream();
//        intStream.forEach(System.out::print);
//
//        System.out.println();
//        Stream<String> strStream = Stream.of("a","b","c");
//        strStream.forEach(System.out::print);
//
//        System.out.println();
//        Stream<String> strStream2 = Stream.of(new String[] {"d","e","f"});
//        strStream2.forEach(System.out::print);
//
//        System.out.println();
//        String[] stringArray = new String[] {"g","h","i"};
//        Stream<String> strStream3 = Stream.of(stringArray);
//        strStream3.forEach(System.out::print);
//
//        int[] intArr = {1,2,3,4,5};
//        IntStream intStream1 = Arrays.stream(intArr);
//        DoubleStream intStream2 = Arrays.stream(intArr).asDoubleStream();
//        System.out.println("count="+intStream1.sum());
//        System.out.println("avg="+intStream2.average());
//

//        IntStream intStream = new Random().ints();
//            intStream.limit(5).forEach(System.out::println);
//        IntStream intStream2 = new Random().ints(10,5,10);
//            intStream2.forEach(System.out::println);


       Stream<Integer> intStream = Stream.iterate(1, n -> n+2);
        intStream.limit(10).forEach(System.out::println);

        Stream<Integer> oneStream = Stream.generate(()->1);
        oneStream.limit(10).forEach(System.out::println);

    }
}
class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
