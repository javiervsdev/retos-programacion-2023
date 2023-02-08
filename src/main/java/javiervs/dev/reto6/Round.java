package javiervs.dev.reto6;

import lombok.Builder;

@Builder
public class Round {
    private final OptionsEnum player1;
    private final OptionsEnum player2;

    public ResultsEnum getWinner() {
        if (player1.equals(player2)) {
            return ResultsEnum.TIE;
        }

        return OptionsEnum.getLosersOf(this.player1).stream()
                .anyMatch(player2::equals)
                ? ResultsEnum.PLAYER_1
                : ResultsEnum.PLAYER_2;
    }
}
