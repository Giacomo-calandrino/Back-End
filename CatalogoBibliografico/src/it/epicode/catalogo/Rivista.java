package it.epicode.catalogo;

// generiamo la classe "Rivista" che estende "Catalogo"

public class Rivista extends Catalogo {

	// definiamo gli attributi specifici

	Periodicita periodicita;

	// generiamo il costruttore inserendo gli attributi della classe astratta e
	// quelli specifici di "Rivista"

	public Rivista(String codiceISBN, String titolo, String annoPubblicazione, int numeroPagine,
			Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		// attributi specifici
		this.periodicita = periodicita;

	}

	// generiamo getter e setter

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	// generiamo il metodo "toString"

	@Override
	public String toString() {
		return "Rivista [periodicita= " + periodicita + ", codiceISBN= " + codiceISBN + ", titolo= " + titolo
				+ ", annoPubblicazione= " + annoPubblicazione + ", numeroPagine= " + numeroPagine + "]";
	}

}
