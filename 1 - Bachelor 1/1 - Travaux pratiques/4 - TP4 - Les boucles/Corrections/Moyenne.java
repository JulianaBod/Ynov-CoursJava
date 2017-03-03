package TP4;

import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		int n;
		float a, resultat;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Combien de nombres seront calculés dans la moyenne ?");
		n = saisie.nextInt();
		resultat = 0;
		
		for(int i = 1; i <= n; i++){
			System.out.println("Nombre " + i + " ?");
			a = saisie.nextFloat();
			resultat = resultat +  a;
		}
		System.out.println("La moyenne : " + resultat/n);
	}
}
