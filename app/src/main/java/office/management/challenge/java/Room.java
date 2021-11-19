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
    public void book() {
        available = false;

    }

    public Boolean isAvailable() {
        return available;

    }
} // Class
