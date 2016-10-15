package Model;

/**
 * Created by Felix on 15.10.2016.
 */
public class Question {
    private String question;
    private String[] answer;
    private String correctAnswer;

    public Question(String question, String[] answer, String correctAnswer) {
        this.question = question;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return this.question;
    }

    public String[] getAnswer() {
        return this.answer;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }
}
