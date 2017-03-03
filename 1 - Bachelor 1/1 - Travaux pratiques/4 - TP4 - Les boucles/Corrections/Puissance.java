package TP4;

import java.util.Scanner;

public class Puissance {

	public static void main(String[] args) {
		double a, resultat = 1;
		int n;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez un réel");
		a = saisie.nextDouble();
		
		System.out.println("Entrez une puissance entière");
		n = saisie.nextInt();
		
		if (n > 0){
			for(int i=1; i<=n; i++){
				resultat = resultat * a;
			}
		} else {
			for( int j = 1; j <= -n; j++){
				resultat = resultat / a;
			}
		}
		
		System.out.println(a + " puissance " + n + " = " + resultat);
	}
}
