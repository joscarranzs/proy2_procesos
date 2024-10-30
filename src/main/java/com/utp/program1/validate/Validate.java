package com.utp.program1.validate;

import javax.swing.JOptionPane;

public class Validar {
  float[] pos; // Vector para almacenar números positivos
    float[] neg; // Vector para almacenar números negativos
    float[] orig; // Vector para almacenar todos los números ingresados
    int countPos = 0; // Contador para números positivos
    int countNeg = 0; // Contador para números negativos
    int countOrig = 0; // Contador para todos los números
    float[] numero = new float[1]; // Vector temporal para almacenar el número ingresado

    public Validar(int size) {
        pos = new float[size]; // Inicializa el vector de positivos
        neg = new float[size]; // Inicializa el vector de negativos
        orig = new float[size]; // Inicializa el vector para todos los números
    }

    public void MetodoValidarent(int n) {
        for (int i = 0; i < n; i++) {
            boolean valido = false;
            while (!valido) {
                String input = JOptionPane.showInputDialog("Ingresa un número (positivo o negativo, NO 0):");

                // Validar si el input es un número
                try {
                    numero[0] = Float.parseFloat(input);

                    // Asegurarse de que no se ingrese 0
                    if (numero[0] == 0) {
                        JOptionPane.showMessageDialog(null, "El número 0 no es válido. Por favor, ingresa otro número.");
                    } else {
                        valido = true; // El número es válido
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingresa un número válido.");
                }
            }

            // Almacenar el número en el vector orig
            orig[countOrig] = numero[0]; // Almacena en el vector de todos
            countOrig++;

            // Clasificar el número en el vector correspondiente
            if (numero[0] > 0) {
                pos[countPos] = numero[0]; // Almacena en el vector de positivos
                countPos++;
            } else {
                neg[countNeg] = numero[0]; // Almacena en el vector de negativos
                countNeg++;
            }
        }

        // Mostrar resultados
        mostrarResultados();

        // Llamar a la operación que el usuario desea realizar
        elegirOperacion();
    }

    private void mostrarResultados() {
        StringBuilder resultados = new StringBuilder("Todos los Números Ingresados:\n");
        for (int i = 0; i < countOrig; i++) {
            resultados.append(orig[i]).append("\n");
        }

        resultados.append("\nNúmeros Positivos:\n");
        for (int i = 0; i < countPos; i++) {
            resultados.append(pos[i]).append("\n");
        }

        resultados.append("\nNúmeros Negativos:\n");
        for (int i = 0; i < countNeg; i++) {
            resultados.append(neg[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultados.toString());
    }

    private void elegirOperacion() {
        Calcular cal = new Calcular(); // Crear instancia de Calcular
        int seleccion;
        do {
            String[] opciones = {
                "Sumar Vectores",
                "Sumar Elementos Positivos",
                "Sumar Elementos Negativos",
                "Ordenar Vectores Positivos",
                "Ordenar Vectores Negativos",
                "Salir"
            };
            seleccion = JOptionPane.showOptionDialog(null, "¿Qué operación deseas realizar?", "Operaciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            // Realizar la operación seleccionada
            switch (seleccion) {
                case 0: // Sumar Vectores
                    float[] suma = cal.sumarVectores(pos, neg);
                    StringBuilder resultadoSuma = new StringBuilder("Suma de Vectores:\n");
                    for (float num : suma) {
                        resultadoSuma.append(num).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, resultadoSuma.toString());
                    break;
                case 1: // Sumar Elementos Positivos
                    float sumaPos = cal.sumaElementosPos(pos);
                    JOptionPane.showMessageDialog(null, "Suma de Elementos Positivos: " + sumaPos);
                    break;
                case 2: // Sumar Elementos Negativos
                    float sumaNeg = cal.sumaElementosNeg(neg);
                    JOptionPane.showMessageDialog(null, "Suma de Elementos Negativos: " + sumaNeg);
                    break;
                case 3: // Ordenar Vectores Positivos
                    float[] ordenadosPos = cal.ordenarVectorPos(pos);
                    StringBuilder resultadoOrdenadosPos = new StringBuilder("Vectores Ordenados Positivos (ascendente):\n");
                    for (float num : ordenadosPos) {
                        resultadoOrdenadosPos.append(num).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, resultadoOrdenadosPos.toString());
                    break;
                case 4: // Ordenar Vectores Negativos
                    float[] ordenadosNeg = cal.ordenarVectorNeg(neg);
                    StringBuilder resultadoOrdenadosNeg = new StringBuilder("Vectores Ordenados Negativos (descendente):\n");
                    for (float num : ordenadosNeg) {
                        resultadoOrdenadosNeg.append(num).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, resultadoOrdenadosNeg.toString());
                    break;
                case 5: // Salir
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operación no seleccionada.");
            }
        } while (seleccion != 5); // Repite hasta que el usuario elija salir
    }
}
