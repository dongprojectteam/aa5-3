import java.util.ArrayList;

public class ��ȸ�ǽ�Server {
	public int index;
	public ArrayList<��ȸ�ǽ�����> rooms;
	
	public ��ȸ�ǽ�Server() {
		index = 1;
		rooms = new ArrayList<��ȸ�ǽ�����>();
	}
	
	public ��ȸ�ǽ�����[] getRooms() {
		return rooms.toArray(new ��ȸ�ǽ�����[0]);
	}
	
	public boolean addRoom() {
		if(rooms.size() > 10) return false;
		��ȸ�ǽ����� room = new ��ȸ�ǽ�����();
		room.ID = (int)(Math.random() * 10000);
		room.roomName = "��ȸ�ǽ�-" + index;
		
		rooms.add(room);
		index++;
		return true;
	}
	
	public void deleteRoom(��ȸ�ǽ����� room) {
		int i = rooms.indexOf(room);
		if(i>=0) {
			rooms.remove(i);
		}
	}
}
