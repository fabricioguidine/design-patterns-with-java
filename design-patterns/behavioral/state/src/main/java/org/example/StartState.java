package org.example;

/**
 * Represents the Start state of the game.
 * 
 * @version 1.0
 */
public class StartState implements GameState {
    private StartState() {}
    
    private static final StartState instance = new StartState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static StartState getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "START";
    }

    @Override
    public String start(Game game) {
        return "GAME NOT STARTED";
    }

    @Override
    public String play(Game game) {
        game.setState(PlayState.getInstance());
        return "GAME IN PROGRESS";
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

