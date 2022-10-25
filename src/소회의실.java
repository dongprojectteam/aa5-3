import java.util.Arrays;

public class 소회의실 extends 회의실 {
	public String roomName;
	
	public 소회의실(UserPool userPool, 소회의실Server roomServer, IUser currentUser) {
		super(userPool, roomServer, currentUser);
		System.out.println("소회의실 생성 " + ID);
	}
	
	public IUser[] users() {
		return (IUser[]) Arrays.stream(this.allUsers).filter(t -> ((User)t).roomID == this.ID).toArray();
	}
}