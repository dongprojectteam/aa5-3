
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserPool server = new UserPool();
		소회의실Server roomServer = new 소회의실Server();
		
		// 김동혁 Host로 접속
		User 김동혁 = new User(Privilege.HOST, "김동혁");
		Launcher launcher1 = new Launcher(server, roomServer);
		launcher1.enterRoom(김동혁);
		
		User 김동원 = new User(Privilege.MEMBER, "김동원");
		Launcher launcher2 = new Launcher(server, roomServer);
		launcher2.enterRoom(김동원);
		
		User 김명선 = new User(Privilege.MEMBER, "김명선");
		Launcher launcher3 = new Launcher(server, roomServer);
		launcher3.enterRoom(김명선);
		
		launcher1.listAllUsers();
		launcher2.listAllUsers();
		launcher3.listAllUsers();
		
		회의실 meetingRoom1 = launcher1.meetingRoom;
		회의실 meetingRoom2 = launcher2.meetingRoom;
		회의실 meetingRoom3 = launcher3.meetingRoom;
		
		((메인회의실)meetingRoom1).소회의실View띄우기();
		소회의실View privateView1 = ((메인회의실)meetingRoom1).privateView;
		privateView1.list소회의실();
		privateView1.createPrivateRoom();
		privateView1.createPrivateRoom();
		privateView1.createPrivateRoom();
		privateView1.createPrivateRoom();
		
		
		((메인회의실)meetingRoom2).소회의실View띄우기();
		소회의실View privateView2 = ((메인회의실)meetingRoom2).privateView;
		privateView2.list소회의실();
		privateView2.createPrivateRoom();
		
		((메인회의실)meetingRoom3).소회의실View띄우기();
		소회의실View privateView3 = ((메인회의실)meetingRoom3).privateView;
		privateView3.enterRoom(privateView3.getTestRoomNumber());
		privateView2.list소회의실();
		privateView3.list소회의실();
	}

}
