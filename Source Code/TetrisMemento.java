
public class TetrisMemento {
	//The level & score stored in memento Object
    private final int score;

    //Save a new level & score to the memento Object
    public TetrisMemento(int score) {
        this.score = score;

    }

    //Return the value stored in level & score 

    public int getScore() {
        return score;
    }
}
