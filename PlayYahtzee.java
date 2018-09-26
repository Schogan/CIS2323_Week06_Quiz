import stuff.*;
import java.util.Scanner;

public class PlayYahtzee{
	public static void main(String[] args){
		
		boolean cont = true;
		Yahtzee game = new Yahtzee();
		char choice = 'a';
		Scanner inputDevice = new Scanner(System.in);
		
		while(cont){
			System.out.println("=================================== \n");
			System.out.println("What would you like to do? \n");
			System.out.println("r) Roll Dice \n");
			System.out.println("q) Quit Game \n");
			System.out.println("=================================== \n");
			
			choice = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			if (choice == 'r'){
				game.roll();
				
			}
			if (choice == 'q'){
				cont = false;
			}
		}
	}
}