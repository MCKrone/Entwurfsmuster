package composite_DarakBeans;

public class SongListGenerator {
	
	public static void main(String[] args) {
		
		SongComponent industrialMusic = new SongGroup("\nIndustrial", "Description");
		SongComponent heavyMetal = new SongGroup("\nHeavy Metal", "Description");
		
		SongComponent everySong = new SongGroup("Song List", "Description");
		
		everySong.add(industrialMusic);
		
		industrialMusic.add(new Song("Titel 1", "Album", 1999));
		industrialMusic.add(new Song("Titel 2", "Album", 1999));
		industrialMusic.add(new Song("Titel 3", "Album", 1999));
		
		everySong.add(heavyMetal);
		
		heavyMetal.add(new Song("Titel 1", "Album", 1999));
		heavyMetal.add(new Song("Titel 2", "Album", 1999));
		heavyMetal.add(new Song("Titel 3", "Album", 1999));
		
		SongComponent heavyMetalSubalbum = new SongGroup("\nHM-Dark", "Description");
		
		heavyMetal.add(heavyMetalSubalbum);
		
		heavyMetalSubalbum.add(new Song("Titel 1", "Album", 1999));
		heavyMetalSubalbum.add(new Song("Titel 2", "Album", 1999));
		heavyMetalSubalbum.add(new Song("Titel 3", "Album", 1999));		
		
		DiscJockey crazyLarry = new DiscJockey(everySong);
		crazyLarry.getSongList();
	}

}
