import java.util.Scanner;

public class Main {
	
	static int input = 0;
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Saississez un nombre \n");
		try  {
			input = keyboard.nextInt();
		}
		catch (Exception InputMismatchException){
			System.out.println("Erreur de saisie");
		}

	}

}
