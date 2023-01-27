package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String userCommand = "";

		
		while (!userCommand.equals("x"))  {
			
			Scanner s=new Scanner (System.in);
			
			System.out.println("Benarrivato utente. Cosa vuoi fare?");
			System.out.println("n - per inserire il prodotto");
			System.out.println("x - per uscire");
			userCommand=(s.nextLine());
			
			if (userCommand.equals("n")) {
				
				String nome = "";
				String descr = "";
				double prezzo = 0;
				
				System.out.println("Stai inserendo un nuovo prodotto.");
				System.out.println("Inserisci il nome del prodotto.");				
				nome=(s.nextLine());
				System.out.println("Inserisci la descrizione del prodotto.");				
				descr=(s.nextLine());
				System.out.println("Inserisci il prezzo netto del prodotto.");				
				prezzo=(s.nextDouble());				
			
				Prodotto p= new Prodotto (nome,descr,prezzo);
					
				System.out.println("Ecco i dati che hai inserito");			
				System.out.println("Nome prodotto: " + (p.getName()));
				System.out.println("Codice prodotto: " + (p.getCode()));						
				System.out.println("Prezzo prodotto: " + (p.getBasePrice()) + "€");						
				System.out.println("Prezzo ivato prodotto: " + (p.getTaxedPrice()) + "€");										
			}
			s.close();
		};
			
		System.out.println("Arrivederci utente, grazie per aver scelto LeppoEngine.");
		
	}
}
