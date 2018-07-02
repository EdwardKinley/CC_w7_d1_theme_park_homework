import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Professor Pipe", "Dr Cigar", 003);
    }

    @Test
    public void canGetAttributes() {
        assertEquals("Professor Pipe", tobaccoStall.getName());
        assertEquals("Dr Cigar", tobaccoStall.getOwnerName());
        assertEquals(003, tobaccoStall.getParkingSpot());
    }

}
