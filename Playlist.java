import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Playlist {
    private String name;
    private List<String> tracks;
    
    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }
    
    public void addTrack(String track) {
        tracks.add(track);
    }
    
    public int size() {
        return tracks.size();
    }
    
    public List<String> getTracks() {
        return Collections.unmodifiableList(tracks);
    }
}

class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Playlist");
        
        playlist.addTrack("Song 1");
        playlist.addTrack("Song 2");
        playlist.addTrack("Song 3");
        
        System.out.println("Playlist size: " + playlist.size());
        
        List<String> tracks = playlist.getTracks();
        System.out.println("Tracks: " + tracks);
        
        try {
            tracks.add("Song 4");
        } catch (Exception e) {
            System.out.println("Cannot modify tracks through getTracks()");
        }
    }
}