import java.util.Random;

public class TetrisMemento {
    private final int level;
    private final int score;
    private final TileType currentType;
    private final TileType nextType;
    private final int currentCol;
    private final int currentRow;
    private final int currentRotation;
    private final boolean isPaused;
    private final boolean isGameOver;
    private final boolean isNewGame;
    private final float gameSpeed;
    private final int dropCooldown;
    private final Random random;
    
    public TetrisMemento(int level, int score, TileType currentType, TileType nextType, int currentCol, int currentRow, int currentRotation, boolean isPaused, boolean isGameOver, boolean isNewGame, float gameSpeed, int dropCooldown, Random random) {
        this.level = level;
        this.score = score;
        this.currentType = currentType;
        this.nextType = nextType;
        this.currentCol = currentCol;
        this.currentRow = currentRow;
        this.currentRotation = currentRotation;
        this.isPaused = isPaused;
        this.isGameOver = isGameOver;
        this.isNewGame = isNewGame;
        this.gameSpeed = gameSpeed;
        this.dropCooldown = dropCooldown;
        this.random = new Random(random.nextLong());
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public TileType getCurrentType() {
        return currentType;
    }

    public TileType getNextType() {
        return nextType;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public int getCurrentRotation() {
        return currentRotation;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public boolean isNewGame() {
        return isNewGame;
    }

    public float getGameSpeed() {
        return gameSpeed;
    }

    public int getDropCooldown() {
        return dropCooldown;
    }

    public Random getRandom() {
        return random;
    }
}
