package org.banco;

public class ContaPoupanca extends Conta {
	
	public final String NAME_CLASS = "Conta Poupanca";

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato(Cliente cliente) {
		System.out.println("============= Extrato " + this.NAME_CLASS + "=============");
		System.out.println("Cliente: " + cliente.getNome());
		super.imprimirExtrato();
	}

}
