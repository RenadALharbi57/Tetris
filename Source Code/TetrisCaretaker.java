import java.util.Stack;

public class TetrisCaretaker {
	//Where all mementos are saved
    private Stack<TetrisMemento> mementoStack = new Stack<>();

    public void addMemento(TetrisMemento memento) {
        mementoStack.add(memento);
        System.out.println("Game state saved.");
    }

    public TetrisMemento getMemento(int index) {
        return mementoStack.get(index);    
        }
}