package iteratorComposite;

import java.util.ArrayList;
import java.util.Iterator;

public class Komponente extends GebäudeKomponente{

	ArrayList<GebäudeKomponente> gebäudeKomponenten = new ArrayList<GebäudeKomponente>();
	
	String funktion;
	String name;
	
	public Komponente(String funktion, String name) {
		this.funktion = funktion;
		this.name = name;
	}
	
	@Override
	public void hinzufügen(GebäudeKomponente gKomponente) {
		gebäudeKomponenten.add(gKomponente);
	}
	
	@Override
	public void entfernen(GebäudeKomponente gKomponente) {
		gebäudeKomponenten.remove(gKomponente);
	}
	
	@Override
	public GebäudeKomponente getKind(int i) {
		return gebäudeKomponenten.get(i);
	}
	
	@Override
	public String getFunktion() {
		return funktion;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void zeichnen() {
		System.out.println("* " + funktion + " : " + name);
		System.out.println("--------------");
		
		Iterator<GebäudeKomponente> iterator = gebäudeKomponenten.iterator();
		
		while(iterator.hasNext()) {
			GebäudeKomponente gebäudeK = iterator.next();
			gebäudeK.zeichnen();
		}
	}
}
