package javiervs.dev.reto6;

import java.util.Arrays;
import java.util.List;

import static javiervs.dev.reto6.OptionsEnum.*;

public class Main {
    public static void main(String[] args) {
        List<Round> rounds = Arrays.asList(
                Round.builder().player1(ROCK).player2(SCISSORS).build(),
                Round.builder().player1(SCISSORS).player2(ROCK).build(),
                Round.builder().player1(PAPER).player2(SCISSORS).build()
        );

        System.out.println(
                RockPaperScissorsLizardSpock.builder()
                        .rounds(rounds)
                        .build()
                        .getWinner());
    }
}
