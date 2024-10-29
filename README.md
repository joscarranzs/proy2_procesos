# Proyecto 2 - Desarrollo de Software

## Objetivos

1. Crear un programa principal que gestione los demas programas.
2. Desarrollar correctamente los procesos y calculos de los demas programas.
3. Realizar una interfaz grafica para el programa principal y los demas programas.

## Requisitos

- Se debe utilizar el lenguaje de programacion Java.
- Se debe utilizar la libreria Swing y demas librerias de Java.
- Se puede utilizar un IDE con interfaz grafica o en consola con nvim.

## Recomendaciones

- Nombrar las clases y metodos de manera que se entiendan.
- Usar nombres de variables que se entiendan.
- Reutilizar condigo cuando sea posible.
- Optimizar el código para que sea eficiente.
- Evitar la repetición de código.

## Ejemplo

```java
public class Main {
  public static void main(String[] args) {
    // LLamar al unico metodo que se encarga de mostrar el menu principal
    MainMenu.showMainMenu();
  }
}
```

```java
public class MainMenu {
  public static void showMainMenu() {
    // Desarrollar la logica de la interfaz grafica
  }
}
```

## Ejemplo de codigo basura

```java
public class Main {
  public static void main(String[] args) {
    // LLamar al unico metodo que se encarga de mostrar el menu principal
    MainMenu.showMainMenu();
  }
}

class MainMenu {
  public static void showMainMenu() {
    // Desarrollar la logica de la interfaz grafica
  }
}
```

## Ejemplo de codigo basura

```java
public class Example {
  // Esto es un nombre generico, puede significar que imprima cualquier cosa.
  public String imprimir() {
    return "Hola mundo";
  }

  // Nombramiento correcto de los metodos, siendo mas específico.
  public String imprimirInformacionUsuario() {
    return "Jose";
  }

  public String imprimirInformacionVentas() {
    return "10";
  }
}
```

### Sugerencias

- Los nombres de los metodos son mas descriptivos y se entienden mejor lo que hacen.
- Las variables deben ser nombradas de manera que se entiendan.
- Asi todos los demas desarrolladores pueden enteder el código.
