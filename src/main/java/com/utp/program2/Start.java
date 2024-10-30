package com.utp.program2;

public class Program_2 {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de meses:"));

        int[][] ventas = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ventas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del vendedor " + (i + 1) + " para el mes " + (j + 1) + ":"));
            }
        }

        Impresion.mostrarOpciones(ventas);
    }

