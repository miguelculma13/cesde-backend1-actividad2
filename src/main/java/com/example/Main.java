package com.example;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Libro l1 = new Libro();
      l1.mostrarDetalles();
      Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
      l2.mostrarDetalles();
      Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
      l3.mostrarDetalles();
      CuentaBancaria cuenta = new CuentaBancaria("Maria", (double)500.0F);
      cuenta.depositar((double)200.0F);
      System.out.println("Saldo actual: " + cuenta.getSaldo());
      cuenta.retirar((double)1000.0F);
      Estudiante e = new Estudiante("Pedro", 21, (double)2.5F);
      e.mostrarInfo();
   }
}
