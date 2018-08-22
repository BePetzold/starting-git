package MaisEx;

public class Array {
	public static int[] ord(int arr[]) {
		
		int aux[] = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			aux[9-i] = arr[i];
		}
		return aux;
	}
	
	
	
	public static void main(String args[]) {
		int t[] = new int[10];
		for(int i=0; i<t.length; i++)
			t[i] = i*10;
		
		for(int i=0; i<t.length; i++)
			System.out.println(t[i]);
		System.out.println("---------------");
		t = ord(t); 
		for(int i=0; i<t.length; i++)
			System.out.println(t[i]);
	}
}
