package TP4;

import java.util.Scanner;

public class SommeCarree {

	public static void main(String[] args) {
		int n, resultat;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Entrez un entier");
		n = saisie.nextInt();
		
		resultat = 0;
		
		for(int i = 1; i <= n; i++){
			resultat = resultat + i * i;
		}
		System.out.println("Somme des " + n + " premiers carrés : " + resultat);
	}
}
