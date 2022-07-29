package it.epicode.catalogo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class Program {
	
	// implementiamo l'interfaccia Map per memorizzare i dati
	
	public static Map<String, Catalogo> c = new HashMap<>();
		
	public static void main(String[] args) throws IOException {
		
		// istanziamo tutti i libri e le riviste che vogliamo aggiungere al nostro catalogo		

		Catalogo libro1 = new Libro("1234", "Libro 1", "2012", 963, "Autore 1", "Genere 1");
		Catalogo libro2 = new Libro("1534", "Libro 2", "2018", 763, "Autore 2", "Genere 2");
		Catalogo libro3 = new Libro("4294", "Libro 3", "2020", 523, "Autore 3", "Genere 3");
		Catalogo libro4 = new Libro("3234", "Libro 4", "2010", 876, "Autore 4", "Genere 4");
		Catalogo libro5 = new Libro("7034", "Libro 5", "2022", 126, "Autore 5", "Genere 5");
		Catalogo rivista1 = new Rivista("1321", "Rivista 1", "2020", 23, Periodicita.SETTIMANALE);
		Catalogo rivista2 = new Rivista("2721", "Rivista 2", "2019", 43, Periodicita.MENSILE);
		Catalogo rivista3 = new Rivista("4381", "Rivista 3", "2012", 51, Periodicita.SEMESTRALE);
		Catalogo rivista4 = new Rivista("9321", "Rivista 4", "2018", 22, Periodicita.SETTIMANALE);
		Catalogo rivista5 = new Rivista("4322", "Rivista 5", "2022", 63, Periodicita.MENSILE);
		
		// lanciamo il metodo per aggiungere gli elementi nel catalogo

		aggiungiElemento(libro1);
		aggiungiElemento(libro2);
		aggiungiElemento(libro3);
		aggiungiElemento(libro4);
		aggiungiElemento(libro5);
		aggiungiElemento(rivista1);
		aggiungiElemento(rivista2);
		aggiungiElemento(rivista3);
		aggiungiElemento(rivista4);
		aggiungiElemento(rivista5);
		
		// definiamo l'output della console

		System.out.println("CATALOGO INIZIALE COMPLETO:");
		c.forEach((k, v) -> System.out.println(v));
		System.out.println("----------------------------");
		System.out.println("");

		System.out.println("RICERCA PER ANNO (2012):");
		cercaAnnoPubblicazione("2012");
		System.out.println("----------------------------");
		System.out.println("");

		String ISBNCodeToSearch = "3234";
		System.out.println("RICERCA PER CODICE ISBN : (" + ISBNCodeToSearch + ")");
		cercaCodiceISBN(ISBNCodeToSearch);
		System.out.println("----------------------------");
		System.out.println("");

		System.out.println("RICERCA PER AUTORE (Autore 1):");
		cercaAutore("Autore 1");
		System.out.println("----------------------------");
		System.out.println("");
		
		// lanciamo il metodo che salva i dati nel catalogo

		salvaCatalogo();

		System.out.println("LETTURA DOPO SCRITTURA SU DISCO:");
		// lanciamo il metodo che carica i dati dal catalogo
		caricaCatalogo();

	}
	
	// generiamo un metodo per aggiungere gli elementi nel catalogo tramite il codice univoco
	
	public static void aggiungiElemento(Catalogo elemento) {
		c.put(elemento.getCodiceISBN(), elemento);
	}
	
	// generiamo un metodo per rimuovere gli elementi dal catalogo tramite il codice univoco

	public static void rimuoviElemento(Catalogo elemento) {
		c.remove(elemento.getCodiceISBN());
	}
	
	// generiamo un metodo per la ricerca tramite il codice ISBN

	public static void cercaCodiceISBN(String codiceISBN) {
		System.out.println(c.get(codiceISBN));
	}
	
	// generiamo un metodo per la ricerca tramite l'anno di pubblicazione

	public static void cercaAnnoPubblicazione(String annopubblicazione) {
		c.values().stream().filter(c -> c.getAnnoPubblicazione() == annopubblicazione)
				.forEach(System.out::println);

	}
	
	// generiamo un metodo per la ricerca tramite l'autore

	public static void cercaAutore(String autore) {
		c.values().stream().filter(e -> e instanceof Libro && ((Libro) e).getAutore() == autore)
				.forEach(System.out::println);
	}
	
	// generiamo un metodo per salvare i dati sul catalogo

	public static void salvaCatalogo() throws IOException {

		String catalogToText = "";

		for (Catalogo cat : c.values()) {
			catalogToText += (cat.toString() + ";");
		}

		File catalogFile = new File("./catalogo.txt");

		FileUtils.writeStringToFile(catalogFile, catalogToText, "UTF-8");
	}
	
	// generiamo un metodo per caricare i dati dal catalogo

	public static void caricaCatalogo() throws IOException {

		File file = new File("./catalogo.txt");

		String readString = FileUtils.readFileToString(file, "UTF-8");
		String[] catalog = readString.split(";");

		for (String element : catalog) {
			System.out.println(element);
		}

	}

}
