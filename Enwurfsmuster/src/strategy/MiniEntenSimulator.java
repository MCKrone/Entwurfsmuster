package strategy;

public class MiniEntenSimulator{
	public static void main(String[] args) {
		Ente mallard = new Stockente();		
		mallard.tuQuaken();
		mallard.tuFliegen();
		
		Ente modell = new Modellente();
		modell.tuFliegen();
		modell.setFlugVerhalten(new FliegtRaketenGetrieben());
		modell.tuFliegen();
	}
}
