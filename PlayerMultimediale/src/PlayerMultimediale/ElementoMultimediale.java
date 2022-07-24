package PlayerMultimediale;

public abstract class ElementoMultimediale {
	
	protected String titolo;
	
	public ElementoMultimediale (String titolo) {
		
		this.titolo = titolo;
		
	}
	public void play(){};
	public void show(){};

}
