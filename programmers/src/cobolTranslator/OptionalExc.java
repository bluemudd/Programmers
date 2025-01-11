package cobolTranslator;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalExc {
    public static void main(String[] args){
        String str = "abc";
        Optional<String> optVal = Optional.of(str);
        Optional<String> optVal1 = Optional.of("abc");
//        Optional<String> optVal2 = Optional.of(null); // NullPointerException 발생
        Optional<String> optVal3 = Optional.ofNullable(null);

        System.out.println(optVal3);

//        int[] arr =null;
        int[] arr = new int[0];
        System.out.println("arr.length="+arr.length);

//        Optional<String> opt = null; // OK, 하지만 바람직X
        Optional<String> opt1 = Optional.empty();
        System.out.println("opt1="+opt1);
        System.out.println("opt1="+opt1.orElse(""));
        System.out.println("opt1="+opt1.orElseGet(String::new));
        System.out.println("opt1"+opt1.orElseGet(()->new String()));
//        System.out.println("opt1="+opt1.orElseThrow(() -> new NullPointerException()));

        OptionalInt optInt = OptionalInt.of(0);
        OptionalInt optInt1 = OptionalInt.empty();

        System.out.println(optInt.getAsInt() == optInt1.getAsInt());

    }
}
