package org.banco;

public class ContaCorrente extends Conta {
	
	public final String NAME_CLASS = "Conta Corrente";

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato(Cliente cliente) {
		System.out.println("============= Extrato " + this.NAME_CLASS + "=============");
		System.out.println("Cliente: " + cliente.getNome());
		super.imprimirExtrato();
	}

}
