	
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Stack{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		stack<Integer> st = new stack<>();
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			st.push(i+1);
		}
		System.out.println("Stack size is "+st.size());
		System.out.println("Is Stack empty "+st.isEmpty());
		System.out.println("Elements in Stack");
		for(int i=0;i<n;i++){
			System.out.print(st.pop()+" ");
		}
		System.out.println();
		System.out.println("Is Stack empty "+st.isEmpty());
		
	}
}

class stack <T> {
	private List<T> list ;
	private int size ;

	public stack(){
		list = new ArrayList<>();
		size = 0;
	}

	public void push(T node){
		list.add(node);
		size++;
	}

	public boolean isEmpty(){
		if(list.size()>0)return false;
		else return true;
	}

	public T pop(){
		T temp = list.get(list.size()-1);
		list.remove(list.size()-1);
		this.size = list.size();
		return temp;
	}

	public T peek(){
		return list.get(this.size-1);
	}

	public int size(){
		return this.size;
	}

}