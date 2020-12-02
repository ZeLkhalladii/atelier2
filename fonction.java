package atelier2;
/*
algorithme exercice1

variable nom:chaine de caractère
                  
debut

ecrire ("entrez votre nom :");
lire(nom);

ecrire ("entrez votre prenom :");
lire(prenom);

ecrire ("entrez votre age :");
lire(age);

ecrire("bonjour "+ nom + prenom+ "tu as"+ age+ " ans");

fin         
*/


import java.util.Scanner;

public class fonction {
	
	 String nom,PreNom;
	int age;
	
	public  fonction(String nom,String PreNom,int age) {
		this.nom=nom;
		this.PreNom=PreNom;
		this.age=age;

	}
	public static void main(String[] args) {
		Scanner typs = new Scanner(System.in);
	    System.out.println("Quel est votre nom ?");
	    String nom = typs.next();
	    System.out.println("Quel est votre prénom ?");
	    String pnom = typs.next();
	    System.out.println("Quel est votre age ?");

			String age = typs.next();
			System.out.println("bonjour "+ nom+" " + pnom+" tu as "+age+" ans");
		typs.close();
	}

}