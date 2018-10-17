package strategy;

public class Modellente extends Ente{
	public Modellente() {
		// TODO Auto-generated constructor stub	
		flugVerhalten = new FliegtGarNicht();
		quakVerhalten = new Quaken();
		
	}
	
	public void anzeigen() {
		System.out.println("Ich bin eine Modellente");
	}
}
