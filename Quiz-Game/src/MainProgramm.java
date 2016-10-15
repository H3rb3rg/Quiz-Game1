import Controller.MainController;
import View.MainView;

/**
 * Created by Felix on 15.10.2016.
 */
public class MainProgramm {
    public static void main(String[] args) {
        MainController controller = new MainController();
        MainView view = new MainView(controller);
    }
}
