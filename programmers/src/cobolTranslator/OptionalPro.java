package cobolTranslator;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalPro {
    public static void main(String[] args){
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
        String value1 = getName();
        Optional.of(value1).orElseThrow(NullPointerException::new);

    }
    public static String getName(){
        return Math.random() > 0.5 ? "Alice" : null;
    }
    public static Integer getValue(){
        return Math.random() > 0.5 ? 100 : null;
    }

    public static User getUser() {
        return Math.random() > 0.5 ? new User("user@example.com") : null;
    }
    static class User{
        private final String email;

        public User(String email){
            this.email = email;
        }
        public Optional<String> getEmail(){
            return Optional.ofNullable(email);
        }
    }
}
