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
    @Test public void roomIsAvailble() {
        String name = new String("Room1");
        Room room = new Room(name);
        assertEquals("New room default is available", room.isAvailable(), true );
    }
    @Test public void roomIsNotAvailble() {
        String name = new String("Room1");
        Room room = new Room(name);
        room.book();
        assertEquals("Booked room is not available", room.isAvailable(), false );
    }
}
