package org.example;

/**
 * Interface representing a game state in the State pattern.
 * 
 * @version 1.0
 */
public interface GameState {
    /**
     * Gets the state name.
     * 
     * @return the state name
     */
    String getState();
    
    /**
     * Handles the start action.
     * 
     * @param game the game instance
     * @return the result message
     */
    String start(Game game);
    
    /**
     * Handles the play action.
     * 
     * @param game the game instance
     * @return the result message
     */
    String play(Game game);
    
    /**
     * Handles the lose action.
     * 
     * @param game the game instance
     * @return the result message
     */
    String lose(Game game);
    
    /**
     * Handles the win action.
     * 
     * @param game the game instance
     * @return the result message
     */
    String win(Game game);
    
    /**
     * Handles the pause action.
     * 
     * @param game the game instance
     * @return the result message
     */
    String pause(Game game);
}

