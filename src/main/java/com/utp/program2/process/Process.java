package com.utp.program2.process;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program_2;

/**
 *
 * @author dalbe
 */
public class Calculos {
    public static int[] calcularVtasPorVendedor(int[][] ventas) {
        int[] vtasPorVendedor = new int[ventas.length];
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                vtasPorVendedor[i] += ventas[i][j];
            }
        }
        return vtasPorVendedor;
    }

    public static double[] calcularPromPorVendedor(int[][] ventas) {
        int[] vtasPorVendedor = calcularVtasPorVendedor(ventas);
        double[] promPorVendedor = new double[ventas.length];
        for (int i = 0; i < ventas.length; i++) {
            promPorVendedor[i] = (double) vtasPorVendedor[i] / ventas[i].length;
        }
        return promPorVendedor;
    }

    public static int[] calcularVtasPorMes(int[][] ventas) {
        int[] vtasPorMes = new int[ventas[0].length];
        for (int j = 0; j < ventas[0].length; j++) {
            for (int i = 0; i < ventas.length; i++) {
                vtasPorMes[j] += ventas[i][j];
            }
        }
        return vtasPorMes;
    }

    public static double[] calcularPromPorMes(int[][] ventas) {
        int[] vtasPorMes = calcularVtasPorMes(ventas);
        double[] promPorMes = new double[ventas[0].length];
        for (int j = 0; j < ventas[0].length; j++) {
            promPorMes[j] = (double) vtasPorMes[j] / ventas.length;
        }
        return promPorMes;
    }

    public static int totalizarVentas(int[][] ventas) {
        int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                total += ventas[i][j];
            }
        }
        return total;
    }
}

