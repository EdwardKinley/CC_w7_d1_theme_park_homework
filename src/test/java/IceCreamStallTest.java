import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Manx Ices", "Mr Davison", 001, 6);
    }

    @Test
    public void canGetAttributes() {
        assertEquals("Manx Ices", iceCreamStall.getName());
        assertEquals("Mr Davison", iceCreamStall.getOwnerName());
        assertEquals(001, iceCreamStall.getParkingSpot());
        assertEquals(6, iceCreamStall.getRating());
    }



}
