package office.management.challenge.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class OfficeTest {
    @Test public void officeAddsRoom() {
        String name = new String("Room1");
        Room room = new Room(name);
        Office myOffice= new Office();
        myOffice.addRoom(room);
        Room result = myOffice.getRooms().get(myOffice.getRooms().size()-1);
        assertEquals("Office returns room", result, room );
    }

}
