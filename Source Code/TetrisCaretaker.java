import java.util.Stack;

public class TetrisCaretaker {
    private Stack<TetrisMemento> mementoStack = new Stack<>();

    public void saveState(TetrisMemento memento) {
        mementoStack.push(memento);
        System.out.println("Game state saved.");
    }

    public TetrisMemento loadState() {
        if (!mementoStack.isEmpty()) {
            System.out.println("Game state loaded.");
            return mementoStack.pop();
        }
        System.out.println("No saved game state to load.");
        return null;
    }
}