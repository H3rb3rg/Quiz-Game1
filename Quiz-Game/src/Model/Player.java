package Model;

/**
 * Created by Felix on 15.10.2016.
 */
public class Player {
    private String name;
    private int level;

    public Player(String name) {
        this.name = name;
        level = 1;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int newLevel) {
        level = newLevel;
    }
}
