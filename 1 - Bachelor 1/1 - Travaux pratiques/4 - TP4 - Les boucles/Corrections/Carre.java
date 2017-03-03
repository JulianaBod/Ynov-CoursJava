package TP4;

import java.util.Scanner;

public class Carre {

	public static void main(String[] args) {
		int taille;
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Taille du côté ?");
		taille = saisie.nextInt();
		
		for(int i= 1; i <= taille; i++){
			for(int j = 1; j <= taille; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
