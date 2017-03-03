package TP4;

import java.util.Scanner;

public class Factorielle {
	public static void main(String[] args){
		int nombreFactorielle, resultat;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez un entier");
		nombreFactorielle = saisie.nextInt();
		resultat = 1;
		for(int i = 1; i <= nombreFactorielle; i++){
			resultat = resultat * i;
		}
		System.out.println(nombreFactorielle + "! = " + resultat);
	}
}
