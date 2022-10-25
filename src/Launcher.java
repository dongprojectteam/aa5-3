
public class Launcher implements IObserver {
	private UserPool userPool;
	public IUser currentUser;
	public IUser[] allUsers;
	public ȸ�ǽ� meetingRoom;
	public ��ȸ�ǽ�Server roomServer;
	
	public Launcher(ISubject userPool, ��ȸ�ǽ�Server roomServer) {
		this.currentUser = null;
		this.userPool = (UserPool)userPool; 
		this.roomServer = roomServer;
		this.userPool.registerObserver(this);
	}

	@Override
	public void update(IUser[] users) {
		if(allUsers == null || users.length > allUsers.length ) {
			User newUser = (User)users[users.length-1];
			if(newUser != currentUser) {
				System.out.println(((User)currentUser).name + "���� �ý��� - �ű� ���� ���� " + ((User)newUser).name + " (" + ((User)newUser).ID + ")");
			}
		}
		meetingRoom.update(users);
		allUsers = users;
	}

	public void assignMeetingRoom(ȸ�ǽ� meetingRoom) {
		this.meetingRoom = meetingRoom;
	}
	
	public void enterRoom(IUser user) {
		if (currentUser == null) {
			currentUser = user;
			meetingRoom = new ����ȸ�ǽ�(roomServer);
			userPool.addNewUser(user);
		}
		else
			System.out.println("�̹� ������ �ֽ��ϴ�.");
		  
	}
	
	public void listAllUsers() {
		System.out.println( "\n" + ((User)currentUser).name + "���� �ý��ۿ��� ���̴� ��� ����");
		for(int i = 0 ; i < allUsers.length ; i++) {
			System.out.println(((User)allUsers[i]).name + " (" + ((User)allUsers[i]).ID + ")");
		}
	}


	
}
