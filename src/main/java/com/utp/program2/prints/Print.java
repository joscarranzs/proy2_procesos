package com.utp.program2.prints; // Se ha corregido el nombre de la clase
import javax.swing.*;
import java.awt.*;

// Para modificar el nombre de la clase debes modificar el nombre del archivo
// Ahora se llama Print.java

public class Print {
  public static void imprimirMatriz(int[][] ventas) {
    String[] columnNames = new String[ventas[0].length];
    for (int i = 0; i < columnNames.length; i++) {
      columnNames[i] = "Mes " + (i + 1);
    }

    String[][] data = new String[ventas.length][ventas[0].length];
    for (int i = 0; i < ventas.length; i++) {
      for (int j = 0; j < ventas[i].length; j++) {
        data[i][j] = String.valueOf(ventas[i][j]);
      }
    }

    JTable table = new JTable(data, columnNames);
    JScrollPane scrollPane = new JScrollPane(table);
    JOptionPane.showMessageDialog(null, scrollPane, "Ventas Mensuales por Vendedor", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void imprimirVector(int[] vector, String titulo) {
    StringBuilder sb = new StringBuilder(titulo + "\n");
    for (int i = 0; i < vector.length; i++) {
      sb.append("Vendedor ").append(i + 1).append(": ").append(vector[i]).append("\n");
    }
    JOptionPane.showMessageDialog(null, sb.toString(), titulo, JOptionPane.INFORMATION_MESSAGE);
  }

  public static void imprimirVector(double[] vector, String titulo) {
    StringBuilder sb = new StringBuilder(titulo + "\n");
    for (int i = 0; i < vector.length; i++) {
      sb.append("Vendedor ").append(i + 1).append(": ").append(vector[i]).append("\n");
    }
    JOptionPane.showMessageDialog(null, sb.toString(), titulo, JOptionPane.INFORMATION_MESSAGE);
  }

  public static void mostrarOpciones(int[][] ventas) {
    String[] opciones = {
      "Mostrar Matriz",
      "Ventas por Vendedor",
      "Promedio por Vendedor",
      "Ventas por Mes",
      "Promedio por Mes",
      "Totalizar Ventas"
    };

    JComboBox<String> comboBox = new JComboBox<>(opciones);
    int seleccion = JOptionPane.showConfirmDialog(null, comboBox, "Seleccione una opción", JOptionPane.OK_CANCEL_OPTION);

    if (seleccion == JOptionPane.OK_OPTION) {
      String opcion = (String) comboBox.getSelectedItem();
      switch (opcion) {
        case "Mostrar Matriz":
        imprimirMatriz(ventas);
        break;
        case "Ventas por Vendedor":
        imprimirVector(Calculos.calcularVtasPorVendedor(ventas), "Ventas por Vendedor");
        break;
        case "Promedio por Vendedor":
        imprimirVector(Calculos.calcularPromPorVendedor(ventas), "Promedio por Vendedor");
        break;
        case "Ventas por Mes":
        imprimirVector(Calculos.calcularVtasPorMes(ventas), "Ventas por Mes");
        break;
        case "Promedio por Mes":
        imprimirVector(Calculos.calcularPromPorMes(ventas), "Promedio por Mes");
        break;
        case "Totalizar Ventas":
        int total = Calculos.totalizarVentas(ventas);
        JOptionPane.showMessageDialog(null, "Total de Ventas: " + total, "Totalizar Ventas", JOptionPane.INFORMATION_MESSAGE);
        break;
      }
    }
  }
}
