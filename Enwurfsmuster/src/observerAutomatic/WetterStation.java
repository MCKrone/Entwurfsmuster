package observerAutomatic;

public class WetterStation {
	public static void main(String[] args) {
		Wetterdaten wetterDaten = new Wetterdaten();
		
		AktuelleBedingungenAnzeigen aktuelleAnzeige = new AktuelleBedingungenAnzeigen(wetterDaten);
		
		wetterDaten.setMesswerte(30, 65, 40.4f);
	}
}
