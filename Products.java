package homework4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class Products {
	 public static final List<Song> SONG_LIST = new ArrayList<>();
     public static final List<MusicAlbum> MUSIC_ALBUMS = new ArrayList<>();
     Scanner input = new Scanner(System.in);
     
     void generateLists() {
     SONG_LIST.add(new Song("Crowded Room","Selena Gomez", 3.06 , "Rare"));
     SONG_LIST.add(new Song("Look at her now","Selena Gomez", 2.43 , "Rare"));
     SONG_LIST.add(new Song("Drama Club","Melanie Martinez", 3.45 , "K-12"));
     SONG_LIST.add(new Song("Teddy Bear","Melanie Martinez", 4.05 , "Cry Baby"));
     SONG_LIST.add(new Song("She","Harry Styles", 6.02 , "Fine Line"));
     SONG_LIST.add(new Song("The Beach","The Neighbourhood", 4.15 , "Wiped Out"));
     }
     
     void SongSearch(String Songname) {
    	 for(Song a : SONG_LIST) {
    		 if (a.nameOfTheSong.equals(Songname)) {
    			 System.out.println("The "+Songname+" song is founded"+"Please write 1 to add it to basket");
    			 int choice= input.nextInt();
    			 if(choice ==1) {
    				 
    				 System.out.println("Song is added to the basket");
    			 }
    		 }
    	}

	}
}
