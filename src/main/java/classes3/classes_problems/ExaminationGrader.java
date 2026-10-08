package classes3.classes_problems;

abstract class Question {
    String correctAnswer;
    String studentAnswer;
    double points;

    Question(String correctAnswer, String studentAnswer, double points) {
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    abstract double calculateScore();

    abstract String getType();
}

class MCQ extends Question {
    MCQ(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double calculateScore() {
        if (correctAnswer.equalsIgnoreCase(studentAnswer)) {
            return points;
        }

        return 0;
    }

    String getType() {
        return "MCQ";
    }
}

class TF extends Question {
    TF(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double calculateScore() {
        if (correctAnswer.equalsIgnoreCase(studentAnswer)) {
            return points;
        }

        return 0;
    }

    String getType() {
        return "TF";
    }
}

class Essay extends Question {
    Essay(String correctAnswer, String studentAnswer, double points) {
        super(correctAnswer, studentAnswer, points);
    }

    double calculateScore() {
        String[] keywords = correctAnswer.split(",");
        int count = 0;

        for (String keyword : keywords) {
            if (studentAnswer.toLowerCase().contains(keyword.trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2) {
            return points * 0.75;
        } else if (count == 1) {
            return points * 0.50;
        }

        return 0;
    }

    String getType() {
        return "ESSAY";
    }
}

public class ExaminationGrader {
    public static void main(String[] args) {
        Question[] questions = {
                new MCQ("Paris", "Paris", 10),
                new TF("False", "True", 5),
                new Essay("Inheritance, Polymorphism, Encapsulation",
                        "Polymorphism is one.", 20),
                new Essay("Abstraction, Composition",
                        "I talked about abstraction.", 15)
        };

        double total = 0;

        for (Question question : questions) {
            double score = question.calculateScore();
            System.out.printf("%s: %.2f%n", question.getType(), score);
            total = total + score;
        }

        System.out.printf("Total Score: %.2f%n", total);
    }
}
