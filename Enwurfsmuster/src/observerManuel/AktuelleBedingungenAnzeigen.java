package observerManuel;

public class AktuelleBedingungenAnzeigen implements Beobachter, AnzeigeElement{
	
	private float temperatur;
	private float feuchtigkeit;
	private Subjekt wetterdaten;
	
	public AktuelleBedingungenAnzeigen(Subjekt wetterdaten) {
		// TODO Auto-generated constructor stub
		this.wetterdaten = wetterdaten;
		this.wetterdaten.registriereBeobachter(this);
	}
	@Override
	public void aktualisieren(float temp, float feucht, float druck) {
		// TODO Auto-generated method stub
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		anzeigen();
	}
	@Override
	public void anzeigen() {
		// TODO Auto-generated method stub
		System.out.println("Aktuelle Wetterbedingungen: " + temperatur
				+ " °C und " + feuchtigkeit + "% Feuchtigkeit");
	}
}
