package office.management.challenge.java;

import java.util.function.BooleanSupplier;

public class Room {
String name;
Boolean available;

    public Room(String nameIn) {
        name = nameIn;
        available = true;
    }

    public String getName() {
        return this.name;
    }
    public Boolean isAvailable() {
        return available;

    }
    public void book() {
        if (available == false) {
            throw new IllegalStateException("Room is already in use");
        }

        available = false;
    }

    public void enter() {
        if (available == false) {
            throw new IllegalStateException("Room is already in use");
        }

        available = false;

    }
    public void leave() {
        available = true;

    }

} // Class
