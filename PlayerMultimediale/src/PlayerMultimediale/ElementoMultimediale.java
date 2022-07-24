package PlayerMultimediale;

// creiamo una classe astratta a cui faranno riferimento tutte le altre classi

public abstract class ElementoMultimediale {
	
	protected String titolo;
	
	public ElementoMultimediale (String titolo) {
		
		this.titolo = titolo;
		
	}
	public void play(){};
	public void show(){};

}
