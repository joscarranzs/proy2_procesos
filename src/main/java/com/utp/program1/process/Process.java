package com.utp.program1.process;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

class Calcular {
    // Método para sumar los vectores positivos y negativos
    public float[] sumarVectores(float[] pos, float[] neg) {
        // Validar si los números positivos y negativos tienen la misma cantidad
        if (pos.length != neg.length || pos.length == 0 || neg.length == 0) {
            JOptionPane.showMessageDialog(null, "Los vectores positivos y negativos deben tener la misma cantidad de elementos para realizar la suma.");
            return new float[0]; // Retorna un vector vacío si no son de la misma longitud
        }

        float[] suma = new float[pos.length]; // Vector para almacenar resultados
        for (int i = 0; i < pos.length; i++) {
            suma[i] = pos[i] + neg[i];
        }
        return suma;
    }

    // Método para sumar los elementos del vector positivos
    public float sumaElementosPos(float[] pos) {
        float suma = 0;
        for (float num : pos) {
            suma += num;
        }
        return suma;
    }

    // Método para sumar los elementos del vector negativos
    public float sumaElementosNeg(float[] neg) {
        float suma = 0;
        for (float num : neg) {
            suma += num;
        }
        return suma;
    }

    // Método para ordenar el vector positivo (ascendentemente)
    public float[] ordenarVectorPos(float[] pos) {
        Arrays.sort(pos);
        return pos; // Devuelve el vector ordenado
    }

    // Método para ordenar el vector negativo (descendentemente)
    public float[] ordenarVectorNeg(float[] neg) {
        Float[] negWrapper = new Float[neg.length]; // Usamos Float para el ordenamiento
        for (int i = 0; i < neg.length; i++) {
            negWrapper[i] = neg[i];
        }
        Arrays.sort(negWrapper, Collections.reverseOrder()); // Ordena en orden descendente
        for (int i = 0; i < neg.length; i++) {
            neg[i] = negWrapper[i]; // Copia el resultado al vector original
        }
        return neg; // Devuelve el vector ordenado
    }
}
