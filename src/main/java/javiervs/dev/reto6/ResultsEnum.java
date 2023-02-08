package javiervs.dev.reto6;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResultsEnum {
    TIE("Tie"),
    PLAYER_1("Player 1"),
    PLAYER_2("Player 2");

    private final String value;
}
