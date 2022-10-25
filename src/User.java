
public class User implements IUser {
	public int ID;
	public String name;
	public Privilege privilege; 
	public int roomID;
	
	public User(Privilege privilege, String name) {
		this.privilege = privilege;
		this.name = name;
		this.ID = (int) (Math.random() * 10000);
		roomID = 0;
		
		System.out.println("새로운 유저 " + name + "(" + ID + ")님이 생성되었습니다. " + (privilege == Privilege.HOST ? "(Host)" : "(Member)"));
	}

	@Override
	public void changePrivilege(Privilege privilege) {
		this.privilege = privilege;

	}

	@Override
	public void changeMeetingRoom(int roomIdx) {
		this.ID = roomIdx;
	}

}
