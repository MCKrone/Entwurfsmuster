package templateMethod;

public abstract class HausbauTemplate {
	
	public final void bauanleitung() {
		erstelleRaum();
		erstelleGang();
		erstelleGeschoss();
		erstelleGebäude();
	}
	
	abstract void erstelleRaum();
	
	abstract void erstelleGang();
	
	abstract void erstelleGeschoss();
	
	abstract void erstelleGebäude();

}
