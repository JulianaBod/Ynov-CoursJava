package TP4;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		int nombre;
		float a, resultat;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Combien de nombres seront étudiés ?");
		nombre = saisie.nextInt();
		System.out.println("Nombre 1 ?");
		resultat = saisie.nextFloat();		
		for(int i = 2; i <= nombre; i++){
			System.out.println("Nombre " + i + " ?");
			a = saisie.nextFloat();
			if(a > resultat){
				resultat = a;
			}
		}
		System.out.println("Le maximum est : " + resultat);
	}
}
