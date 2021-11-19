package office.management.challenge.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {
    @Test public void teamGetsName(){
        String name = new String("Team1");
            Team team = new Team(name);
            assertEquals("Team returns name", team.getName(), name );
    }
}
