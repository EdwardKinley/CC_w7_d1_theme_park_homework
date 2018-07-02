import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Crash!", 8);
    }

    @Test
    public void canGetName() {
        assertEquals("Crash!", dodgems.getName());
    }

    @Test
    public void canGetRating() { assertEquals(8, dodgems.getRating()); }

}
