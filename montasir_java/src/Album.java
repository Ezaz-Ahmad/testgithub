public class Album {
    private String name;
    private Song song1;
    private Song song2;
    private Song song3;
    private Song song4;
    private int totalTime;
    private final int MAX_TIME = 1200; // 20 minutes in seconds

    public Album(String name) {
        this.name = name;
        this.totalTime = 0;
    }

    public boolean addSong(Song song) {
        if (totalTime + song.getDuration() > MAX_TIME) {
            System.out.println("Error: Song duration exceeds album time limit.");
            return false;
        }

        if (song1 == null) {
            song1 = song;
        } else if (song2 == null) {
            song2 = song;
        } else if (song3 == null) {
            song3 = song;
        } else if (song4 == null) {
            song4 = song;
        } else {
            System.out.println("Error: Album is full, cannot add another song.");
            return false;
        }

        totalTime += song.getDuration();
        return true;
    }

    public boolean removeSong(Song song) {
        if (song1 == song) {
            song1 = null;
        } else if (song2 == song) {
            song2 = null;
        } else if (song3 == song) {
            song3 = null;
        } else if (song4 == song) {
            song4 = null;
        } else {
            System.out.println("Error: Song is not in the album.");
            return false;
        }

        totalTime -= song.getDuration();
        return true;
    }

    public String getName() {
        return name;
    }

    public Song getSong1() {
        return song1;
    }

    public Song getSong2() {
        return song2;
    }

    public Song getSong3() {
        return song3;
    }

    public Song getSong4() {
        return song4;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public boolean isEmpty() {
        return song1 == null && song2 == null && song3 == null && song4 == null;
    }
}
