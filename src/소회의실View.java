
public class 소회의실View implements IView {
	public 소회의실정보[] privateRooms;
	public 소회의실Server roomServer;
	public IUser[] allUsers;
	public IUser currentUser;
	public UserPool userPool;
	
	public 소회의실View(UserPool userPool, 소회의실Server roomServer, IUser currentUser, IUser[] allUsers) {
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
	
	
	public void list소회의실() {
		System.out.println("\n");
		if(privateRooms != null && privateRooms.length > 0) {
			for(int i = 0 ; i < privateRooms.length ; i++) {
				System.out.println(((User)currentUser).name + "님의 시스템 - " + privateRooms[i].roomName + " (" + privateRooms[i].ID + ")");
				for(int j = 0 ;j < allUsers.length ; j++) {
					if(((User)allUsers[j]).roomID == privateRooms[i].ID) {
						System.out.println(((User)allUsers[j]).name + "님");
					}
				}
			}
		} else {
			System.out.println("소회의실 없음");
		}
	}
	
	public void createPrivateRoom() {
		if(((User)currentUser).privilege == Privilege.HOST) {
			if(roomServer.addRoom() == true)
			{
				this.updateRooms();
				System.out.println("소회의실 생성 완료 - " + privateRooms[privateRooms.length - 1].roomName);
			} else {
				System.out.println("더 이상 소회의실을 생성할 수 없습니다.");
			}
		} else {
			System.out.println("생성할 권한이 업습니다.");
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
			System.out.println("불가능한 행위");
	}
	
	public int getTestRoomNumber() {
		return privateRooms[0].ID;
	}

	
}
