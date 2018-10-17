package observerManuel;

import java.util.ArrayList;

public class Wetterdaten implements Subjekt{
	
	private ArrayList<Beobachter> beobachter;
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	
	public Wetterdaten() {
		// TODO Auto-generated constructor stub
		beobachter = new ArrayList<Beobachter>(); 
	}
	
	@Override
	public void benachrichtigeBeobachter() {
		// TODO Auto-generated method stub
		for (int i = 0; i < beobachter.size(); i++) {
			Beobachter b = (Beobachter)beobachter.get(i);
			b.aktualisieren(temperatur, feuchtigkeit, luftdruck);
		}
	}
	@Override
	public void entferneBeobachter(Beobachter b) {
		// TODO Auto-generated method stub
		int i = beobachter.indexOf(b);
		if(i >= 0)
			beobachter.remove(i);
	}
	@Override
	public void registriereBeobachter(Beobachter b) {
		// TODO Auto-generated method stub
		beobachter.add(b);
	}
	
	public void messwertGeändert() {
		benachrichtigeBeobachter();
	}
	
	public void setMesswerte(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		this.luftdruck = druck;
		messwertGeändert();
	}
}
