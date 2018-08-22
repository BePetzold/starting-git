
public class Ex01 {
	public static void main(String[] args) {
	
		int arr[];
		int arr2[] = {2, 5, 7, 1};
		
		arr = new int[20];
			
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i*10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 1; i < 3; i++) {
			int aux;
			aux = arr2[arr2.length-i];
			arr2[arr2.length-i] = arr2[i-1];
			arr2[i-1] = aux;
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
