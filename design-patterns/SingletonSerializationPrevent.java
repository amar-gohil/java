import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializationPrevent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final SingletonSerializationPrevent singletonSerializationPrevent = new SingletonSerializationPrevent();

	private SingletonSerializationPrevent() {
	}
	// implement readResolve method TO PREVENT
    protected Object readResolve() 
    { 
        return singletonSerializationPrevent; 
    } 
	public static SingletonSerializationPrevent getInstance() {
		return singletonSerializationPrevent;
	}

	public static void main(String[] args) {
		SingletonSerializationPrevent obj1 = SingletonSerializationPrevent.getInstance();
		SingletonSerializationPrevent obj2 = null;
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
			out.writeObject(obj1);
			out.close();
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
			obj2 = (SingletonSerializationPrevent) in.readObject();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("instance1.hashCode():- " + obj1.hashCode());
		System.out.println("instance2.hashCode():- " + obj2.hashCode());
	}
}
