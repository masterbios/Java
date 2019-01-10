import java.util.Scanner;
/*
*@author Ankit Kumar 
*/
class CountingSort{
	static final int max = (int) 1e5 + 1;
  
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
    
		int n = in.nextInt();
		int a[] = new int[n];
		int freq[] = new int[max];
		int res[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		CountSort(a);
		for(int x: a){
			System.out.print(x + " ");
		} 
		System.out.println();
	}
	public static void CountSort(int a[]){
		int freq[] = new int[max];
		int res[] = new int[a.length];
		for(int i = 0; i < a.length; i++){
			freq[a[i]]++;
		}
		for(int i = 1; i < max; i++){
			freq[i] += freq[i - 1];
		}
		for(int i = a.length - 1; i >= 0; i--){
			res[freq[a[i]] - 1] = a[i];
			freq[a[i]]--;
		}
		for(int i = 0; i < a.length; i++){
			a[i] = res[i];
		}

	}
}
