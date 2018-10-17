package strategy;

public class FliegtGarNicht implements Flugverhalten {
	@Override
	public void fliegen() {
		System.out.println("Ich kann nicht fliegen!");

	}
}
