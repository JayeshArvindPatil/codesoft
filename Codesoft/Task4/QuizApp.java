import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        String[] questions = {
                "What is the capital of France? \n1. Paris \n2. London \n3. Berlin",
                "What is 2 + 2? \n1. 3 \n2. 4 \n3. 5"
        };
        int[] answers = {1, 2};
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == answers[i]) {
                score++;
            }
        }

        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
