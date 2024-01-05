import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    // Hard coding questions
    public QuestionService() {
        questions[0] = new Question(1, "What are we learning?", "C++", "C#", "Java", "Php", "Java");
        questions[1] = new Question(2, "Size of int?", "2", "6", "7", "4", "4");
        questions[2] = new Question(3, "Size of double?", "4", "8", "6", "12", "8");
        questions[3] = new Question(4, "Size of char?", "4", "3", "2", "12", "2");
        questions[4] = new Question(5, "Size of long?", "8", "12", "6", "16", "8");

    }

    public void playQuiz() {
        int i = 0;
        for (Question que : questions) {
            System.out.println("Question number:" + que.getId());
            System.out.println(que.getQuestion());
            System.out.println(que.getOpt1());
            System.out.println(que.getOpt2());
            System.out.println(que.getOpt3());
            System.out.println(que.getOpt4());
            Scanner sc = new Scanner(System.in);
            // Making sure new answer is going to next index
            selection[i] = sc.nextLine();
            i++;
            sc.close();

        }
        for (String sel : selection) {
            System.out.println("User choises:" + sel);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String correctAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if (correctAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("User score is:" + score);
    }

}
