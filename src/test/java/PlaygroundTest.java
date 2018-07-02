import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before() {
        playground = new Playground("Playzone", 9);
        visitor1 = new Visitor(9, 124, 13.00);
        visitor2 = new Visitor(15, 167, 17.20);
        visitor3 = new Visitor(16, 176, 268.40);
    }

    @Test
    public void canGetName() {
        assertEquals("Playzone", playground.getName());
    }

    @Test
    public void canGetRating() { assertEquals(9, playground.getRating()); }

    @Test
    public void canPlayWhen15OrYounger() {
        assertEquals(true, playground.isAllowedTo(visitor1));
        assertEquals(true, playground.isAllowedTo(visitor2));
    }

    @Test
    public void cannotPlayWhenOver15() {
        assertEquals(false, playground.isAllowedTo(visitor3));
    }

}
