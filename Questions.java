//This class contains private instamce var and their getter and setter methods

public class Questions {
    private int id;
    private String question;
    private String answer;
    private String optA;
    private String optB;
    private String optC;
    private String optD; // Instance variables

    // Creating a constructor for initializing questions

    public Questions(int id, String question, String optA, String optB, String optC, String optD, String answer) {
        this.id = id;
        this.question = question;
        this.optA = optA;
        this.optB = optB;
        this.optC = optC;
        this.optD = optD;
        this.answer = answer;
    }

// Now for this private var we need getters and setters to access them.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getOptionA() {
        return optA;
    }
    public void setOptionA(String optA) {
        this.optA = optA;
    }
    public String getOptionB() {
        return optB;
    }
    public void setOptionB(String optB) {
        this.optB = optB;
    }
    public String getOptionC() {
        return optC;
    }
    public void setOptionC(String optC) {
        this.optC = optC;
    }
    public String getOptionD() {
        return optD;
    }
    public void setOptionD(String optD) {
        this.optD = optD;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
// To print the questions and options including answer we use toString method which will be accessed by the QuestionService class
@Override
public String toString() {
    return "Question ID: " + id + "\nQuestion: " + question + "\nA: " + optA + "\nB: " + optB + "\nC: " + optC + "\nD: " + optD + "\nAnswer: " + answer + "\n";
}

}
