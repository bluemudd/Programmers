package StreamExc;
import java.util.*;
import java.io.*;
import java.util.stream.*;


public class StreamMidePrac1 {
    public static void main(String[] args){
//        /*문제 1: 스트림 자르기
//        주어진 정수 리스트에서 앞에서 3개를 건너뛰고, 그 이후 5개의 숫자만 추출하여 새로운 리스트로 반환하세요.*/
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> numberStream = numbers.stream().skip(3).limit(5)
//                                            .collect(Collectors.toList());
//        System.out.println(numberStream);
//
//        /*문제 2: 스트림 요소 걸러내기
//        주어진 문자열 리스트에서 길이가 4 이상인 문자열만 필터링하고, 중복된 값을 제거하여 새로운 리스트로 반환하세요.*/
//        List<String> words = Arrays.asList("java", "stream", "api", "java", "filter", "code");
//        List<String> wordStream = words.stream()
//                                        .filter(a -> a.length() >= 4)
//                                        .distinct()
//                                        .collect(Collectors.toList());
//        System.out.println(wordStream);
//
//        /*문제 3: 스트림 정렬하기
//        주어진 문자열 리스트를 알파벳 순서로 정렬하고, 그 결과를 반환하세요.*/
//        List<String> words3 = Arrays.asList("banana", "apple", "cherry", "date");
//        List<String> words3Stream = words3.stream().sorted(Comparator.comparing(s -> s.charAt(0)))
//                .collect(Collectors.toList());
//        System.out.println(words3Stream);
//
//        /*문제 4: Comparator의 comparing() 사용
//        주어진 학생 객체 리스트에서 학생들의 점수를 기준으로 오름차순 정렬한 결과를 반환하세요.*/
//        List<Student> students = Arrays.asList(
//                new Student("Alice", 85),
//                new Student("Bob", 75),
//                new Student("Charlie", 95)
//        );
//        List<Student> studentStream = students.stream().sorted(Comparator.comparing(s -> s.score)).collect(Collectors.toList());
//        System.out.println(studentStream);
//
//        /*문제 5: 스트림의 요소 변환
//        주어진 정수 리스트의 모든 숫자에 2를 곱한 결과를 새로운 리스트로 반환하세요.*/
//        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> studentStream2 = numbers5.stream().map(s -> s= s*2).collect(Collectors.toList());
//        System.out.println(studentStream2);
//
//
//        /*문제 6: 스트림의 요소를 소비하지 않고 엿보기
//        주어진 정수 리스트에서 짝수만 필터링하되, 필터링 중간에 각 요소를 출력하는 디버깅 코드를 추가하세요. 최종 결과는 짝수들로 이루어진 리스트여야 합니다.*/
//
//        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> numbers6Stream = numbers6.stream().filter(s -> s%2 == 0).peek(System.out::println).toList();
//        System.out.println(numbers6Stream);
//
//        /*문제 7: flatMap() 사용
//        주어진 리스트 안의 리스트를 평면화하여 하나의 리스트로 반환하세요.*/
//        List<List<String>> nestedList = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"), Arrays.asList("E"));
//        List<String> numbers7Stream = nestedList
//                .stream()
//                .flatMap(a -> a.stream())
//                        .collect(Collectors.toList());
//        System.out.println(numbers7Stream);
//
//        //문제 1: 숫자 리스트의 짝수만 필터링하고, 각 짝수에 2를 곱한 후 합을 구하세요.
//
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int sum = 0 ;
//        sum = nums.stream().filter(x -> x % 2 == 0)
//                .map(n -> n*2)
//                .reduce(0, Integer::sum);
//
//        // 문제 2: 주어진 문자열 리스트에서 각 문자열의 길이가 5 이상인 문자열만 필터링하고, 대문자로 변환하여 출력하세요.
//        List<String> word = Arrays.asList("apple", "banana", "cherry", "date", "kiwi");
//
//        word.stream()
//                .filter(a -> a.length() >= 5)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//
//        //문제 3: 주어진 숫자 리스트에서 서로 다른 숫자들의 평균을 구하세요.
//        List<Integer> number3 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//
//        OptionalDouble avg = number3.stream()
//                .distinct()
//                .mapToInt(Integer::intValue)
//                .average();


    }
    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return name + ": " + score;
        }
    }
}
