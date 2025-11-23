package org.example;

/**
 * Represents the Pause state of the game.
 * 
 * @version 1.0
 */
public class PauseState implements GameState {
    private PauseState() {}
    
    private static final PauseState instance = new PauseState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static PauseState getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "PAUSE";
    }

    @Override
    public String start(Game game) {
        game.setState(StartState.getInstance());
        return "GAME STARTED";
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

