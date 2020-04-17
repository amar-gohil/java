
class SuperClass implements Cloneable {
	int i = 10;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class SingletonCloningPrevent extends SuperClass {
	private static final SingletonCloningPrevent singleton = new SingletonCloningPrevent();

	private SingletonCloningPrevent() {
	}

	public static SingletonCloningPrevent getInstance() {
		return singleton;
	}

	// implement clone method TO PREVENT
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonCloningPrevent obj1 = SingletonCloningPrevent.singleton;
		SingletonCloningPrevent obj2 = (SingletonCloningPrevent) obj1.clone();
		System.out.println("instance1 hashCode:- " + obj1.hashCode());
		System.out.println("instance2 hashCode:- " + obj2.hashCode());
	}
}
