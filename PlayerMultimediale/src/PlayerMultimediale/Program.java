package PlayerMultimediale;

import java.util.Scanner;

public class Program {
	
	// implementiamo lo "Scanner" per inserire dei valori letti da tastiera
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		// creiamo un array di "ElementoMultimediale" di cinque elementi
		
		ElementoMultimediale[] m = new ElementoMultimediale[5];
		
		// lanciamo i metodi "creaArray" e "eseguiOggetto" nel main
		
		creaArray(m);
		eseguiOggetto(m);		

	}
	
	// creiamo un metodo "creaArray" che ci permetterà di riempire l'array "ElementoMultimediale[] m" tramite valori letti da tastiera
	
	public static void creaArray(ElementoMultimediale[] m) {
		
		// creiamo un ciclo "for" che si ripeterà un numero di volte pari alla lunghezza dell'array "ElementoMultimediale[] m"
		
		for(int i=0; i<(m.length); i++) {
			
			// stampiamo in console le istruzioni per l'utente
			
			System.out.println("Memorizza elemento " + (i + 1) + "/5");
			System.out.println("Tipo:");
			System.out.println("1-Audio 2-Video 3-Immagine");
			
			// creiamo una variabile che ci descriverà il tipo di oggetto tramite un valore letto da tastiera
			
			int tipo = Integer.parseInt(scanner.nextLine());
			
			// se l'oggetto è di tipo "1-Audio"
			
			if(tipo == 1) {
				
				// creiamo una variabile per inserire il titolo da tastiera
				
				System.out.println("Inserisci il titolo");
				String titolo = scanner.nextLine();
				
				// una variabile per inserire il volume
				
				System.out.println("Inserisci il volume");
				int volume = Integer.parseInt(scanner.nextLine());
				
				// una variabile per inserire la durata
				
				System.out.println("Inserisci la durata");
				int durata = Integer.parseInt(scanner.nextLine());
				
				// istanziamo l'audio appena creato e lo inseriamo nell'array
				
				Audio aud = new Audio(titolo, volume, durata);
				m[i] = aud;
				
				// se l'oggetto è di tipo "2-Video"
				
			} else if(tipo == 2) {
				
				// creiamo una variabile per inserire il titolo da tastiera
				
				System.out.println("Inserisci il titolo");
				String titolo = scanner.nextLine();
				
				// una variabile per inserire la luminosità
				
				System.out.println("Inserisci la luminosità");
				int luminosita = Integer.parseInt(scanner.nextLine());
				
				// una variabile per inserire la durata
				
				System.out.println("Inserisci la durata");
				int durata = Integer.parseInt(scanner.nextLine());
				
				// una variabile per inserire il volume
				
				System.out.println("Inserisci il volume");
				int volume = Integer.parseInt(scanner.nextLine());
				
				// istanziamo il video appena creato e lo inseriamo nell'array
				
				Video vid = new Video(titolo, luminosita, durata, volume);
				m[i] = vid;
				
				// se l'oggetto è di tipo "3-Immagine"
				
			} else if(tipo == 3) {
				
				// creiamo una variabile per inserire il titolo da tastiera
				
				System.out.println("Inserisci il titolo");
				String titolo = scanner.nextLine();
				
				// una variabile per inserire la luminosità
				
				System.out.println("inserisci la luminosità");
				int luminosita = Integer.parseInt(scanner.nextLine());
				
				// istanziamo l'immagine appena creata e la inseriamo nell'array
				
				Immagine img = new Immagine(titolo, luminosita);
				m[i] = img;
				
			}
			
		}
		
	}
	
	// creiamo il metodo "eseguiOggetto" che chiederà ripetutamente all'utente quale oggetto dell'array vuole eseguire
	
	public static void eseguiOggetto(ElementoMultimediale[] m) {
		
		// creiamo una variabile per l'input dell'utente inizialmente impostata a 0
		
		int inputUtente = 0;
		
		// creiamo un ciclo "do while" per permettere al metodo di ripetersi finchè l'utente non voglia interrompere la riproduzione
		
		do {
			
			// stampiamo in console le istruzioni per l'utente e implementiamo lo scanner per permettergli di inserire i valori da tastiera
			
			System.out.println("Digita un numero da 1 a 5 per riprodurre un oggetto, oppure 0 per interrompere");
			inputUtente = Integer.parseInt(scanner.nextLine());
			
			// creiamo una variabile che identifica gli oggetti interni all'array
			
			int numeroOggetto = inputUtente - 1;
			
			// se "inputUtente" è 0 terminerà la riproduzione
			
			if (inputUtente == 0) {
				System.out.println("Riproduzione terminata");
			}
			
			// se l'oggetto selezionato è un istanza di "Immagine" verrà lanciato il metodo "show"

			else if (m[numeroOggetto] instanceof Immagine) {
				m[numeroOggetto].show();
			}
			
			// se l'oggetto selezionato è un istanza di "Audio" o di "Video" verrà lanciato il metodo "play"

			else if (m[numeroOggetto] instanceof Audio || m[numeroOggetto] instanceof Video) {
				m[numeroOggetto].play();
			}
			
			// il ciclo si ripeterà fin quando l'utente non digita lo 0
			
		} while(inputUtente != 0);
		
	}

}
