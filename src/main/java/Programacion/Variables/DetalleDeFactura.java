package Programacion.Variables;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese un precio de producto:");
        double precioA = scanner.nextDouble();

        System.out.println("Ingrese un segundo precio de producto:");
        double precioB = scanner.nextDouble();

        double totalBruto = precioA + precioB;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String mensaje = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(mensaje);
    }

    }

