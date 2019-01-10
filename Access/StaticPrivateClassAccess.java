/*
* Save with Display.java
*/
import java.lang.reflect.Method;

class Display{
	public static void main(String args[]) throws Exception{
		Object o = new Outer().new Inner();
		((Display.Outer.Inner)o).display();
	}
	static class Outer{
		private class Inner{
			private void display(){
				System.out.println("Accessed");
			}
		}
	}
}
