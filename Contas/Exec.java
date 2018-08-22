package Contas;

public class Exec {

	public static void main(String[] args) {
		ContaCorrente a = new ContaCorrente(555666);
		ContaCorrente b = new ContaCorrente(444888);
		ContaCorrente c = new ContaCorrente(444777);
		ContaCorrente d = new ContaCorrente(666999);
		ContaCorrente e = new ContaCorrente(666333);
		ContaCorrente f = new ContaCorrente(111222);
		
		a.deposito(800);
		a.retirada(200);
		b.setSaldo(1000);
		c.setSaldo(2000);
		d.setSaldo(3000);
		e.setSaldo(4000);
		f.setSaldo(5000);
				
		CadastroDeConta cad = new CadastroDeConta(6);
		
		cad.novaConta(a);
		cad.novaConta(b);
		cad.novaConta(c);
		cad.novaConta(d);
		cad.novaConta(e);
		cad.novaConta(f);
		
		cad.getConta(111222);
		cad.getConta(666333);
		cad.getConta(666333);
		cad.getConta(111222);
		cad.getConta(111222);
		cad.getConta(444777);
		cad.getConta(444777);
		cad.getConta(444777);
		cad.getConta(111222);
		cad.getConta(111222);
		
		
		ContaCorrente t;
		t = cad.getConta(111222);
		System.out.println(t.getSaldo());
		
		System.out.println(cad.saldoTotal());
		System.out.println(cad.conta(4000));
		System.out.println(cad.maiorSaldo());
		System.out.println("--------------------");
		//System.out.println(cad.getConta(111222).getAcesso());
		cad.printAll();
	}

}
