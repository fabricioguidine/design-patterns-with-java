import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the State pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("State Pattern Tests")
class GameTest {
    Game game;
    
    @BeforeEach
    public void setUp() {
        game = new Game();
    }
    
    @Test
    @DisplayName("Should not start game that is already started")
    void shouldNotStartGameThatIsAlreadyStarted() {
        // Arrange
        game.setState(StartState.getInstance());
        
        // Act & Assert
        assertEquals("GAME NOT STARTED", game.start());
    }
    
    @Test
    @DisplayName("Should play game from start state")
    void shouldPlayGameFromStartState() {
        // Arrange
        game.setState(StartState.getInstance());
        
        // Act & Assert
        assertEquals("GAME IN PROGRESS", game.play());
    }
    
    @Test
    @DisplayName("Should not lose game from start state")
    void shouldNotLoseGameFromStartState() {
        // Arrange
        game.setState(StartState.getInstance());
        
        // Act & Assert
        assertEquals("GAME OVER NOT ACHIEVED", game.lose());
    }
    
    @Test
    @DisplayName("Should not win game from start state")
    void shouldNotWinGameFromStartState() {
        // Arrange
        game.setState(StartState.getInstance());
        
        // Act & Assert
        assertEquals("VICTORY NOT ACHIEVED", game.win());
    }
    
    @Test
    @DisplayName("Should not pause game from start state")
    void shouldNotPauseGameFromStartState() {
        // Arrange
        game.setState(StartState.getInstance());
        
        // Act & Assert
        assertEquals("GAME PAUSED NOT ACHIEVED", game.pause());
    }
    
    @Test
    @DisplayName("Should lose game from play state")
    void shouldLoseGameFromPlayState() {
        // Arrange
        game.setState(PlayState.getInstance());
        
        // Act & Assert
        assertEquals("GAME OVER!", game.lose());
        assertEquals("GAME OVER", game.getStateName());
    }
    
    @Test
    @DisplayName("Should win game from play state")
    void shouldWinGameFromPlayState() {
        // Arrange
        game.setState(PlayState.getInstance());
        
        // Act & Assert
        assertEquals("VICTORY!", game.win());
        assertEquals("VICTORY!", game.getStateName());
    }
    
    @Test
    @DisplayName("Should pause game from play state")
    void shouldPauseGameFromPlayState() {
        // Arrange
        game.setState(PlayState.getInstance());
        
        // Act & Assert
        assertEquals("GAME PAUSED", game.pause());
        assertEquals("PAUSE", game.getStateName());
    }
    
    @Test
    @DisplayName("Should start game from pause state")
    void shouldStartGameFromPauseState() {
        // Arrange
        game.setState(PauseState.getInstance());
        
        // Act & Assert
        assertEquals("GAME STARTED", game.start());
        assertEquals("START", game.getStateName());
    }
    
    @Test
    @DisplayName("Should play game from pause state")
    void shouldPlayGameFromPauseState() {
        // Arrange
        game.setState(PauseState.getInstance());
        
        // Act & Assert
        assertEquals("GAME IN PROGRESS", game.play());
        assertEquals("PLAY", game.getStateName());
    }
}

