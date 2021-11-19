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
    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms)
            if (room.isAvailable()) {
                availableRooms.add(room);
        }
        return availableRooms;
    }
}
