package org.example;

/**
 * Represents the Game Over state.
 * 
 * @version 1.0
 */
public class GameOverState implements GameState {
    private GameOverState() {}
    
    private static final GameOverState instance = new GameOverState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static GameOverState getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "GAME OVER";
    }

    @Override
    public String start(Game game) {
        return "GAME NOT STARTED";
    }

    @Override
    public String play(Game game) {
        return "GAME IN PROGRESS NOT ACHIEVED";
    }

    @Override
    public String lose(Game game) {
        return "GAME OVER NOT ACHIEVED";
    }

    @Override
    public String win(Game game) {
        return "VICTORY NOT ACHIEVED";
    }

    @Override
    public String pause(Game game) {
        return "GAME PAUSED NOT ACHIEVED";
    }
}

