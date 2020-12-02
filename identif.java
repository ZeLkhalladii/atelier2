package atelier2;
import java.util.Scanner;

public class identif {

	public static void main(String[] args) {

		String genre;
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("tu es un homme ou une femme :");
		genre = scanner.next();
		System.out.println("entrez votre age :");
		age = scanner.nextInt();
		
		if(age<18) {
			System.out.println("vous êtes (un/une) " +genre+" mineur");
			
		}else {
			System.out.println("vous êtes un/une " + genre+ " major");
		}
		scanner.close();
	}

}
