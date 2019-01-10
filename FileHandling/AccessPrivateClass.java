/*
* Save as Display.java
*/
import java.lang.reflect.Method;

class Display{
	public static void main(String args[]) throws Exception{
		Class c = Class.forName("Demo");
		Object obj = c.newInstance();
		@SuppressWarnings("unchecked")
		Method m = c.getDeclaredMethod("show");
		m.setAccessible(true);
		m.invoke(obj);
	}
}
class Demo{
	private void show(){
		System.out.println("Inside private");
	}
}
