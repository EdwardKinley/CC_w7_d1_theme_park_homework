import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Condor",4 );
        visitor1 = new Visitor(15, 155, 90.30);
        visitor2 = new Visitor(15, 135, 90.90);
        visitor3 = new Visitor(11, 155, 190.30);
        visitor4 = new Visitor(10, 144, 9.30);
    }

    @Test
    public void canGetName() {
        assertEquals("Condor", rollercoaster.getName());
    }

    @Test
    public void canGetRating() { assertEquals(4, rollercoaster.getRating()); }

    @Test
    public void rollercoasterSecurityWorks() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor1));
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
        assertEquals(false, rollercoaster.isAllowedTo(visitor3));
        assertEquals(false, rollercoaster.isAllowedTo(visitor4));
    }

}
