package javiervs.dev.reto6;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum OptionsEnum {
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK;

    public static List<OptionsEnum> getLosersOf(OptionsEnum option) {
        return switch (option) {
            case ROCK -> List.of(LIZARD, SCISSORS);
            case PAPER -> List.of(ROCK, SPOCK);
            case SCISSORS -> List.of(PAPER, LIZARD);
            case LIZARD -> List.of(SPOCK, PAPER);
            case SPOCK -> List.of(SCISSORS, ROCK);
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
    }
}
