package it.epicode.catalogo;

// generiamo la classe "Libro" che estende "Catalogo"

public class Libro extends Catalogo {

	// definiamo gli attributi specifici

	private String autore;
	private String genere;

	// generiamo il costruttore inserendo gli attributi della classe astratta e
	// quelli specifici di "Libro"

	public Libro(String codiceISBN, String titolo, String annoPubblicazione, int numeroPagine, String autore,
			String genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		// attributi specifici
		this.autore = autore;
		this.genere = genere;
	}

	// generiamo getter e setter

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	// generiamo il metodo "toString"

	@Override
	public String toString() {
		return "Libro [autore= " + autore + ", genere= " + genere + ", codiceISBN= " + codiceISBN + ", titolo= "
				+ titolo + ", annoPubblicazione= " + annoPubblicazione + ", numeroPagine= " + numeroPagine + "]";
	}

}
