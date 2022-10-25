
public class ��ȸ�ǽ�View implements IView {
	public ��ȸ�ǽ�����[] privateRooms;
	public ��ȸ�ǽ�Server roomServer;
	public IUser[] allUsers;
	public IUser currentUser;
	
	public ��ȸ�ǽ�View(��ȸ�ǽ�Server roomServer, IUser currentUser, IUser[] allUsers) {
		this.roomServer = roomServer;
		this.currentUser = currentUser;
		this.allUsers = allUsers;
	}
		
	@Override
	public void update(IUser[] users) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void list��ȸ�ǽ�() {
		System.out.println("\n");
		if(privateRooms != null && privateRooms.length > 0) {
			for(int i = 0 ; i < privateRooms.length ; i++) {
				System.out.println(privateRooms[i].roomName);
				for(int j = 0 ;j < allUsers.length ; j++) {
					if(((User)allUsers[j]).roomID == privateRooms[i].ID) {
						System.out.println(((User)allUsers[j]).name + "��");
					}
				}
			}
		} else {
			System.out.println("��ȸ�ǽ� ����");
		}
	}
	
	public void createPrivateRoom() {
		if(((User)currentUser).privilege == Privilege.HOST) {
			if(roomServer.addRoom() == true)
			{
				privateRooms = roomServer.getRooms();
				System.out.println("��ȸ�ǽ� ���� �Ϸ� - " + privateRooms[privateRooms.length - 1].roomName);
			} else {
				System.out.println("�� �̻� ��ȸ�ǽ��� ������ �� �����ϴ�.");
			}
		}
	}

	
}
