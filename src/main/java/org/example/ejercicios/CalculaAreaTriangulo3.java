package org.example.ejercicios;

import java.math.BigDecimal;

public class CalculaAreaTriangulo3 {

	record Triangulo(String color, BigDecimal base, BigDecimal altura) {}
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("rojo",new BigDecimal(5), new BigDecimal(4));
		BigDecimal base = triangulo.base();
		BigDecimal altura = triangulo.altura();
		BigDecimal entreDos = new BigDecimal(0.5);
		BigDecimal valorAreaTriangulo = entreDos.multiply(base).multiply(altura);
		System.out.println(String.format("Altura del triángulo: %.2f", triangulo.altura));
		System.out.println(String.format("Base del triángulo: %.2f", triangulo.base));
		System.out.println(String.format("Área del triángulo: %.2f", valorAreaTriangulo));
	}
}
