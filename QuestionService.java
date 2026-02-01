// This class contains methods and questions which is used in Main class
import java.util.Scanner;
public class QuestionService {
    // Creating an array of questions with size
    Questions[] question = new Questions[5]; // This Question is a type and question is a var name.
    // Creating an array for storing answers of user.
    String selected[] = new String[5];

    //Creating a constructor for question,options and answer
    public QuestionService() {
        question[0] = new Questions(1,"Which programming language is used widely for LLM ? ", "Java", "Python", "C++", "JS", "Python");
        question[1] = new Questions(2,"Who invented java ? ", "Vamshi", "James Gosling", "No one", "Rossum", "James Gosling");
        question[2] = new Questions(3,"Which lang introduced SpringAI ? ", "Java", "Python", "C++", "JS", "Java");
        question[3] = new Questions(4,"Which lang is used with pandas ? ", "Java", "Python", "C++", "JS", "Python");
        question[4] = new Questions(5,"Which programming language is used for developing games ? ", "Java", "Python", "C++", "JS", "C++");


    }
    // Method to play quiz - User can play and answer quiz
    public void playQuiz() {
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<question.length; i++) {
            Questions q = question[i];
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A) " + q.getOptionA());
            System.out.println("B) " + q.getOptionB());
            System.out.println("C) " + q.getOptionC());
            System.out.println("D) " + q.getOptionD());
            System.out.println("Enter your answer: ");
            selected[i] = sc.nextLine().trim(); //trim removes extra space
            System.out.println();
        }
        
        
        for(String s : selected) {
                System.out.print(s + " ");
            }      
    }
    public void Calculate() {
        int score = 0;
        for(int i = 0; i<question.length; i++) {
            Questions que = question[i];
            String ans = que.getAnswer(); 
            String userAnswer = selected[i];
            if(ans.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}
