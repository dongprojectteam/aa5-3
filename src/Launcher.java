
public class Launcher implements IObserver {
	private UserPool userPool;
	public IUser currentUser;
	public IUser[] allUsers;
	public 회의실 meetingRoom;
	public 소회의실Server roomServer;
	
	public Launcher(ISubject userPool, 소회의실Server roomServer) {
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
				System.out.println(((User)currentUser).name + "님의 시스템 - 신규 유저 진입 " + ((User)newUser).name + " (" + ((User)newUser).ID + ")");
			}
		}
		meetingRoom.update(users);
		allUsers = users;
	}

	public void assignMeetingRoom(회의실 meetingRoom) {
		this.meetingRoom = meetingRoom;
	}
	
	public void enterRoom(IUser user) {
		if (currentUser == null) {
			currentUser = user;
			meetingRoom = new 메인회의실(roomServer);
			userPool.addNewUser(user);
		}
		else
			System.out.println("이미 입장해 있습니다.");
		  
	}
	
	public void listAllUsers() {
		System.out.println( "\n" + ((User)currentUser).name + "님의 시스템에서 보이는 모든 유저");
		for(int i = 0 ; i < allUsers.length ; i++) {
			System.out.println(((User)allUsers[i]).name + " (" + ((User)allUsers[i]).ID + ")");
		}
	}


	
}
