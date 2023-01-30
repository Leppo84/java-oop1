//Nel progetto java-oop-bank, package jana60.bank, creare la classe Conto caratterizzata da:
//- numero di conto
//- nome del proprietario
//- saldo
//Usate opportunamente i costruttori ed eventuali altri metodi di “utilità” per fare in modo che:
//- alla creazione di un nuovo conto il saldo sia 0€
//- siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
//- altri metodi per ritornare le informazioni del conto e il saldo formattato
//Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
//Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o prelevare una somma di denaro o uscire. Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto. Se l’operazione non è valida mostriamo un messaggio di errore. Se l’operazione va a buon fine mostriamo il saldo attuale del conto.
//Il menu continua ad apparire fino a che l’utente sceglie di uscire.

package org.lessons.java.bank;

import java.util.Random;

public class Conto {
	
	int accountNumber;
	String accountOwner;
	double accountValue;
	boolean fundError;
	
	public Conto(String accountOwner) {
		super();
		Random r=new Random();
		this.accountNumber = r.nextInt(1000);
		this.accountOwner = accountOwner;
		this.accountValue = 0;
		this.fundError = false;
	}
	
	double deposit(double raiseAmount) {
		this.accountValue += raiseAmount;
		return accountValue;
	}
	
	double withdraw(double dropAmount) {
		if (this.accountValue < dropAmount) {
			fundError = true;	
			return accountValue;
		}
		else {
			this.accountValue -= dropAmount;
			return accountValue;
		}
		
	}
	

	
	
	
	
	

}