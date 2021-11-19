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
    @Test public void roomIsEntered() {
        String name = new String("Room1");
        Room room = new Room(name);
        Team team = new Team("Team1");
        Meeting meeting = new Meeting("Meeting1");
        room.enter(team, meeting);
        assertEquals("Enter room becomes not available", room.isAvailable(), false );
        assertEquals("Enter room has team", team, room.getTeam() );
        assertEquals("Enter room has meeting", meeting, room.getMeeting() );
    }

    @Test public void roomIsLeft() {
        String name = new String("Room1");
        Room room = new Room(name);
        Team team = new Team("Team1");
        Meeting meeting = new Meeting("Meeting1");
        room.enter(team, meeting);
        room.leave();
        assertEquals("Leaving room becomes available", true, room.isAvailable());
        assertEquals("Team becomes null", null, room.getTeam());
        assertEquals("Meeting becomes null", null, room.getMeeting());
    }

    @Test public void roomIsNotAvailableAndGivesError() {
        String name = new String("Room1");
        Room room = new Room(name);
        room.book();
        assertEquals("Booked room is not available",false, room.isAvailable());
        assertThrows(IllegalStateException.class, () -> {room.enter(new Team("Team1"), new Meeting("Meeting1"));} );
    }

    @Test public void roomIsBookedAndGivesError() {
        String name = new String("Room1");
        Room room = new Room(name);
        room.book();
        assertEquals("Booked room is not available", room.isAvailable(), false);
        assertThrows(IllegalStateException.class, ()->{room.book();} );
    }
}
