import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Swingland");
    }

    @Test
    public void canGetName() {
        assertEquals("Swingland", park.getName());
    }



}
