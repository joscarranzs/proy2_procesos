/*
 * Esta clase se puede utilizar para hacer validaciones en los tamaños de los vectores.
 * Se puede mejorar y agregar más validaciones cuando se requiera.
 */

package com.utp.program1.validate;

public class Validate {
  /*
   * Validar que el número sea positivo.
   */

  public static boolean isPositive(int number) {
    return number > 0;
  }

  /*
   * Validar que el numero no sea cero.
   */

  public static boolean isZero(int number) {
    return number == 0;
  }
}
