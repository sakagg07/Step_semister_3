package arrays2.assigment_problems;

import java.util.Arrays;

public class FantasyLeagueAutoDraft {

    static class Player implements Comparable<Player> {

        String name;
        int matches;
        double average;
        boolean injured;

        Player(String name, int matches, double average, boolean injured) {
            this.name = name;
            this.matches = matches;
            this.average = average;
            this.injured = injured;
        }

        public int compareTo(Player p) {
            return Double.compare(p.average, average);
        }
    }

    static boolean isDraftable(int matches) {
        return matches >= 10;
    }

    static boolean isDraftable(int matches, boolean injured) {
        return matches >= 5 && !injured;
    }

    static void draftAndRank(Player[] players) {

        Player[] selected = new Player[players.length];
        int count = 0;

        for (Player p : players) {
            if (isDraftable(p.matches) || isDraftable(p.matches, p.injured)) {
                selected[count++] = p;
            }
        }

        selected = Arrays.copyOf(selected, count);
        Arrays.sort(selected);

        for (int i = 0; i < selected.length; i++) {
            System.out.print((i + 1) + ". " + selected[i].name);
            if (i < selected.length - 1)
                System.out.print(" | ");
        }
    }

    public static void main(String[] args) {

        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };

        draftAndRank(players);
    }
}
