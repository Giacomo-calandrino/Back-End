package PlayerMultimediale;

// creiamo la classe "Audio" che estende la classe astratta "ElementoMultimediale" e implementa l'interfaccia "Riproducibile"

public class Audio extends ElementoMultimediale implements Riproducibile {
	
	private int volume;
	private int durata;
	
	// il costruttore accetterà tre parametri in ingresso, il titolo viene ereditato dalla classe astratta "ElementoMultimediale"
	
	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;		
	}
	
	// creiamo il metodo "play" per la riproduzione dell'audio
	
	@Override
	public void play() {
		
		// creiamo una variabile inizialmente vuota
		
		String esclamativo = "";
		
		// creiamo un ciclo "for" che aggiungerà una sequenza di punti esclamativi di lunghezza pari al volume
		
		for(int i=0; i<volume; i++) {
			esclamativo += "!";
		}
		
		// creiamo un ciclo "for" che stamperà in console il titolo e i punti esclamativi del ciclo precedente un numero di volte pari alla durata
		
		for(int i=0; i<durata; i++) {
			System.out.println("Audio: "+titolo+" "+esclamativo+" riprodotti: "+(i+1)+" secondi, restanti altri: " + (durata-(i+1))+" secondi");
		}
		
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
