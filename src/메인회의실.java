
public class ����ȸ�ǽ� extends ȸ�ǽ� {
	public ��ȸ�ǽ�View privateView;
	
	public ����ȸ�ǽ�(��ȸ�ǽ�Server roomServer) {
		super(roomServer);
		this.ID = 0; // 0 is always ����ȸ�ǽ�
		System.out.println("���� ȸ�ǽ� ���� " + ID);
		privateView = new ��ȸ�ǽ�View(roomServer, this.currentUser, this.allUsers);
	}
	
	public void ��ȸ�ǽ�View����() {
		System.out.println("��ȸ�ǽ� View �� ����ƽ��ϴ�.");
	}
}
