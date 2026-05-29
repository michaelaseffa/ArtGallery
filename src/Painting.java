public class Painting extends Art {
    private String medium;

    public Painting(String name, String timeCreated, String artist, String location, String medium) {
        super(name, timeCreated, artist, location);
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
