import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for ConferenceRoom in the Template Method pattern.
 * 
 * @version 1.0
 */
@DisplayName("Template Method Pattern - Conference Room Tests")
class ConferenceRoomTest {
    ConferenceRoom room;

    @BeforeEach
    void setUp() {
        room = new ConferenceRoom();
    }

    @Test
    @DisplayName("Should return time")
    void shouldReturnTime() {
        assertEquals(2.0, room.getTime());
    }

    @Test
    @DisplayName("Should return room type")
    void shouldReturnRoomType() {
        assertEquals("Conference Room", room.getType());
    }

    @Test
    @DisplayName("Should simulate stay value")
    void shouldSimulateStayValue() {
        Integer days = 30;
        assertEquals(60.0, room.simulateStay(days));
    }

    @Test
    @DisplayName("Should return room information")
    void shouldReturnRoomInformation() {
        room.setNumber("1999");
        String expectedResponse =
                "{\n" +
                        "   number: 1999,\n" +
                        "   time: 2.0,\n" +
                        "   type: Conference Room\n" +
                        "}";

        assertEquals(expectedResponse, room.getInfo());
    }
}

