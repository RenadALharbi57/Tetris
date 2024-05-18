
public class TetrisMemento {
    private final int level;
    private final int score;

    
    public TetrisMemento(int level, int score) {
        this.level = level;
        this.score = score;

    }

	public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
