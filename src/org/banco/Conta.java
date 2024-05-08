package org.banco;

import java.util.Random;

public class Conta {
	
	private int numero;
	private String agencia;
	private double saldo;
	
	public Conta(Cliente cliente) {
		Random rand = new Random();
		this.numero = rand.nextInt(1_000_001, 9_999_999);
		this.agencia = rand.nextInt(1001, 9999) + "-" + rand.nextInt(9);
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Deposito realizado com sucesso.");
	}
	
	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void transferecia(Conta destino, double valor) {
		if(valor <= this.saldo) {
			sacar(valor);
			destino.depositar(valor);
			System.out.println("Transferencia realizada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	protected void imprimirExtrato() {
		System.out.println("Conta: " + this.numero);		
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Saldo: R$ " + this.saldo);
	}

}
