package ProBank;

public class TesteDeReferencia {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta e: " + primeiraConta.saldo + "U$");
	}
}
