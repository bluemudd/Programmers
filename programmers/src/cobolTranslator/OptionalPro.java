package cobolTranslator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalPro {
    public static void main(String[] args) throws IOException {
        Optional<String> name = Optional.ofNullable(getName());
        /*
        * 문제 1: 값이 있는지 확인하고 처리하기
        * 다음 코드는 null 값을 처리해야 합니다. Optional을 사용하여 null을 안전하게 처리하는 코드를 작성하세요.
        * */
        System.out.println(name.orElseGet(() -> new String("Unknown")));
        /*
        *문제 2: 값 변환하기
          다음 코드는 사용자 입력 값을 처리합니다. Optional을 사용하여 null이나 빈 문자열을 처리하고, 입력값이 null 또는 빈 문자열이면 "Default Value"를 출력하는 코드를 작성하세요.
        */
        String result = name.filter(value -> !value.isEmpty())
                .orElse("Default Value");
        System.out.println(result);

        /*정답
        String result = Optional.ofNullable(getName())
                .filter(value -> !value.isEmpty())
                .orElse("Default value");
        System.out.println(result);*/


        /*문제 3: Optional과 map 사용하기
        다음 코드에서 User 객체는 getEmail 메서드를 가지고 있습니다. Optional을 사용하여 이메일이 존재하면 이메일 도메인(@ 뒤의 값)을 추출하고, 이메일이 없으면 "No Email"을 출력하세요.*/
        User user = getUser();
        System.out.println(Optional.ofNullable(user).flatMap(User::getEmail) // 평탄화. 그냥 보내게 되면 그냥 String.
                .filter(s->!s.isEmpty()).map(s->s.split("@")[1]).orElse("No Email"));

/*        정답
        System.out.println(Optional.ofNullable(user)
                .flatMap(User::getEmail)
                .map(s->s.contains("@") ? s.split("@")[1] : "Invalid Email")
                .orElse("No Email"));*/

        /*문제 4: Optional을 사용한 기본값 설정
        Optional과 orElse를 사용하여 null 값 대신 기본값을 설정하는 코드를 작성하세요.*/
        Integer value = getValue();
        System.out.println(Optional.ofNullable(value).orElse(42));

        /*문제 5: 예외를 발생시키기
        값이 반드시 존재해야 하는 경우 orElseThrow를 사용하여 예외를 발생시키는 코드를 작성하세요.*/
//        String value1 = getName();
//        Optional.of(value1).orElseThrow(NullPointerException::new);

        /*문제 1: 값 변환 후 기본값 처리
        다음 코드는 사용자가 입력한 이름을 처리합니다.
        Optional을 사용하여 입력값이 null 또는 빈 문자열이면 기본값 "Anonymous"를 출력하고,
        입력값이 존재하면 첫 글자만 대문자로 변환하여 출력하는 코드를 작성하세요.*/
        String inputName = getName();
        System.out.println(Optional.ofNullable(inputName).orElse("Anonymous"));

        /*문제 2: 중첩된 Optional 처리
        다음 코드는 사용자의 계정을 처리합니다. Optional을 사용하여 사용자의 Profile 객체에서 Optional로 감싸진 Country 객체를 안전하게 추출하고, 국가 이름이 없으면 "Unknown Country"를 출력하는 코드를 작성하세요.*/
        User user1 = getUser();
        System.out.println(user1.getCountry().orElse("Unkown Country"));

        /*문제 3: 안전한 값 추출
        다음 코드는 사용자의 입력값을 처리합니다. 입력값이 null이면 기본값 0을 반환하고, 숫자로 변환할 수 없는 경우에도 기본값 0을 반환하는 코드를 작성하세요.*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = br.readLine();
        System.out.println(Optional.ofNullable(inputValue)
                .filter(s -> !s.isEmpty())
                .map(s -> s.chars()
                        .filter(Character::isDigit)
                        .mapToObj(c -> String.valueOf((char) c))
                        .findFirst()
                        .orElse("0"))
                .orElse("0"));
        br.close();



    }
    public static String getName(){
        return Math.random() > 0.5 ? "Alice" : null;
    }
    public static Integer getValue(){
        return Math.random() > 0.5 ? 100 : null;
    }

    public static User getUser() {
        return Math.random() > 0.5 ? new User("user@example.com", Math.random() > 0.5 ? "korea" : null) : null;
    }
    static class User{
        private final String email;
        private final String country;

        public User(String email, String country){
            this.country = country;
            this.email = email;
        }
        public Optional<String> getEmail(){
            return Optional.ofNullable(email);
        }

        public Optional<String> getCountry(){
            return Optional.ofNullable(country);
        }
    }
}
