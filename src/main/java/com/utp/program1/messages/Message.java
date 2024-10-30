package com.utp.program1.messages;

public class PY2_P1 {
    public static void main(String[] args) { // no se trasformar esto en una clase aunque asi igual deberia de funcionar 
        int n = 0;
        // Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido al programa 1");
        
        // Pedir la cantidad de números a ingresar
        String input = JOptionPane.showInputDialog("¿Cuántos números deseas ingresar?");
        
        // Validar que la entrada sea un número entero
        try {
            n = Integer.parseInt(input);
            Validar val = new Validar(n); // Crear una instancia de Validar con el tamaño especificado
            val.MetodoValidarent(n); // Llamar al método de validación
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingresa un número válido.");
        }
    }
}
