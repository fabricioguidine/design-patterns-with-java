package org.example;

/**
 * Represents the Victory state of the game.
 * 
 * @version 1.0
 */
public class VictoryState implements GameState {
    private VictoryState() {}
    
    private static final VictoryState instance = new VictoryState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static VictoryState getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "VICTORY!";
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

