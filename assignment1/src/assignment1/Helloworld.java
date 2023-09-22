package assignment1;
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!");
        
        System.out.print("How are you doing?  ");
        String answer = scanner.nextLine();

        scanner.close();
		
	}

}
