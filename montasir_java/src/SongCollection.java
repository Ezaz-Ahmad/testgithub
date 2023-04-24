import java.util.ArrayList;
import java.util.Scanner;

public class SongCollection {
    private static final int MAX_ALBUMS = 3;
    private ArrayList<Album> albums;

    public SongCollection() {
        albums = new ArrayList<>();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Create an album");
            System.out.println("2. Add a song to an album");
            System.out.println("3. Display all songs from an album");
            System.out.println("4. Display all albums and their songs");
            System.out.println("5. Display all songs under a certain duration");
            System.out.println("6. Display all songs of a certain genre");
            System.out.println("7. Delete an album");
            System.out.println("8. Delete a song from an album");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    createAlbum(scanner);
                    break;
                case 2:
                    addSongToAlbum(scanner);
                    break;
                case 3:
                    displayAlbumSongs(scanner);
                    break;
                case 4:
                    displayAllAlbums();
                    break;
                case 5:
                    displaySongsUnderDuration(scanner);
                    break;
                case 6:
                    displaySongsOfGenre(scanner);
                    break;
                case 7:
                    deleteAlbum(scanner);
                    break;
                case 8:
                    deleteSong(scanner);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }

    private void createAlbum(Scanner scanner) {
      System.out.println("album created");
    }

    private void addSongToAlbum(Scanner scanner) {

    }

    private void displayAlbumSongs(Scanner scanner) {

    }

    private void displayAllAlbums() {

    }

    private void displaySongsUnderDuration(Scanner scanner) {

    }

    private void displaySongsOfGenre(Scanner scanner) {

    }

    private void deleteAlbum(Scanner scanner) {

    }

    private void deleteSong(Scanner scanner) {

    }

    public static void main(String[] args) {
        SongCollection songCollection = new SongCollection();
        songCollection.run();
    }
}
