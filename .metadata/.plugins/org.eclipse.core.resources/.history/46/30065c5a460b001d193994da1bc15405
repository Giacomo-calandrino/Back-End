package PlayerMultimediale;

public class Video extends ElementoMultimediale implements Riproducibile, Visualizzabile {
	
	private int volume;
	private int luminosita;
	private int durata;

	public Video(String titolo, int luminosita, int durata, int volume) {
		super(titolo);
		this.luminosita = luminosita;
		this.durata = durata;
		this.volume = volume;
		
	}
	
	@Override
	public void play() {
		
		String asterisco = "";
		
		for(int i=0; i<luminosita; i++) {
			asterisco += "*";
		}
		
		String esclamativo = "";
		
		for(int i=0; i<volume; i++) {
			esclamativo += "!";
		}
		
		for(int i=0; i<durata; i++) {
			System.out.println("Video: "+titolo+" "+esclamativo+" "+asterisco+ " riprodotti: "+(i+1)+" secondi, restanti altri: " + (durata-(i+1))+" secondi");
		}
		
	}

	@Override
	public void aumentaLuminosita() {
		luminosita++;		
	}

	@Override
	public void diminuisciLuminosita() {
		luminosita--;		
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
