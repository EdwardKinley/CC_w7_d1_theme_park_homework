public class Playground extends Attraction implements ISecurity {

    private String name;

    public Playground(String name) {
           super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() <= 15);
    }

}
