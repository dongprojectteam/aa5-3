
public class ����ȸ�ǽ� extends ȸ�ǽ� {
	public ��ȸ�ǽ�View privateView;
	
	public ����ȸ�ǽ�(UserPool userPool, ��ȸ�ǽ�Server roomServer, IUser currentUser) {
		super(userPool, roomServer, currentUser);
		this.ID = 0; // 0 is always ����ȸ�ǽ�
		System.out.println("���� ȸ�ǽ� ���� " + ID);
		privateView = new ��ȸ�ǽ�View(userPool, roomServer, this.currentUser, this.allUsers);
	}
	
	public void ��ȸ�ǽ�View����() {
		System.out.println(((User)currentUser).name + "���� �ý��� - ��ȸ�ǽ� View �� ����ƽ��ϴ�.");
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
