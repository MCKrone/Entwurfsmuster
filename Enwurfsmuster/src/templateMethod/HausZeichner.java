package templateMethod;

import iteratorComposite.Komponente;
import iteratorComposite.Geb�udeKomponente;

public class HausZeichner extends HausbauTemplate{

	@Override
	void erstelleRaum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void erstelleGang() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void erstelleGeschoss() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void erstelleGeb�ude() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Geb�udeKomponente skyscraper = new Komponente("h", "Skycraper");
		
		Geb�udeKomponente bungalow = new Komponente("h", "Bungalow");
		
		Geb�udeKomponente familyHouse1= new Komponente("h", "1-Familien-Haus");
		
		Geb�udeKomponente familyHouse2= new Komponente("h", "1-Familien-Haus");
		
		Geb�udeKomponente h�user = new Komponente("Stadt","Alle");
		h�user.hinzuf�gen(skyscraper);
		h�user.hinzuf�gen(bungalow);
		h�user.hinzuf�gen(familyHouse1);
		h�user.hinzuf�gen(familyHouse2);
		
		Geb�udeKomponente geschoss = new Komponente("g","Geschoss1");
		Geb�udeKomponente geschoss2 = new Komponente("g","Geschoss2");
		skyscraper.hinzuf�gen(geschoss);
		skyscraper.hinzuf�gen(geschoss2);
		
		Geb�udeKomponente flur = new Komponente("f","Flur 1");
		geschoss.hinzuf�gen(flur);
		
		Geb�udeKomponente raum = new Komponente("r", "Raum 1");
		flur.hinzuf�gen(raum);
		
		
		skyscraper.zeichnen();
		
		new HausZeichner().bauanleitung();
	}

}
