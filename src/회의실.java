
public class ȸ�ǽ� implements IView {
	public ��ȸ�ǽ�Server roomServer;
	public int ID;
	public IUser currentUser = null;
	public IUser[] allUsers = null;
	
	
	
	public ȸ�ǽ�(��ȸ�ǽ�Server roomServer) {
		ID = (int) (Math.random() * 100000);
		System.out.println("ȸ�ǽ� ���� " + ID);
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
