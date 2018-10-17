package strategy;

public class Stockente extends Ente{
	public Stockente() {
		// TODO Auto-generated constructor stub
		quakVerhalten = new Quaken();
		flugVerhalten = new FliegtMitFluegeln();
	}
	
	public void anzeigen() {
		System.out.println("Ich bin eine Stockente");
	}
}
