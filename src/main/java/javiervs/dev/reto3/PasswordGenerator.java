package javiervs.dev.reto3;

import lombok.Builder;

import java.util.Optional;
import java.util.Random;

import static javiervs.dev.reto3.PasswordLength.LENGTH_8;

@Builder
public class PasswordGenerator {

    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*_=+-/";

    private PasswordLength length;
    private boolean hasUpperCase;
    private boolean hasNumbers;
    private boolean hasSymbols;

    public PasswordLength getLength() {
        return Optional.ofNullable(length).orElse(LENGTH_8);
    }
    public String generate() {
        Random random = new Random();
        String characters = getCharacters();
        return random.ints(0, characters.length())
                .map(characters::charAt)
                .limit(getLength().getValue())
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    private String getCharacters() {
        StringBuilder characters = new StringBuilder();
        characters.append(LOWERCASE_CHARS);
        if (hasUpperCase) {
            characters.append(UPPERCASE_CHARS);
        }
        if (hasNumbers) {
            characters.append(NUMBERS);
        }
        if (hasSymbols) {
            characters.append(SYMBOLS);
        }
        return characters.toString();
    }
}
