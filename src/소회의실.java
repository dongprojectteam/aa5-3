import java.util.Arrays;

public class ��ȸ�ǽ� extends ȸ�ǽ� {
	public String roomName;
	
	public ��ȸ�ǽ�(UserPool userPool, ��ȸ�ǽ�Server roomServer, IUser currentUser) {
		super(userPool, roomServer, currentUser);
		System.out.println("��ȸ�ǽ� ���� " + ID);
	}
	
	public IUser[] users() {
		return (IUser[]) Arrays.stream(this.allUsers).filter(t -> ((User)t).roomID == this.ID).toArray();
	}
}