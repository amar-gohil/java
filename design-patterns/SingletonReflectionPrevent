import java.lang.reflect.Constructor;
/*there is not Prevent for Reflectin you need to user ENUM*/
class Singleton {
	private Singleton() {
	}

	private static class InnerClass {
		private static final Singleton singleton = new Singleton();
	}

	public static Singleton getInstance() {
		return InnerClass.singleton;
	}
}

public class SingletonReflectionPrevent {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (Singleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode());
	}
}
