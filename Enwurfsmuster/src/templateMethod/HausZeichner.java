package templateMethod;

import iteratorComposite.Komponente;
import iteratorComposite.GebäudeKomponente;

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
	void erstelleGebäude() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		GebäudeKomponente skyscraper = new Komponente("h", "Skycraper");
		
		GebäudeKomponente bungalow = new Komponente("h", "Bungalow");
		
		GebäudeKomponente familyHouse1= new Komponente("h", "1-Familien-Haus");
		
		GebäudeKomponente familyHouse2= new Komponente("h", "1-Familien-Haus");
		
		GebäudeKomponente häuser = new Komponente("Stadt","Alle");
		häuser.hinzufügen(skyscraper);
		häuser.hinzufügen(bungalow);
		häuser.hinzufügen(familyHouse1);
		häuser.hinzufügen(familyHouse2);
		
		GebäudeKomponente geschoss = new Komponente("g","Geschoss1");
		GebäudeKomponente geschoss2 = new Komponente("g","Geschoss2");
		skyscraper.hinzufügen(geschoss);
		skyscraper.hinzufügen(geschoss2);
		
		GebäudeKomponente flur = new Komponente("f","Flur 1");
		geschoss.hinzufügen(flur);
		
		GebäudeKomponente raum = new Komponente("r", "Raum 1");
		flur.hinzufügen(raum);
		
		
		skyscraper.zeichnen();
		
		new HausZeichner().bauanleitung();
	}

}
