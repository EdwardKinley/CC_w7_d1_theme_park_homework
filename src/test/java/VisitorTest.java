import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(34, 193, 20.30);
    }

    @Test
    public void canGetAttributes() {
        assertEquals(34, visitor.getAge());
        assertEquals(193, visitor.getHeight());
        assertEquals(20.30, visitor.getMoney(),0.01);
    }

}
