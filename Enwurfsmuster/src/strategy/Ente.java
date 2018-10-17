package strategy;

public abstract class Ente {

	Flugverhalten flugVerhalten;
	Quakverhalten quakVerhalten;
	
	public Ente() {
	}
	
	public void tuFliegen() {
		flugVerhalten.fliegen();
	}
	
	public void tuQuaken() {
		quakVerhalten.quaken();
	}
	
	public void schwimmen() {
		System.out.println("Alle Enten schwimmen");
	}
	
	public void setFlugVerhalten(Flugverhalten flugVerhalten) {
		this.flugVerhalten = flugVerhalten;
	}
	
	public void setQuakVerhalten(Quakverhalten quakVerhalten) {
		this.quakVerhalten = quakVerhalten;
	}
}
