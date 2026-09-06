package arrays2.class_problems;

public class PlacementShortlistingRanking {

    static void checkEligibility(String name, double cgpa, int codingScore) {

        if (cgpa >= 8.0) {
            System.out.println(name + " is Eligible");
        }
        else if (cgpa >= 6.5 && codingScore >= 60) {
            System.out.println(name + " is Eligible");
        }
        else {
            System.out.println(name + " is Not Eligible");
        }
    }

    public static void main(String[] args) {

        String name1 = "Aisha";
        double cgpa1 = 8.2;
        int codingScore1 = 40;

        String name2 = "Rohit";
        double cgpa2 = 6.8;
        int codingScore2 = 65;

        String name3 = "Meena";
        double cgpa3 = 6.0;
        int codingScore3 = 90;

        String name4 = "Karan";
        double cgpa4 = 7.5;
        int codingScore4 = 20;

        checkEligibility(name1, cgpa1, codingScore1);
        checkEligibility(name2, cgpa2, codingScore2);
        checkEligibility(name3, cgpa3, codingScore3);
        checkEligibility(name4, cgpa4, codingScore4);
    }
}