import java.util.Scanner;

public class GettingInputs
{
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = value.nextInt();
        value.nextLine();

        System.out.print("Enter the genre: ");
        String genre = value.nextLine();

        System.out.print("Enter the album: ");
        String album = value.nextLine();
        
        System.out.print("Enter the song title: ");
        String song = value.nextLine();
        
        System.out.print("Enter the artist: ");
        String artist = value.nextLine();
        
        System.out.println("------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("------------------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: \"" + song + "\"");
        System.out.println("Artist: " + artist);

        value.close();
    }
}
