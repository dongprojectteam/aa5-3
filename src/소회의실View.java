
public class ��ȸ�ǽ�View implements IView {
	public ��ȸ�ǽ�����[] privateRooms;
	public ��ȸ�ǽ�Server roomServer;
	public IUser[] allUsers;
	public IUser currentUser;
	public UserPool userPool;
	
	public ��ȸ�ǽ�View(UserPool userPool, ��ȸ�ǽ�Server roomServer, IUser currentUser, IUser[] allUsers) {
		this.userPool = userPool;
		this.roomServer = roomServer;
		this.currentUser = currentUser;
		this.allUsers = allUsers;
	}
		
	@Override
	public void update(IUser currentUser, IUser[] users) {
		// TODO Auto-generated method stub
		this.currentUser = currentUser;
		allUsers = users;
	}
	

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void list��ȸ�ǽ�() {
		System.out.println("\n");
		if(privateRooms != null && privateRooms.length > 0) {
			for(int i = 0 ; i < privateRooms.length ; i++) {
				System.out.println(((User)currentUser).name + "���� �ý��� - " + privateRooms[i].roomName + " (" + privateRooms[i].ID + ")");
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
				this.updateRooms();
				System.out.println("��ȸ�ǽ� ���� �Ϸ� - " + privateRooms[privateRooms.length - 1].roomName);
			} else {
				System.out.println("�� �̻� ��ȸ�ǽ��� ������ �� �����ϴ�.");
			}
		} else {
			System.out.println("������ ������ �����ϴ�.");
		}
	}
	
	public void updateRooms() {
		privateRooms = roomServer.getRooms();
		repaint();
	}
	
	public void enterRoom(int roomID) {
		if(((User)currentUser).roomID == 0) {
			((User)currentUser).roomID = roomID;
			userPool.modifyUser(currentUser);
		}
		else
			System.out.println("�Ұ����� ����");
	}
	
	public int getTestRoomNumber() {
		return privateRooms[0].ID;
	}

	
}
