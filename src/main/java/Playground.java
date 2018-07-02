public class Playground extends Attraction implements ISecurity {

    private String name;
    private int rating;

    public Playground(String name, int rating) {
           super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() <= 15);
    }

}
