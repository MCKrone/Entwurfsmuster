package iteratorComposite;

import java.util.ArrayList;
import java.util.Iterator;

public class Komponente extends Geb�udeKomponente{

	ArrayList<Geb�udeKomponente> geb�udeKomponenten = new ArrayList<Geb�udeKomponente>();
	
	String funktion;
	String name;
	
	public Komponente(String funktion, String name) {
		this.funktion = funktion;
		this.name = name;
	}
	
	@Override
	public void hinzuf�gen(Geb�udeKomponente gKomponente) {
		geb�udeKomponenten.add(gKomponente);
	}
	
	@Override
	public void entfernen(Geb�udeKomponente gKomponente) {
		geb�udeKomponenten.remove(gKomponente);
	}
	
	@Override
	public Geb�udeKomponente getKind(int i) {
		return geb�udeKomponenten.get(i);
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
		
		Iterator<Geb�udeKomponente> iterator = geb�udeKomponenten.iterator();
		
		while(iterator.hasNext()) {
			Geb�udeKomponente geb�udeK = iterator.next();
			geb�udeK.zeichnen();
		}
	}
}
