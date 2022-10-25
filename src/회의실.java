
public class 회의실 implements IView {
	public UserPool userPool;
	public 소회의실Server roomServer;
	public int ID;
	public IUser currentUser = null;
	public IUser[] allUsers = null;
	
	
	
	public 회의실(UserPool userPool, 소회의실Server roomServer, IUser currentUser) {
		this.userPool = userPool;
		ID = (int) (Math.random() * 100000);
		this.currentUser = currentUser;
		System.out.println("회의실 생성 " + ID);
		roomServer = this.roomServer;
	}
	
	
	@Override
	public void update(IUser currentUser, IUser[] users) {
		this.currentUser = currentUser;
		this.allUsers = users;
	}
	
	

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		
	}
}
