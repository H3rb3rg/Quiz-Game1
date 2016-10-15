package Model;

/**
 * Created by Felix on 15.10.2016.
 */
import Model.LevelQuestions;
import Model.Question;


public class QuestionHandler {
    private LevelQuestions[] allLevelQuestions = new LevelQuestions[15];


    public QuestionHandler() {
        this.createAllLevels();
    }

    public void createAllLevels() {
        for (int i = 0; i < 1; i++) {
            this.allLevelQuestions[i] = new LevelQuestions(i + 1);

        }
    }

    public String[] getRandomQuestion(int level) {
        Question q = this.allLevelQuestions[level - 1].getRandomQuestion();
        String[] answer = q.getAnswer();
        return new String[]{q.getQuestion(), answer[0], answer[1], answer[2], answer[3], q.getCorrectAnswer()};
    }
    /**public String[] getRandomQuestion(int level){
        Question q = this.allLevelQuestions[level-1].getRandomQuestion();
        String[] asd=new String[6];
        asd[0]=q.getQuestion();
        System.arraycopy(q.getAnswer(),0,asd,1,4);
        asd[5]=q.getCorrectAnswer();
        return asd;
    }*/
}
