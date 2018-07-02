import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before() {
        themePark = new ThemePark("Wonderland");

    }

    @Test
    public void canGetName() {
        assertEquals("Wonderland", themePark.getName());
    }

}
