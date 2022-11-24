package com.curso.avanzado;

public class LeafConstante implements ComponentExpresion {

	private double valor;

	public LeafConstante(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValor() {
		return valor;
	}

}
