package cobolTranslator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortExc {
    public static void main(String[] args){
        Stream<Person> people = Stream.of(
                new Person("박정민", "책임", 3300),
                new Person("김찬우", "책임", 3500),
                new Person("이성진", "대리", 4000),
                new Person("임성은", "대리", 3700),
                new Person("남성현", "팀장", 5000)
        );

//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if(o1.age > o2.age){
//                    return -1;
//                }
//                else if(o1.age < o2.age){
//                    return 1;
//                }
//                else{
//                    if(o1.salary > o2.salary){
//                        return -1;
//                    }
//                    else if(o1.salary < o2.salary){
//                        return 1;
//                    }
//                }
//                return 0;
//            }
//        });
//
//        for(int i = 0; i<people.length; i++){
//            System.out.println(people[i].name);
//        }
//        people.sorted(Comparator.comparing(Person::getPosition).reversed()
        people.sorted(Comparator.comparing((Person o1) -> o1.getPosition()).reversed()
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);


    }
}
class Person implements Comparable<Person>{
    String name;
    String position;
    double salary;

    Person(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    String getName() {return name;}
    String getPosition() {return position;}
    double getSalary() { return salary;}

    @Override
    public int compareTo(Person o) {
        return (int) (o.salary-this.salary);
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + salary;
    }
}
