package javiervs.dev.reto0;

import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 101)
                .mapToObj(toFizzBuzz)
                .forEach(System.out::println);
    }

    public static final IntFunction<String> toFizzBuzz = number -> {
        if (number % 3 == 0 && number % 5 == 0) return "fizzbuzz";
        if (number % 3 == 0) return "fizz";
        if (number % 5 == 0) return "buzz";
        return String.valueOf(number);
    };
}
