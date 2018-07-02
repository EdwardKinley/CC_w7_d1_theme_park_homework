public class TobaccoStall extends Stall {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

}
