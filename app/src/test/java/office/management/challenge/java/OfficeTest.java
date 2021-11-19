package office.management.challenge.java;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class OfficeTest {
    @Test
    public void officeAddsRoom() {
        String name = new String("Room1");
        Room room = new Room(name);
        Office myOffice = new Office();
        myOffice.addRoom(room);
        Room result = myOffice.getRooms().get(myOffice.getRooms().size() - 1);
        assertEquals("Office returns room", result, room);
    }

    @Test
    public void officeDefaultEmpty() {
        Office myOffice = new Office();
        assertEquals("Office returns room", myOffice.getRooms().size(), 0);
    }

    @Test
    public void officeShowsAllRooms() {
        String name = new String("Room1");
        Room room = new Room(name);
        String name2 = new String("Room2");
        Room room2 = new Room(name2);
        Office myOffice = new Office();
        myOffice.addRoom(room);
        myOffice.addRoom(room2);
        Room result = myOffice.getRooms().get((myOffice.getRooms().size() - 2));
        assertEquals("Office returns room1", room, result);
        result = myOffice.getRooms().get((myOffice.getRooms().size() - 1));
        assertEquals("Office returns room2", room2, result);

    }

    @Test
    public void officeShowsAvailableRooms() {
        String name = new String("Room1");
        Room room = new Room(name);
        String name2 = new String("Room2");
        Room room2 = new Room(name2);
        Office myOffice = new Office();
        myOffice.addRoom(room);
        myOffice.addRoom(room2);
        Team team = new Team("Team1");
        Meeting meeting = new Meeting("Meeting1");
        Room result = myOffice.getAvailableRooms().get((myOffice.getRooms().size() - 2));
        assertEquals("Office returns room1", room, result);
        result = myOffice.getAvailableRooms().get((myOffice.getRooms().size() - 1));
        assertEquals("Office returns room2", room2, result);
        room2.enter(team, meeting);
        assertEquals("List only has one item", 1, myOffice.getAvailableRooms().size());
        result = myOffice.getAvailableRooms().get((myOffice.getAvailableRooms().size() - 1));
        assertEquals("Office returns room1", room, result);

    }
}

