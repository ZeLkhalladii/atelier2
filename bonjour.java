package atelier2;
/*
algorithme exercice1

variable nom:chaine de caract�re
                  
debut

ecrire ("entrez votre nom :");
lire(nom);

ecrire("bonjour "+ nom);

fin         
*/


import java.util.Scanner;

public class bonjour {
	
	 String nom;
	

	public static void main(String[] args) {
		
	    System.out.println("Quel est votre pr�nom ?");
	    
		try (Scanner typs = new Scanner(System.in)) {
			String nom = typs.next();
			System.out.println("bonjour "+ nom);
		}

	
	}

}