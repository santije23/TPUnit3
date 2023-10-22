package org.example.ejercicios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FacturacionCliente {
	record Factura(String cliente, LocalDate fechafactura, List<BigDecimal> precioProducto) {
	}

	BigDecimal calcularFactura (List<BigDecimal> precioProductos){
		BigDecimal totalValorFact = BigDecimal.ZERO;
		for (BigDecimal precio : precioProductos) {
			totalValorFact = totalValorFact.add(precio);
		}
		return totalValorFact;
	}

	void imprimirFactura (Factura factura, BigDecimal totalFac){
		System.out.println(String.format("Factura"));
		System.out.println(String.format("Fecha factura: %s", factura.fechafactura));
		System.out.println(String.format("Cliente: %s",factura.cliente()));
		System.out.println(String.format("Total: %.2f", totalFac));
	}

	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sanabria", LocalDate.parse("06/01/1999",
				DateTimeFormatter.ofPattern("MM/dd/uuuu")), List.of(new BigDecimal(4500),
				new BigDecimal(5000), new BigDecimal(2500)));

		Factura factura2 = new Factura("Juan Perez", LocalDate.parse("08/15/2000",
				DateTimeFormatter.ofPattern("MM/dd/uuuu")), List.of(new BigDecimal(3500),
				new BigDecimal(6000), new BigDecimal(2800)));


		FacturacionCliente cliente1 = new FacturacionCliente();
		BigDecimal totalValorFact1 = cliente1.calcularFactura(factura1.precioProducto);
		cliente1.imprimirFactura(factura1, totalValorFact1);

		FacturacionCliente cliente2 = new FacturacionCliente();
		BigDecimal totalValorFact2 = cliente2.calcularFactura(factura2.precioProducto);
		cliente2.imprimirFactura(factura2, totalValorFact2);
		
	}
}