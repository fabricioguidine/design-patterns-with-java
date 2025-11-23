package org.example;

/**
 * Represents the Play state of the game.
 * 
 * @version 1.0
 */
public class PlayState implements GameState {
    private PlayState() {}
    
    private static final PlayState instance = new PlayState();
    
    /**
     * Gets the singleton instance.
     * 
     * @return the instance
     */
    public static PlayState getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "PLAY";
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
        game.setState(GameOverState.getInstance());
        return "GAME OVER!";
    }

    @Override
    public String win(Game game) {
        game.setState(VictoryState.getInstance());
        return "VICTORY!";
    }

    @Override
    public String pause(Game game) {
        game.setState(PauseState.getInstance());
        return "GAME PAUSED";
    }
}

