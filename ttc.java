/*
 * algorithme exercice2
 * 
 * variables  		double oldPrice,newPrice,TVA, numItem,total;

 * debut
 * 
 * ecrire("entrer le Ht");
 * lire(Ht);
 * 
 * ecrire("entrer le tva");
 * lire(tva);
 * 
 * ecrire("entrer le nombre articles");
 * lire(numItem);
 * 
 * 
*       numItem = scan.nextDouble();
		newPrice = oldPrice + (oldPrice*TVA/100);
		total = newPrice *numItem;
 * 
 * ecrire("le ttc est:" + newPrice):
 * ecrire("le total est:" + total):
 * 
 * fin
 * 
 */

package atelier2;
import java.util.Scanner;


public class ttc {

	
	
	public static void main(String[] args) {
		double oldPrice,newPrice,TVA, numItem,total;
	Scanner scan = new Scanner(System.in);
			
		System.out.println("entrer le prix HT");
		oldPrice = scan.nextDouble();
		System.out.println("entrer le tva");
		TVA = scan.nextDouble();
		System.out.println("entrer le Nombre des articles");
		numItem = scan.nextDouble();
		newPrice = oldPrice + (oldPrice*TVA/100);
		total = newPrice *numItem;
		
		System.out.println("le ttc est : " + newPrice);
		System.out.println("le total est : " + total);

		scan.close();
	}

}
