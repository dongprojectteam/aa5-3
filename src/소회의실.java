import java.util.Arrays;

public class ��ȸ�ǽ� extends ȸ�ǽ� {
	public String roomName;
	
	public ��ȸ�ǽ�(��ȸ�ǽ�Server roomServer) {
		super(roomServer);
		System.out.println("��ȸ�ǽ� ���� " + ID);
	}
	
	public IUser[] users() {
		return (IUser[]) Arrays.stream(this.allUsers).filter(t -> ((User)t).roomID == this.ID).toArray();
	}
}