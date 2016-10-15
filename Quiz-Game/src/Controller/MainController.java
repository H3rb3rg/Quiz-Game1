package Controller;

import Model.Player;
import Model.QuestionHandler;

/**
 * Created by Felix on 15.10.2016.
 */
public class MainController {
    private String rightAnswer;
    private Player player;
    private QuestionHandler questionHandler;

    public MainController() {
        questionHandler = new QuestionHandler();
    }

    public void createPlayer(String name) {
        player = new Player(name);
    }

    public String getPlayerName() {
        return this.player.getName();
    }

    public int getPlayerLevel() {
        return this.player.getLevel();
    }

    /**public String[] getQuestionAndAnswers() {
        String[] arr = this.questionHandler.getRandomQuestion(getPlayerLevel());
        this.rightAnswer = arr[5];
        return new String[]{arr[0], arr[1], arr[2], arr[3], arr[4]};
    }*/
    public String[] getQuestionAndAnswers(){
        String[] x = questionHandler.getRandomQuestion(getPlayerLevel());
        String[] y = new String[5];
        rightAnswer=x[5];
        System.arraycopy(x,0,y,0,5);
        return y;
    }

    public boolean answer(String chosenAnswer) {
        if(chosenAnswer == this.rightAnswer) {
            this.player.setLevel(this.player.getLevel()+1);
            return true;
        } else {
            return false;
        }
    }
}
