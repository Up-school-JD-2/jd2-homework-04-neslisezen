package homework4;
import java.util.Scanner;

public class MusicStore {

	public static void main(String[] args) {
		int option=0;
		Scanner input = new Scanner(System.in);
		System.out.println("***Welcome to the Music Store***");
		
		here: while(true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
		      System.out.println("1- Register");
		      System.out.println("2- Search for a song");
		      System.out.println("3- Search for a music album");
		      System.out.println("4- Review the shopping Basket");
		      System.out.println("5- Log out");
		      System.out.println("~~~~~~~~~~~~~~~~~");
		      option = input.nextInt();
		      
		switch(option) {
		case 1:
			System.out.println("Write your first name: ");
			var userName = input.next();
			System.out.println("Write your last name: ");
			var userSurname = input.next();
			Account account= new Account(userName,userSurname);
			System.out.println("Account is created**");
			break;
		case 2:
			System.out.println("Write of the song name you want to search: ");
			String Songname = input.next();
			
			break;
		case 3:
			System.out.println("Write of the album name you want to search: ");
			String Albumname = input.nextLine();
			break;
		case 4:
			Cash.Basketinfo();
			break;
		case 5:
			System.out.println("See you next time :)");
			break here;
		}
		}
		input.close();
	}

}
