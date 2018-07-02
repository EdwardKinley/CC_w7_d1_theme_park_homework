import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("Crash!");
    }

    @Test
    public void canGetName() {
        assertEquals("Crash!", dodgems.getName());
    }

}
