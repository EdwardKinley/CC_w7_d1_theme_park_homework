import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction dodgems;
    ArrayList<Attraction> attractions;
    Stall stall1;
    Stall stall2;
    ArrayList<Stall> stalls;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    ArrayList<Visitor> visitors;

    @Before
    public void before() {
        dodgems = new Dodgems("Crash!", 8);
        attractions = new ArrayList<Attraction>();
        attractions.add(dodgems);
        stall1 = new IceCreamStall("Walls", "Mr Wall", 456, 8);
        stall2 = new TobaccoStall("Puffaway", "Benson & Hedges", 345, 1);
        stalls = new ArrayList<Stall>();
        stalls.add(stall1);
        stalls.add(stall2);
        visitor1 = new Visitor(5, 120, 90.0);
        visitor2 = new Visitor(20, 150, 80.0);
        visitor3 = new Visitor(58, 180, 290.0);
        visitors = new ArrayList<Visitor>();
        visitors.add(visitor1);
        visitors.add(visitor2);
        visitors.add(visitor3);
        themePark = new ThemePark("Wonderland", attractions, stalls, visitors);
    }

    @Test
    public void canGetName() {
        assertEquals("Wonderland", themePark.getName());
    }

    @Test
    public void canGetAttractions() {
        assertEquals(1, themePark.getAttractions().size());
        assertEquals(1, themePark.getAttractionsCount());
    }

    @Test
    public void canGetStalls() {
        assertEquals(2, themePark.getStalls().size());
        assertEquals(2, themePark.getStallsCount());
    }

    @Test
    public void canGetVisitors() {
        assertEquals(3, themePark.getVisitors().size());
        assertEquals(3, themePark.getVisitorsCount());
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(3, themePark.getAllReviewed().size());
    }

    @Test
    public void canVisit() {
        assertEquals("enjoying ride", themePark.visit(visitor1, dodgems));
    }

}
