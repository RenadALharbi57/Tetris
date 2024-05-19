import java.util.ArrayList;
import java.util.List;

public class TetrisCaretaker {
	//Where all mementos are saved
    private List<TetrisMemento> savedScores = new ArrayList<>();

    public void addMemento(TetrisMemento memento) {
        savedScores.add(memento);
        System.out.println("Game state saved.");
    }

    public TetrisMemento getMemento(int index) {

    	 //return savedScores.get(index);  
    	 if (index >= 0 && index < savedScores.size()) {
    	        return savedScores.get(index);
    	    } else {
    	        // Handle the case where the index is out of bounds
    	        System.err.println("Invalid index for retrieving memento.");
    	        return null; // or throw an exception
    	    }
    }    
}