
public class Main {

	public static void main(String[] args) {
		ContaBank cliente1 = new ContaBank();
		cliente1.setNumConta(11111);
		cliente1.setDono("Davy");
		cliente1.abrirConta("ContaCorrente");
		
		ContaBank cliente2 = new ContaBank();
		cliente2.setNumConta(22222);
		cliente2.setDono("LadyDay");
		cliente2.abrirConta("ContaPoupança");
		
		cliente1.depositar(100);
		cliente2.depositar(500);
		cliente2.sacar(100);
		cliente1.sacar(150);
		
		cliente1.fecharConta();
		
		cliente1.estadoAtualConta();
		cliente2.estadoAtualConta();
				
	}

}
