import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Professor Pipe", "Dr Cigar", 003, 1);
        visitor1 = new Visitor(23, 190, 234.20);
        visitor2 = new Visitor(18, 180, 24.20);
        visitor3 = new Visitor(17, 156, 34.20);
    }

    @Test
    public void canGetAttributes() {
        assertEquals("Professor Pipe", tobaccoStall.getName());
        assertEquals("Dr Cigar", tobaccoStall.getOwnerName());
        assertEquals(003, tobaccoStall.getParkingSpot());
        assertEquals(1, tobaccoStall.getRating());
    }

    @Test
    public void canBuyWhen18OrOlder() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void cannotBuyWhenUnder18() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor3));
    }

}
