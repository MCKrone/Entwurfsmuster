package strategy;

public class FliegtMitFluegeln implements Flugverhalten {
	@Override
	public void fliegen() {
		System.out.println("Ich fliege");
	}
}
