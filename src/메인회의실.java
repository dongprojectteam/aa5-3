
public class 메인회의실 extends 회의실 {
	public 소회의실View privateView;
	
	public 메인회의실(소회의실Server roomServer) {
		super(roomServer);
		this.ID = 0; // 0 is always 메인회의실
		System.out.println("메인 회의실 생성 " + ID);
		privateView = new 소회의실View(roomServer, this.currentUser, this.allUsers);
	}
	
	public void 소회의실View띄우기() {
		System.out.println("소회의실 View 가 실행됐습니다.");
	}
}
