import java.util.ArrayList;
import java.util.List;

public class TetrisCaretaker {
    private List<TetrisMemento> mementoList = new ArrayList<>();

    // Method to save state
    public void saveState(TetrisMemento state) {
        mementoList.add(state);
    }

    // Method to load the most recent state
    public TetrisMemento loadState() {
        if (mementoList.size() > 0) {
            return mementoList.remove(mementoList.size() - 1);
        }
        return null;
    }
}
