import java.util.ArrayList;

public class UserPool implements ISubject {
	public ArrayList<IObserver> observers;
	public ArrayList<IUser> users;
	public ArrayList<IView> privateMeetingRooms;
	public int lastPrivateRoomIndex;
	
	public UserPool() {
		observers = new ArrayList<IObserver>();
		users = new ArrayList<IUser>();
		lastPrivateRoomIndex = 1;
	}

	@Override
	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i< observers.size(); i++) {
			IObserver itObserver = observers.get(i);
			itObserver.update(users.toArray(new IUser[0]));
		}
	}

	public void addNewUser(IUser user) {
		users.add(user);
		notifyObservers();
	}
	
	public void modifyUser(IUser user) {
		int i = users.indexOf(user);
		if(i>=0) {
			users.set(i, user);
			notifyObservers();
		}
	}
}
