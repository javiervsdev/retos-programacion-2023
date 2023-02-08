package javiervs.dev.reto6;

import lombok.Builder;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static javiervs.dev.reto6.ResultsEnum.*;

@Builder
public class RockPaperScissorsLizardSpock {

    private final List<Round> rounds;

    public String getWinner() {
        Map<ResultsEnum, Long> groupedWins = getGroupedCountWins();

        return isTie(groupedWins)
                ? TIE.getValue()
                : getPlayerWithMostWins(groupedWins);
    }

    private static String getPlayerWithMostWins(Map<ResultsEnum, Long> groupedWins) {
        return groupedWins.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .map(ResultsEnum::getValue)
                .orElse(TIE.getValue());
    }

    private static boolean isTie(Map<ResultsEnum, Long> groupedWins) {
        return groupedWins.get(PLAYER_1).equals(groupedWins.get(PLAYER_2));
    }

    private Map<ResultsEnum, Long> getGroupedCountWins() {
        return rounds.stream()
                .map(Round::getWinner)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
    }
}
