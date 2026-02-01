// This is the main class where the application starts

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        //Acessing questions from questionsservice class
        //Creating an object of QuestionService Class
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.Calculate();
    }
}