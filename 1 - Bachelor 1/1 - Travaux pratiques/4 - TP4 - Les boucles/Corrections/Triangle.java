package TP4;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int n;
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Taille du côté ?");
		n = saisie.nextInt();
		
		for(int i= 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}