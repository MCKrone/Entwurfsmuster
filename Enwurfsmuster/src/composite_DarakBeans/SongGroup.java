package composite_DarakBeans;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
	
	ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();
	
	String groupName;
	String groupDescription;
	
	public SongGroup(String groupName, String groupDescription) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}
	
	@Override
	public void add(SongComponent newSongComponent) {
		songComponents.add(newSongComponent);
	}
	
	@Override
	public void remove(SongComponent newSongComponent) {
		songComponents.remove(newSongComponent);
	}
	
	@Override
	public SongComponent get(int index) {
		return songComponents.get(index);
	}
	
	@Override
	public void displaySongInfo() {
		System.out.println( getGroupName() + " " + getGroupDescription());
		
		Iterator<SongComponent> songIterator = songComponents.iterator();
		
		while(songIterator.hasNext()) {
			SongComponent songInfo = (SongComponent) songIterator.next();
			songInfo.displaySongInfo();
		}
	}

}
