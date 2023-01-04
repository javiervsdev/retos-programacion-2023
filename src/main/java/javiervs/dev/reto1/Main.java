package javiervs.dev.reto1;

import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;
import static javiervs.dev.reto1.LeetSpeakUtils.TRANSLATIONS;

public class Main {

    public static void main(String[] args) {
        
        final String textToTranslate = "Hola me llamo Javier y tengo 28 años";

        String translated = textToTranslate.chars()
                .mapToObj(toString)
                .map(toLeetSpeak)
                .collect(joining());
        
        System.out.println(translated);
    }

    public static final IntFunction<String> toString = character ->
            Character.toString((char) character);

    public static final UnaryOperator<String> toLeetSpeak = key ->
            ofNullable(TRANSLATIONS.get(key.toLowerCase()))
                    .orElse(key);
}