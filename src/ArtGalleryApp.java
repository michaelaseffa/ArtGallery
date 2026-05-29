import java.util.Scanner;

public class ArtGalleryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gallery gallery = new Gallery();


        Painting p1 = new Painting("The Persistence of Memory", "1931", "Salvador Dalí", "Catalonia, Spain", "Oil on canvas");
        Painting p2 = new Painting("The Night Watch", "1642", "Rembrandt van Rijn", "Amsterdam, Netherlands", "Oil on canvas");
        gallery.addArt(p1);
        gallery.addArt(p2);

        boolean running = true;

        System.out.println("Welcome to the Art Gallery");

        while (running) {
            System.out.println("\n1. Add Gallery");
            System.out.println("2. Display Gallery");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter art name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter time created: ");
                    String timeCreated = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter location: ");
                    String location = scanner.nextLine();

                    System.out.print("Is this a painting? (yes/no): ");
                    String isPainting = scanner.nextLine();

                    if (isPainting.equalsIgnoreCase("yes")) {
                        System.out.print("Enter medium (e.g., Oil, Watercolor): ");
                        String medium = scanner.nextLine();
                        Painting painting = new Painting(name, timeCreated, artist, location, medium);
                        gallery.addArt(painting);
                    } else {
                        Art art = new Art(name, timeCreated, artist, location);
                        gallery.addArt(art);
                    }
                    break;

                case 2:
                    gallery.displayGallery();
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting Art Gallery...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
