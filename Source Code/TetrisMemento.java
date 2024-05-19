
public class TetrisMemento {
	//The level & score stored in memento Object
    private final int score;

    //Save a new level & score to the memento Object
    public TetrisMemento(int scoreSave) {
        this.score = scoreSave;

    }

    //Return the value stored in level & score 

    public int getScore() {
        return score;
    }
}
