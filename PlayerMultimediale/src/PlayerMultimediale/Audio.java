package PlayerMultimediale;

public class Audio extends ElementoMultimediale implements Riproducibile {
	
	private int volume;
	private int durata;
	
	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;		
	}
	
	@Override
	public void play() {
		
		String esclamativo = "";
		
		for(int i=0; i<volume; i++) {
			esclamativo += "!";
		}
		for(int i=0; i<durata; i++) {
			System.out.println("Audio: "+titolo+" "+esclamativo+" riprodotti: "+(i+1)+" secondi, restanti altri: " + (durata-(i+1))+" secondi");
		}
		
	}
	
	@Override
	public void abbassaVolume() {
		volume--;			
	}
	
	@Override
	public void alzaVolume() {
		volume++;		
	}

}
