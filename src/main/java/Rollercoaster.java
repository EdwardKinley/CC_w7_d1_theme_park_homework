public class Rollercoaster extends Attraction {

    private String name;

    public Rollercoaster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getHeight() > 145) && (visitor.getAge() > 12);
    }

}
