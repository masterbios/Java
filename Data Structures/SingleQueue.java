
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class SingleQueue{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Queue<Integer>queue = new Queue<>();
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			queue.enqueue(i+1);
		}
		System.out.println("Queue size is "+queue.size());
		System.out.println("Is Queue empty "+queue.isEmpty());
		System.out.println("Element at head is "+queue.peek());
		System.out.println("Elements in Queue ");
		for(int i=0;i<n;i++){
			System.out.print(queue.dequeue()+" ");
		}
		System.out.println();
	}
}

class Queue<T>{
	private List<T> list;
	private int size;

	public Queue(){
		list = new ArrayList<>();
		size = 0;
	}

	public void enqueue(T node){
		list.add(node);
		this.size++;
	}

	public T dequeue(){
		T temp = list.get(0);
		list.remove(0);
		return temp;
	}

	public int size(){
		return this.size;
	}

	public T peek(){
		return list.get(0);
	}

	public boolean isEmpty(){
		if(list.size()>0)return false;
		else return true;
	}

}