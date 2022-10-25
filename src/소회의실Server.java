import java.util.ArrayList;

public class 소회의실Server {
	public int index;
	public ArrayList<소회의실정보> rooms;
	
	public 소회의실Server() {
		index = 1;
		rooms = new ArrayList<소회의실정보>();
	}
	
	public 소회의실정보[] getRooms() {
		return rooms.toArray(new 소회의실정보[0]);
	}
	
	public boolean addRoom() {
		if(rooms.size() > 10) return false;
		소회의실정보 room = new 소회의실정보();
		room.ID = (int)(Math.random() * 10000);
		room.roomName = "소회의실-" + index;
		
		rooms.add(room);
		index++;
		return true;
	}
	
	public void deleteRoom(소회의실정보 room) {
		int i = rooms.indexOf(room);
		if(i>=0) {
			rooms.remove(i);
		}
	}
}
