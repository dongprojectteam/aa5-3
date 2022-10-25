
public class 메인회의실 extends 회의실 {
	public 소회의실View privateView;
	
	public 메인회의실(UserPool userPool, 소회의실Server roomServer, IUser currentUser) {
		super(userPool, roomServer, currentUser);
		this.ID = 0; // 0 is always 메인회의실
		System.out.println("메인 회의실 생성 " + ID);
		privateView = new 소회의실View(userPool, roomServer, this.currentUser, this.allUsers);
	}
	
	public void 소회의실View띄우기() {
		System.out.println(((User)currentUser).name + "님의 시스템 - 소회의실 View 가 실행됐습니다.");
		privateView.updateRooms();
	}
	
	@Override
	public void update(IUser currentUser, IUser[] users) {
		super.update(currentUser, users);
		privateView.update(currentUser, users);
	}

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		
	}
}
