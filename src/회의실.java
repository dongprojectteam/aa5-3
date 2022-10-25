
public class 회의실 implements IView {
	public 소회의실Server roomServer;
	public int ID;
	public IUser currentUser = null;
	public IUser[] allUsers = null;
	
	
	
	public 회의실(소회의실Server roomServer) {
		ID = (int) (Math.random() * 100000);
		System.out.println("회의실 생성 " + ID);
		roomServer = this.roomServer;
	}
	
	@Override
	public void update(IUser[] users) {
		
	}
	
	

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		
	}
}
