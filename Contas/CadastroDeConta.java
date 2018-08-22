package Contas;

public class CadastroDeConta {
		private ContaCorrente arr[];
		
		public CadastroDeConta(int x) {
			arr = new ContaCorrente[x];
		}
		
	public boolean novaConta(ContaCorrente c) {
		for(int i=0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean remove(int nroCta) {
		for(int i=0; i < arr.length; i++) {
			if(arr[i].getNumeroDaconta() == nroCta) {
				arr[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public ContaCorrente getConta(int nroCta) {
		for(int i=0; i < arr.length; i++) {
			if(arr[i].getNumeroDaconta() == nroCta){
				arr[i].incrementAcesso();
				organizar();
				return arr[i];
			}
		}
		return null;
	}
	
	public void organizar() {
		ContaCorrente aux;
		for(int i=0; i < arr.length-1; i++) {
			if(arr[i].getAcesso() < arr[i+1].getAcesso()) {
				aux = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = aux;
			}
		}
	}
	
	public double saldoTotal() {
		double soma = 0;
		for(int i=0; i < arr.length; i++) {
			soma += arr[i].getSaldo();
		}
		return soma;
	}
	
	public int conta(double noMinimo) {
		int num = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i].getSaldo() >= noMinimo) {
				num ++;
			}
		}
		return num;
	}
	
	public int maiorSaldo() {
		int aux = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[aux].getSaldo() < arr[i].getSaldo()) {
				aux = i;
			}
		}
		return arr[aux].getNumeroDaconta();
	}
	
	public void printAll(){
		for(int i=0; i < 6; i++) {
			System.out.println(arr[i].getNumeroDaconta());
		}
	}
	
	public ContaCorrente[] array(){
		return arr;
	}
	
}
