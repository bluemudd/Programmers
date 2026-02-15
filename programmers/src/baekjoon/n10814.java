package baekjoon;

import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/10814
public class n10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<User> list = new ArrayList<>();

        for(int i = 0; i<N; i++){
            String joinUserInput = br.readLine();
            String[] joinUser = joinUserInput.split(" ");

            User user = new User(joinUser[1], Integer.parseInt(joinUser[0]));
            list.add(user);
        }

        list.sort(Comparator.comparing(User::getAge));
//                .thenComparing(User::getName));

        for(User user : list){
            System.out.println(user.getAge() + " " + user.getName());
        }
    }

    static class User{
        String name;
        int age;

        public User(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge() {
            return age;
        }
    }
}
