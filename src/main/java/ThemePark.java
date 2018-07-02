import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<Visitor> visitors;

    public ThemePark(String name, ArrayList<Attraction> attractions, ArrayList<Stall> stalls, ArrayList<Visitor> visitors) {
        this.name = name;
        this.attractions = attractions;
        this.stalls = stalls;
        this.visitors = visitors;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Attraction> getAttractions() { return attractions; }
    public ArrayList<Stall> getStalls() { return stalls; }
    public ArrayList<Visitor> getVisitors() { return visitors; }

    public int getAttractionsCount() { return attractions.size(); }
    public int getStallsCount() { return stalls.size(); }
    public int getVisitorsCount() { return visitors.size(); }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> allReviewed = new ArrayList<>();
        for (IReviewed attraction : attractions) {
            allReviewed.add(attraction);
        }
        for (IReviewed stall : stalls) {
            allReviewed.add(stall);
        }
        return allReviewed;
    }

//    public String visit(Visitor visitor, Attraction attraction) {
//        return "enjoying ride";
//        }
//    }

}
