
public class ȸ�ǽ� implements IView {
	public UserPool userPool;
	public ��ȸ�ǽ�Server roomServer;
	public int ID;
	public IUser currentUser = null;
	public IUser[] allUsers = null;
	
	
	
	public ȸ�ǽ�(UserPool userPool, ��ȸ�ǽ�Server roomServer, IUser currentUser) {
		this.userPool = userPool;
		ID = (int) (Math.random() * 100000);
		this.currentUser = currentUser;
		System.out.println("ȸ�ǽ� ���� " + ID);
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
