import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for MeetingRoom in the Template Method pattern.
 * 
 * @version 1.0
 */
@DisplayName("Template Method Pattern - Meeting Room Tests")
class MeetingRoomTest {
    MeetingRoom room;

    @BeforeEach
    void setUp() {
        room = new MeetingRoom();
    }

    @Test
    @DisplayName("Should return daily rate")
    void shouldReturnDailyRate() {
        assertEquals(2.0, room.getTime());
    }

    @Test
    @DisplayName("Should return room type")
    void shouldReturnRoomType() {
        assertEquals("Meeting Room", room.getType());
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
        room.setNumber("2000");
        String expectedResponse =
                "{\n" +
                        "   number: 2000,\n" +
                        "   time: 2.0,\n" +
                        "   type: Meeting Room\n" +
                        "}";

        assertEquals(expectedResponse, room.getInfo());
    }
}

