package PlayerMultimediale;

public class Immagine extends ElementoMultimediale implements Visualizzabile {
	
	int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;		
	}
	
	@Override
	public void show() {
		
		String asterisco = "";
		
		for(int i=0; i<luminosita; i++) {
			asterisco += "*";
		}
		
		System.out.println("Immagine: "+titolo+" "+asterisco);
		
	}

	@Override
	public void aumentaLuminosita() {
		luminosita++;		
	}

	@Override
	public void diminuisciLuminosita() {
		luminosita--;		
	}

}
