package PlayerMultimediale;

// creiamo la classe "Immagine" che estende la classe astratta "ElementoMultimediale" e implementa l'interfaccia "Visualizzabile"

public class Immagine extends ElementoMultimediale implements Visualizzabile {
	
	int luminosita;
	
	// il costruttore accetterà due parametri in ingresso, il titolo viene ereditato dalla classe astratta "ElementoMultimediale"

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;		
	}
	
	// creiamo un metodo "show" per la visualizzazione dell'immagine
	
	@Override
	public void show() {
		
		// creiamo una variabile inizialmente vuota
		
		String asterisco = "";
		
		// creiamo un ciclo "for" che aggiungerà una sequenza di asterischi di lunghezza pari alla luminosità
		
		for(int i=0; i<luminosita; i++) {
			asterisco += "*";
		}
		
		// stampiamo in console il titolo e gli asterischi del ciclo precedente
		
		System.out.println("Immagine: "+titolo+" "+asterisco);
		
	}
	
	// creiamo un metodo che aumenta la luminosità

	@Override
	public void aumentaLuminosita() {
		luminosita++;		
	}
	
	// creiamo un metodo che diminuisce la luminosità

	@Override
	public void diminuisciLuminosita() {
		luminosita--;		
	}

}
