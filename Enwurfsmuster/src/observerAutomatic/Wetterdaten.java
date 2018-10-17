package observerAutomatic;

import java.util.Observable;

public class Wetterdaten extends Observable{
	
	private float temperatur, feuchtigkeit, luftdruck;
	
	public Wetterdaten() {
		// TODO Auto-generated constructor stub
	}
	
	public void messwerteGe�ndert() {
		setChanged();
		notifyObservers();
	}
	
	public void setMesswerte(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		this.luftdruck = druck;
		messwerteGe�ndert();
	}
	
	public float getTemperatur() {
		return temperatur;
	}
	public float getFeuchtigkeit() {
		return feuchtigkeit;
	}
	public float getLuftdruck() {
		return luftdruck;
	}
}
