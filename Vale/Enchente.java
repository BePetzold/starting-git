package Vale;

public class Enchente {
	private int mont[];
	private int chuva;
	private int sup;
	
	public Enchente (int m[], int c, int s) {
		mont = m;
		chuva = c;
		sup = s;
	}
	
	public void volume() {
		int aux = 0;
		int agua = chuva;
		for(int i=0; i<mont.length; i++) {
			if(mont[i]>aux) {
				aux = mont[i];
			}
		}

		for(int i=1; i<=aux; i++) {
			for (int j=0; j<mont.length; j++) {
				if(mont[j]<i) {
					agua -= sup;
					}
				}
			if(agua<=0) {
				System.out.println("nivel de agua: " + i);
				break;
			}
		}
		System.out.println("enchente");
	}
	
	
	public static void main (String arg[]) {
		int vale[] = new int[10];
		vale[0] = 5;
		vale[1] = 3;
		vale[2] = 2;
		vale[3] = 1;
		vale[4] = 1;
		vale[5] = 1;
		vale[6] = 3;
		vale[7] = 3;
		vale[8] = 4;
		vale[9] = 5;
		
		Enchente e = new Enchente(vale, 0, 5);
		e.volume();
	}
}


