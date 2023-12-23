public class QuestionService {
    Question[] questions = new Question[5];

    // Hard coding questions
    public QuestionService() {
        questions[0] = new Question(1, "What are we learning?", "C++", "C#", "Java", "Php", "Java");
        questions[1] = new Question(2, "Size of int?", "2", "6", "7", "4", "4");
        questions[2] = new Question(3, "Size of double?", "4", "8", "6", "12", "8");
        questions[3] = new Question(4, "Size of char?", "4", "3", "2", "12", "2");
        questions[4] = new Question(5, "Size of long?", "8", "12", "6", "16", "8");

    }

    public void displayQuestions() {
        for (Question que : questions) {
            System.out.println(que.getQuestion());
        }
    }

}
