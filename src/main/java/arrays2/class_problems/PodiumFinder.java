package arrays2.class_problems;

public class PodiumFinder {

    static int[] findTopThreeScores(int[] scores) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int score : scores) {

            if(score >= first) {
                third = second;
                second = first;
                first = score;
            }
            else if(score >= second) {
                third = second;
                second = score;
            }
            else if(score >= third) {
                third = score;
            }
        }

        return new int[]{first, second, third};
    }

    public static void main(String[] args) {

        int[] scores = {80, 95, 70, 90, 85};

        int[] result = findTopThreeScores(scores);

        System.out.println("First = " + result[0]);
        System.out.println("Second = " + result[1]);
        System.out.println("Third = " + result[2]);
    }
}
