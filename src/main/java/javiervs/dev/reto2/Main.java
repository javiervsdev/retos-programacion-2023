package javiervs.dev.reto2;

import java.util.List;

public class Main {

    private static final String[] SCORE = {"Love", "15", "30", "40"};

    private static int p1 = 0;
    private static int p2 = 0;

    public static void main(String[] args) {
        List<String> game = List.of("P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1");

        game.forEach(point -> {
            if ("P1".equals(point)) {
                p1++;
            } else if ("P2".equals(point)) {
                p2++;
            }

            if (p1 == p2 && p1 == 3)
                System.out.println("Deuce");
            else if (p1 < 4 && p2 < 4 )
                System.out.println(SCORE[p1] + " - " + SCORE[p2]);
            else {
                if (p1 == p2)
                    System.out.println("Deuce");
                if (p1 - p2 == 1)
                    System.out.println("Ventaja para P1");
                if (p2 - p1 == 1)
                    System.out.println("Ventaja para P2");
                if (p1 - p2 >= 2)
                    System.out.println("Ha ganado P1");
                if (p2 - p1 >= 2)
                    System.out.println("Ha ganado P2");
            }
        });
    }
}