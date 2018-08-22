
public class Ex02 {
	private double arr[];
	
	
	public Ex02(int x) {
		arr = new double[x];
	}
	
	
	public boolean add(double it) { //adiciona ao final
		for(int i=0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = it;
				return true;
			}
		}
		return false;
	}
	
	
	public boolean add(double it, int pos) { //adiciona a posição
		double aux = arr[pos];
		double aux2;
		for (int i=pos; i < arr.length-1; i++) {
			aux2 = arr[i+1];
			arr[i+1] = aux;
			aux = aux2;
		}
		arr[pos] = it;
		return true;
	}
	
	
	public double remove(int pos) { //remove na posição
		for (int i=pos; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		return 0;
	}
	
	
	public double get(int pos) { //retorna na posição
		return arr[pos];
	}
	
	
	//TESTES TESTES TESTES ----------------------------------------------------------------
	
	
	public static void main (String arg[]) {
		Ex02 t = new Ex02(10);
		
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(8);
		t.add(9);
		for (int i=0; i<10; i++) {
			System.out.println(t.get(i));
		}
		
		t.add(4, 3);
		System.out.println("-----");
		for (int i=0; i<10; i++) {
			System.out.println(t.get(i));
		}
		
		t.remove(4);
		System.out.println("-----");
		for (int i=0; i<10; i++) {
			System.out.println(t.get(i));
		}
		
		t.get(4);
		System.out.println("-----");
		for (int i=0; i<10; i++) {
			System.out.println(t.get(i));
		}
	}
}


