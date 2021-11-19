package office.management.challenge.java;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RoomTest {

    @Test public void roomHasAName() {
        String name = new String("Room1");
        Room room = new Room(name);
        assertEquals("Room returns name", room.getName(), name );
    }

}
