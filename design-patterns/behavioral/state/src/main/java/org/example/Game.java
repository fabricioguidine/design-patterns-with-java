package org.example;

/**
 * Represents a game that can change states using the State pattern.
 * 
 * @version 1.0
 */
public class Game {
    private String name;
    private GameState state;

    /**
     * Constructs a new Game in the Start state.
     */
    public Game() {
        this.state = StartState.getInstance();
    }

    /**
     * Sets the game state.
     * 
     * @param state the state to set
     */
    public void setState(GameState state) {
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }
        this.state = state;
    }

    /**
     * Starts the game.
     * 
     * @return the result message
     */
    public String start() {
        return state.start(this);
    }

    /**
     * Plays the game.
     * 
     * @return the result message
     */
    public String play() {
        return state.play(this);
    }

    /**
     * Loses the game.
     * 
     * @return the result message
     */
    public String lose() {
        return state.lose(this);
    }

    /**
     * Wins the game.
     * 
     * @return the result message
     */
    public String win() {
        return state.win(this);
    }

    /**
     * Pauses the game.
     * 
     * @return the result message
     */
    public String pause() {
        return state.pause(this);
    }

    /**
     * Gets the current state name.
     * 
     * @return the state name
     */
    public String getStateName() {
        return state.getState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameState getState() {
        return state;
    }
}

