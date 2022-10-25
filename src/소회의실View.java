
public class 소회의실View implements IView {
	public 소회의실정보[] privateRooms;
	public 소회의실Server roomServer;
	public IUser[] allUsers;
	public IUser currentUser;
	
	public 소회의실View(소회의실Server roomServer, IUser currentUser, IUser[] allUsers) {
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
	
	
	public void list소회의실() {
		System.out.println("\n");
		if(privateRooms != null && privateRooms.length > 0) {
			for(int i = 0 ; i < privateRooms.length ; i++) {
				System.out.println(privateRooms[i].roomName);
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
				privateRooms = roomServer.getRooms();
				System.out.println("소회의실 생성 완료 - " + privateRooms[privateRooms.length - 1].roomName);
			} else {
				System.out.println("더 이상 소회의실을 생성할 수 없습니다.");
			}
		}
	}

	
}
