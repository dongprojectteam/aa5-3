
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserPool server = new UserPool();
		��ȸ�ǽ�Server roomServer = new ��ȸ�ǽ�Server();
		
		// �赿�� Host�� ����
		User �赿�� = new User(Privilege.HOST, "�赿��");
		Launcher launcher1 = new Launcher(server, roomServer);
		launcher1.enterRoom(�赿��);
		
		User �赿�� = new User(Privilege.MEMBER, "�赿��");
		Launcher launcher2 = new Launcher(server, roomServer);
		launcher2.enterRoom(�赿��);
		
		User ��� = new User(Privilege.MEMBER, "���");
		Launcher launcher3 = new Launcher(server, roomServer);
		launcher3.enterRoom(���);
		
		launcher1.listAllUsers();
		launcher2.listAllUsers();
		launcher3.listAllUsers();
		
		ȸ�ǽ� meetingRoom1 = launcher1.meetingRoom;
		ȸ�ǽ� meetingRoom2 = launcher2.meetingRoom;
		ȸ�ǽ� meetingRoom3 = launcher3.meetingRoom;
		
		((����ȸ�ǽ�)meetingRoom1).��ȸ�ǽ�View����();
		��ȸ�ǽ�View privateView1 = ((����ȸ�ǽ�)meetingRoom1).privateView;
		privateView1.list��ȸ�ǽ�();
		privateView1.createPrivateRoom();
		privateView1.createPrivateRoom();
		privateView1.createPrivateRoom();
		privateView1.createPrivateRoom();
		
		
		((����ȸ�ǽ�)meetingRoom2).��ȸ�ǽ�View����();
		��ȸ�ǽ�View privateView2 = ((����ȸ�ǽ�)meetingRoom2).privateView;
		privateView2.list��ȸ�ǽ�();
		privateView2.createPrivateRoom();
		
		((����ȸ�ǽ�)meetingRoom3).��ȸ�ǽ�View����();
		��ȸ�ǽ�View privateView3 = ((����ȸ�ǽ�)meetingRoom3).privateView;
		privateView3.enterRoom(privateView3.getTestRoomNumber());
		privateView2.list��ȸ�ǽ�();
		privateView3.list��ȸ�ǽ�();
	}

}
