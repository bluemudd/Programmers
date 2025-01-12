package cobolTranslator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMidCal {
    public static void main(String[] args){
        /*문제 1: 필터링
        다음 List<Integer>에서 짝수만 필터링하고, 결과를 출력하는 Stream 연산을 작성하세요.*/
        System.out.println("-----------1");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .filter(a -> a%2 == 0)
                .forEach(System.out::print);
        System.out.println();
        /*문제 2: 매핑
        다음 List<String>에 있는 모든 문자열을 대문자로 변환하고, 결과를 출력하는 Stream 연산을 작성하세요.*/
        System.out.println("-----------2");
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        String a = "apple";
        words.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        /*문제 3: 정렬
        다음 List<Integer>를 오름차순으로 정렬한 후, 상위 5개의 값을 출력하는 Stream 연산을 작성하세요.*/
        System.out.println("-----------3");
        List<Integer> numbers3 = Arrays.asList(42, 23, 67, 12, 9, 50, 30, 80, 5);
        numbers3.stream()
                .sorted()
                .forEach(System.out::println);
        /*문제 4: 중복 제거
        다음 List<Integer>에서 중복된 숫자를 제거한 후, 결과를 출력하는 Stream 연산을 작성하세요.*/
        System.out.println("-----------4");
        List<Integer> numbers4 = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);
        numbers4.stream()
                .distinct()
                .forEach(System.out::println);
        /*문제 5: 평면화
        다음 List<List<String>>을 평면화하여 단일 List<String>으로 만들고, 결과를 출력하는 Stream 연산을 작성하세요.*/
        System.out.println("------------5");
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );
        nestedList.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);



    }
}
