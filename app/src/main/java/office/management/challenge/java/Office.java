package office.management.challenge.java;
import java.util.ArrayList;

public class Office {

    ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
    rooms.add(room);
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
