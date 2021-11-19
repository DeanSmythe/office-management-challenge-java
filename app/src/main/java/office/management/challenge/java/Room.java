package office.management.challenge.java;

import java.util.function.BooleanSupplier;

public class Room {
String name;
Boolean available;
Team team;
Meeting meeting;

    public Room(String nameIn) {
        name = nameIn;
        available = true;
    }

    public String getName() {
        return this.name;
    }

    public Team getTeam() {
        return team;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void book() {
        if (!available) {
            throw new IllegalStateException("Room is already in use");
        }
        available = false;
    }

    public void enter(Team teamIn, Meeting meetingIn) {
        if (!available) {
            throw new IllegalStateException("Room is already in use");
        }
        team = teamIn;
        meeting = meetingIn;
        available = false;
    }

    public void leave() {
        available = true;
        team = null;
        meeting = null;

    }

} // Class
