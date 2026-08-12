import java.util.List;
import java.util.stream.*;

public class JukeboxStreams {

    public static void main(String[] args) {

        List<Song> songs = new Songs().getSongs();

        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().equals("Rock"))
                .collect(Collectors.toList());//equals find exact string 

        System.out.println("Rock Songs:");
        System.out.println(rockSongs);
	List<Song> containsrockSongs = songs.stream()//for more than one pipeline need to write songs.stream() again
		   .filter(song -> song.getGenre().contains("Rock"))
		   .collect(Collectors.toList());//contains find any string with Rock word
	System.out.println("Rock Songs using contains operation");
	System.out.println(containsrockSongs);
        List<Song> artistSongs = songs.stream()
		.filter(song -> song.getArtist().equals("The Beatles"))
		.collect(Collectors.toList());
        System.out.println("By Artist Name Beatles");
	System.out.println(artistSongs);
	List<Song> hSongs=songs.stream()
		.filter(song->song.getTitle().startsWith("H"))
		.collect(Collectors.toList());//The word song is just the parameter name. You can use any valid variable name
        System.out.println("Starts with H");
	System.out.println(hSongs);
	List<Song> recentSongs = songs.stream()
		.filter(song -> song.getYear()>1995)
		.collect(Collectors.toList());
	System.out.println("recentSongs");
	System.out.println(recentSongs);
	List<String> genres=songs.stream()
		.map(song->song.getGenre())
		.distinct()
		.collect(Collectors.toList());
	System.out.println("map");
	System.out.println(genres);
	String songTitle = "With a Little Help from My Friends";
        List<String> result = songs.stream()
                            .filter(song -> song.getTitle().equals(songTitle))
                            .map(song -> song.getArtist())
                            .filter(artist -> !artist.equals("The Beatles"))
                            .collect(Collectors.toList());
	System.out.println("Excluding Original Artists");
	System.out.println(result);
    }
}
