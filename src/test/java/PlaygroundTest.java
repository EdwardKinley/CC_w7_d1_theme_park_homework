import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before() {
        playground = new Playground("Playzone");
    }

    @Test
    public void canGetName() {
        assertEquals("Playzone", playground.getName());
    }
}
