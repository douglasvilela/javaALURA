package conta;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		conta1.setAgencia(1);
		conta1.setNumero(30);
		conta1.setSaldo(300);
		conta1.setTitular("Douglas");
		
		
		System.out.println(conta1);
		
		
		
		Conta conta2 = new Conta();
		
		conta2.setAgencia(2);
		conta2.setNumero(31);
		conta2.setSaldo(400);
		conta2.setTitular("Kamylle");
		conta2.depositarValor(100);
		
		System.out.println(conta2);
		
		conta2.sacarValor(500);

		
		conta2.depositarValor(1000);
		conta2.sacarValor(500);
		System.out.println(conta2);
	}
}
