package com.utp.program1.process;

import java.util.Arrays;

public class Process {

  /*
   * Vector para almacenar todos los valores.
   * Variables para almacenar valores positivos y negativos.
   * Variable para almacenar los valores positivos acendentes.
   * Variable para almacenar los valores negativos descendentes.
   * Variable para sumar los valores positivos y negativos.
   * Contadores para contar el número de valores positivos y negativos.
   * Variable para sumar los valores positivos y negativos.
   * Variable para determinar si los vectores son de la misma longitud.
   */

  private int[] allVector;
  private int[] positiveVector;
  private int[] negativeVector;
  private int[] ascendingPositiveVector;
  private int[] descendingNegativeVector;
  private int[] sumVector;
  private int positiveCount;
  private int negativeCount;
  private int sumPositive;
  private int sumNegative;
  private boolean isSameLength;

  /*
   * Constructor para crear una instancia de Process con un vector de enteros.
   */

  public Process(int[] allVector) {
    this.allVector = allVector;
  }

  /*
   * Este método calcula el tamaño de los vectores positivos y negativos.
   * Se debe deteminar si los vectores son de la misma longitud.
   */

  public void calculateVectorsSize() {
    // Inicializar los contadores en cero
    positiveCount = 0;
    negativeCount = 0;

    // Recorrer el vector con todos los valores
    for (int i = 0; i < allVector.length; i++) {
      // Validar que sean positivos
      if (allVector[i] > 0) {
        // Se suma 1 al contador de valores positivos
        positiveCount++;
      } else if (allVector[i] < 0) {
        // De lo contrario se suma 1 al contador de valores negativos
        negativeCount++;
      }
    }

    // Se valida si los vectores son de la misma longitud
    isSameLength = positiveCount == negativeCount;
  }


  /*
   * Estos métodos cargan los vectores positivos y negativos.
   */

  private void loadPositiveVector() {
    // Inicializar el vector de positivos
    positiveVector = new int[positiveCount];
    // Inicializar el contador de índices
    int index = 0;
    // Recorrer todos los elementos del vector
    for (int i = 0; i < allVector.length; i++) {
      // Validar que el elemento sea positivo
      if (allVector[i] > 0) {
        // Se agrega el elemento al vector de positivos
        positiveVector[index] = allVector[i];
        // Incrementar el contador de índices
        index++;
      }
    }
  }

  private void loadNegativeVector() {
    // Inicializar el vector de negativos
    negativeVector = new int[negativeCount];
    // Inicializar el contador de índices
    int index = 0;
    // Recorrer todos los elementos del vector
    for (int i = 0; i < allVector.length; i++) {
      // Validar que el elemento sea negativo
      if (allVector[i] < 0) {
        // Se agrega el elemento al vector de negativos
        negativeVector[index] = allVector[i];
        // Incrementar el contador de índices
        index++;
      }
    }
  }


  /*
   * Este método calcula la suma de los vectores positivos y negativos.
   */

  private void sumVectors() {
    // Inicializar el vector de suma
    sumVector = new int[positiveCount + negativeCount];
    // Inicializar el contador de índices
    int index = 0;
    // Recorrer todos los elementos del vector de positivos o pueden ser negativos también.
    for (int i = 0; i < positiveVector.length; i++) {
      // Se suman los elementos de ambos vectores y se agrega al vector de suma
      sumVector[index] = positiveVector[i] + negativeVector[i];
      // Incrementar el contador de índices
      index++;
    }
  }

  /*
   * Un método para sumar los valores positivos.
   * Un método para sumar los valores negativos.
   */

  private void sumPositiveVector() {
    // Inicializar el acumulador de suma de los valores positivos
    sumPositive = 0;
    // Recorrer todos los elementos del vector de positivos
    for (int i = 0; i < positiveVector.length; i++) {
      // Se suma el valor del elemento al acumulador
      sumPositive += positiveVector[i];
    }
  }

  private void sumNegativeVector() {
    // Inicializar el acumulador de suma de los valores negativos
    sumNegative = 0;
    // Recorrer todos los elementos del vector de negativos
    for (int i = 0; i < negativeVector.length; i++) {
      // Se suma el valor del elemento al acumulador
      sumNegative += negativeVector[i];
    }
  }

  /*
   * Estos métodos calculan los vectores acendentes y descendentes.
   */

  private void sumAscendingPositiveVector() {
    // Inicializar el vector de los valores acendentes
    ascendingPositiveVector = new int[positiveCount];
    // Copiar los valores acendentes del vector de positivos
    System.arraycopy(positiveVector, 0, ascendingPositiveVector, 0, positiveCount);
    // Ordenar el vector de los valores acendentes
    Arrays.sort(ascendingPositiveVector);
  }

  private void sumDescendingNegativeVector() {
    // Inicializar el vector de los valores descendentes
    descendingNegativeVector = new int[negativeCount];
    // Copiar los valores descendentes del vector de negativos
    System.arraycopy(negativeVector, 0, descendingNegativeVector, 0, negativeCount);
    // Ordenar el vector de los valores descendentes
    Arrays.sort(descendingNegativeVector);

    // Invertir el orden de los valores descendentes.
    for (int i = 0; i < descendingNegativeVector.length; i++) {
      // Se guarda el valor [0] del vector en la variable temporal.
      int temp = descendingNegativeVector[i];
      // Se invierte el orden, el ultimo valor pasa a ser primero.
      descendingNegativeVector[i] = descendingNegativeVector[descendingNegativeVector.length - 1 - i];
      // El primer valor pasa a ser el ultimo.
      descendingNegativeVector[descendingNegativeVector.length - 1 - i] = temp;
    }
  }

  /*
   * Este método se encarga de realizar todas las operaciones necesarias.
   */

  public void calculateProcess() {
    // Calcular el tamaño de los vectores.
    calculateVectorsSize();

    // Validar si los vectores son de la misma longitud.
    if (isSameLength) {
      // De ser iguales se cargan todos los procesos.
      loadPositiveVector();
      loadNegativeVector();
      sumVectors();
      sumPositiveVector();
      sumNegativeVector();
      sumAscendingPositiveVector();
      sumDescendingNegativeVector();
    } else {
      // De ser distintos solo se cargan algunos procesos.
      sumPositiveVector();
      sumNegativeVector();
      sumAscendingPositiveVector();
      sumDescendingNegativeVector();
    }
  }

  /*
   * Getters para acceder a las variables de la clase.
   */

  public int[] getPositiveVector() {
    return positiveVector;
  }

  public int[] getNegativeVector() {
    return negativeVector;
  }

  public int[] getAscendingPositiveVector() {
    return ascendingPositiveVector;
  }

  public int[] getDescendingNegativeVector() {
    return descendingNegativeVector;
  }

  public int[] getSumVector() {
    return sumVector;
  }

  public int getSumPositive() {
    return sumPositive;
  }

  public int getSumNegative() {
    return sumNegative;
  }

  public boolean isSameLength() {
    return isSameLength;
  }
}
