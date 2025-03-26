import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTestClass  {
	
	public static void main(String[] args) throws Exception {
		SingletonClass s1 = SingletonClass.getSingletonClassObject();
		System.out.println(s1.hashCode());
		
		SingletonClass s2 = SingletonClass.getSingletonClassObject();
		System.out.println(s2.hashCode());
		
		
		//Constructor<SingletonClass> s3 = SingletonClass.class.getDeclaredConstructor();
		//s3.setAccessible(true);
		//SingletonClass newInstance = s3.newInstance(); 
		//System.out.println(newInstance.hashCode());
		
		//ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("d://abd.txt"));
		//outputStream.writeObject(new SingletonClass());
		
		//ObjectInputStream objin=new ObjectInputStream(new FileInputStream("d://abd.txt"));
		//SingletonClass object = (SingletonClass)objin.readObject();
		//System.out.println(object.hashCode());
		
		
		
	}
}

