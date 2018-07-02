import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Candy!", "Willy Wonka", 002);
    }

    @Test
    public void canGetAttributes() {
        assertEquals("Candy!", candyFlossStall.getName());
        assertEquals("Willy Wonka", candyFlossStall.getOwnerName());
        assertEquals(002, candyFlossStall.getParkingSpot());
    }

}
