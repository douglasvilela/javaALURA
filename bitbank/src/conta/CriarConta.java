package conta;

public class CriarConta {
	
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.setAgencia(1);
		primeiraConta.setNumero(10);
		primeiraConta.setSaldo(200);
		System.out.println(primeiraConta.getSaldo());


		primeiraConta.deposita(100);
		
		System.out.println(primeiraConta.getSaldo());
	}

}
