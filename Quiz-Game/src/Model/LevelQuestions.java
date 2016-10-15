package Model;

/**
 * Created by Felix on 15.10.2016.
 */
import Model.Question;


public class LevelQuestions {
    private Question[] questions;

    public LevelQuestions(int level) {
        this.createQuestions(level);
    }

    private void createQuestions(int level) {
            if(level == 1 ){
                questions = new Question[1];
                String[] answers=new String[4];
                answers[0]="Eich";
                answers[1]="Palm";
                answers[2]="Birk";
                answers[3]="Eibe";
                questions[0]=new Question("wie heißt der Proffessor der 7en Pokemon Generation?",answers,"A");
            }
            if (level == 2){
                questions = new Question[1];
                String[] answers=new String[4];
                answers[0]="Eich";
                answers[1]="Palm";
                answers[2]="Birk";
                answers[3]="Eibe";
                questions[0]=new Question("wie heißt der Proffessor der 7en Pokemon Generation?",answers,"A");
            }
            if (level == 3){
                questions = new Question[1];
                String[] answers=new String[4];
                answers[0]="Eich";
                answers[1]="Palm";
                answers[2]="Birk";
                answers[3]="Eibe";
                questions[0]=new Question("wie heißt der Proffessor der 7en Pokemon Generation?",answers,"A");
            }
        }

    public Question getRandomQuestion() {
        return this.questions[(int)(Math.random() + this.questions.length)];
    }
}
