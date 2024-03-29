package PlayerMultimediale;

// creiamo la classe "Video" che estende la classe astratta "ElementoMultimediale" e implementa le interfacce "Riproducibile" e "Visualizzabile"

public class Video extends ElementoMultimediale implements Riproducibile, Visualizzabile {
	
	private int volume;
	private int luminosita;
	private int durata;
	
	// il costruttore accetterà quattro parametri in ingresso, il titolo viene ereditato dalla classe astratta "ElementoMultimediale"

	public Video(String titolo, int luminosita, int durata, int volume) {
		super(titolo);
		this.luminosita = luminosita;
		this.durata = durata;
		this.volume = volume;
		
	}
	
	// creiamo il metodo "play" per la riproduzione del video
	
	@Override
	public void play() {
		
		// creiamo una variabile inizialmente vuota
		
		String asterisco = "";
		
		// creiamo un ciclo "for" che aggiungerà una sequenza di asterischi di lunghezza pari alla luminosità
		
		for(int i=0; i<luminosita; i++) {
			asterisco += "*";
		}
		
		// creiamo una variabile inizialmente vuota
		
		String esclamativo = "";
		
		// creiamo un ciclo "for" che aggiungerà una sequenza di punti esclamativi di lunghezza pari al volume
		
		for(int i=0; i<volume; i++) {
			esclamativo += "!";
		}
		
		// creiamo un ciclo "for" che stamperà in console il titolo, i punti esclamativi e gli asterischi dei cicli precedenti, un numero di volte pari alla durata
		
		for(int i=0; i<durata; i++) {
			System.out.println("Video: "+titolo+" "+esclamativo+" "+asterisco+ " riprodotti: "+(i+1)+" secondi, restanti altri: " + (durata-(i+1))+" secondi");
		}
		
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
	
	// creiamo un metodo che abbassa il volume

	@Override
	public void abbassaVolume() {
		volume--;		
	}
	
	// creiamo un metodo che alza il volume

	@Override
	public void alzaVolume() {
		volume++;		
	}

}
