public class TobaccoStall extends Stall {

    private String name;
    private String ownerName;
    private int parkingSpot;

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

}
