package PlayerMultimediale;

import java.util.Scanner;

public class Program {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		ElementoMultimediale[] m = new ElementoMultimediale[5];
		
		creaArray(m);
		eseguiOggetto(m);		

	}
	
	public static void creaArray(ElementoMultimediale[] m) {
		
		for(int i=0; i<(m.length); i++) {
			
			System.out.println("Memorizza elemento " + (i + 1) + "/5");
			System.out.println("Tipo:");
			System.out.println("1-Audio 2-Video 3-Immagine");
			
			int tipo = Integer.parseInt(scanner.nextLine());
			
			if(tipo == 1) {
				
				System.out.println("Inserisci il titolo");
				String titolo = scanner.nextLine();
				
				System.out.println("Inserisci il volume");
				int volume = Integer.parseInt(scanner.nextLine());
				
				System.out.println("Inserisci la durata");
				int durata = Integer.parseInt(scanner.nextLine());
				
				Audio aud = new Audio(titolo, volume, durata);
				m[i] = aud;
				
			} else if(tipo == 2) {
				
				System.out.println("Inserisci il titolo");
				String titolo = scanner.nextLine();
				
				System.out.println("Inserisci la luminosità");
				int luminosita = Integer.parseInt(scanner.nextLine());
				
				System.out.println("Inserisci la durata");
				int durata = Integer.parseInt(scanner.nextLine());
				
				System.out.println("Inserisci il volume");
				int volume = Integer.parseInt(scanner.nextLine());
				
				Video vid = new Video(titolo, luminosita, durata, volume);
				m[i] = vid;
				
			} else if(tipo == 3) {
				
				System.out.println("Inserisci il titolo");
				String titolo = scanner.nextLine();
				
				System.out.println("inserisci la luminosità");
				int luminosita = Integer.parseInt(scanner.nextLine());
				
				Immagine img = new Immagine(titolo, luminosita);
				m[i] = img;
				
			}
			
		}
		
	}
	
	public static void eseguiOggetto(ElementoMultimediale[] m) {
		
		int inputOggetto = 0;
		
		do {
			
			System.out.println("Digita un numero da 1 a 5 per riprodurre un oggetto, oppure 0 per interrompere");
			inputOggetto = Integer.parseInt(scanner.nextLine());
			
			int numeroOggetto = inputOggetto - 1;
			
			if (inputOggetto == 0) {
				System.out.println("Riproduzione terminata");
			}

			else if (m[numeroOggetto] instanceof Immagine && numeroOggetto > -1) {
				m[numeroOggetto].show();
			}

			else if (m[numeroOggetto] instanceof Audio || m[numeroOggetto] instanceof Video) {
				m[numeroOggetto].play();
			}
			
		} while(inputOggetto != 0);
		
	}

}
