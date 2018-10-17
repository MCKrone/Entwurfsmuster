package composite_GoF;

public class Architect {

	public static void main(String[] args) {
		BuildingPart haus1 = new BuildingComposite("Haus 1", "Haus");
		
		BuildingPart level1 = new BuildingComposite("Level E", "Level");
		haus1.add(level1);
		
		BuildingPart floor1 = new BuildingComposite("Floor 1", "Floor");
		level1.add(floor1);
		
		floor1.add(new BuildingLeaf("Room 1", "Room"));
		
		haus1.drawPart();
	}
}
