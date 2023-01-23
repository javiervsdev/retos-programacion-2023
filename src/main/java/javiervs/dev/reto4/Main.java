package javiervs.dev.reto4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 20).forEach(number ->
                System.out.println(
                        "%s %s, %s y %s.".formatted(
                                number,
                                isPrime(number) ? "es primo" : "no es primo",
                                isFibonacci(number) ? "es fibonacci" : "no es fibonacci",
                                isEven(number) ? "es par" : "es impar")));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        return IntStream.range(2, number)
                .filter(divisor -> number % divisor == 0)
                .mapToObj(a -> false)
                .findFirst()
                .orElse(true);
    }

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }
        int n2 = 0;
        int n1 = 1;
        int nextOne;
        do {
            nextOne = n2 + n1;
            n2 = n1;
            n1 = nextOne;
        } while (nextOne < number);

        return nextOne == number;
    }

}
