package javiervs.dev.reto3;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = PasswordGenerator.builder()
                .length(PasswordLength.LENGTH_16)
                .hasNumbers(true)
                .hasUpperCase(true)
                .hasSymbols(true)
                .build();
        System.out.println(passwordGenerator.generate());
    }
}
