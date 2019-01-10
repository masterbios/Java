import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Dequeue{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		dequeue<Integer> queue = new dequeue<>();
		System.out.println("Dequeue size is "+queue.size());
		System.out.println("Is Dequeue Empty "+queue.isEmpty());
		for(int i=0;i<5;i++)queue.insertFront(i+1);
		for(int i=0;i<5;i++)queue.insertRear(i+1);
		System.out.println("Dequeue size is "+queue.size());
		System.out.println("Is Dequeue Empty "+queue.isEmpty());
		System.out.println("Elements in Dequeue are ");
		System.out.println("Element in Deque Front "+queue.getFront());
		for(int i=0;i<5;i++)System.out.print(queue.deleteFront()+" ");
		System.out.println();
		System.out.println("Element in Deque Rear "+queue.getRear());
		for(int i=0;i<5;i++)System.out.print(queue.deleteRear()+" ");
		System.out.println();

	}
}

class dequeue <T>{
	private List<T>list ;
	private int size;

	public dequeue(){
		list = new ArrayList<>();
		size = 0;
	}

	public void insertFront(T node){
		list.add(0,node);
		size++;
	}

	public void insertRear(T node){
		list.add(node);
		size++;
	}

	public T deleteFront(){
		T temp = list.get(0);
		list.remove(0);
		size--;
		return temp;
	}

	public T deleteRear(){
		T temp = list.get(list.size()-1);
		list.remove(0);
		size--;
		return temp;
	}

	public T getFront(){
		return list.get(0);
	}

	public T getRear(){
		return list.get(list.size()-1);
	}

	public boolean isEmpty(){
		if(list.size()>0)return false;
		else return true;
	}

	public int size(){
		return this.size;
	}
}