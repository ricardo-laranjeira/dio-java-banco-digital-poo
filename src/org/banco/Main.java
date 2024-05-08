package org.banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente clientePF = new PessoaFisica("Paulo Ferreira", "111.111.111-11");
		Cliente clientePJ = new PessoaJuridica("Paulo Ferreira", "62.868.524/0001-56");
		
		ContaCorrente cc = new ContaCorrente(clientePF);
		ContaPoupanca cp = new ContaPoupanca(clientePJ);
		
		cc.imprimirExtrato(clientePF);
		cc.depositar(100.00);
		cc.imprimirExtrato(clientePF);
		cc.sacar(50.00);
		cc.imprimirExtrato(clientePF);
		
		cp.imprimirExtrato(clientePJ);
		
		cc.transferecia(cp, 70.00);
		cc.transferecia(cp, 25.00);
		cc.imprimirExtrato(clientePF);
		cp.imprimirExtrato(clientePJ);

	}

}
