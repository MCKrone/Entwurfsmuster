package observerAutomatic;

import java.util.Observable;
import java.util.Observer;

public class AktuelleBedingungenAnzeigen implements Observer, AnzeigeElement{
	
	private Observable observable;
	private float temperatur, feuchtigkeit;	
	
	public AktuelleBedingungenAnzeigen(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Wetterdaten) {
			Wetterdaten wetterdaten = (Wetterdaten) o;
			this.temperatur = wetterdaten.getTemperatur();		
			this.feuchtigkeit = wetterdaten.getFeuchtigkeit();
			anzeigen();
		}
	}
	@Override
	public void anzeigen() {
		// TODO Auto-generated method stub
		System.out.println("Aktuelle Bedingungen: "+ temperatur + "°C und "
				+ feuchtigkeit + "% Luftfeuchtigkeit");
	}
}
