package cobolTranslator;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class mapPeekPrac {
    public static void main(String[] args){
        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
            new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != 1)
                .peek(s -> System.out.printf("filename=%s%n", s))
                .map(s -> s.substring(s.indexOf('.')+1))
                .peek(s -> System.out.printf("extension=%s%n", s))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        // flatMap

        Stream<String[]> strArrStrm = Stream.of(
                new String[] {"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

//        Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not Ther is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" ")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);



    }
}
