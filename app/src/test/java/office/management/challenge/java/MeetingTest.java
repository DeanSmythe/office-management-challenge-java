package office.management.challenge.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeetingTest {
    @Test public void meetingGetsName(){
        String name = new String("Meeting1");
        Meeting meeting = new Meeting(name);
        assertEquals("Meeting returns name", meeting.getName(), name );
    }
}
