public class Rollercoaster extends Attraction {

    private String name;
    private int rating;

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getHeight() > 145) && (visitor.getAge() > 12);
    }

}
