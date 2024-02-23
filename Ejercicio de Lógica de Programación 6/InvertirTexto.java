// 1. Iniciar el programa.

// 2. Solicitar al usuario una palabra o frase mediante la consola.
//    - Entrada: palabraFrase (string)

// 3. Crear una función (invertirTexto) para invertir la palabra o frase.
//    - Parámetro de entrada: palabraFrase
//    - Salida: textoInvertido

// 4. Mostrar por consola el texto invertido.
//    - Salida: textoInvertido

// 5. Finalizar el programa.

//////////////ALGOTIMO
// INICIO

//     // Paso 2: Solicitar palabra o frase al usuario
//     ESCRIBIR "Ingrese una palabra o frase:"
//     LEER palabraFrase

//     // Paso 3: Crear función para invertir el texto
//     textoInvertido = invertirTexto(palabraFrase)

//     // Paso 4: Mostrar el texto invertido por consola
//     ESCRIBIR "Texto invertido:", textoInvertido

// FIN


import java.util.Scanner;

public class InvertirTexto {

    public static void main(String[] args) {
        // Paso 2: Solicitar palabra o frase al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase:");
        String palabraFrase = scanner.nextLine();

        // Paso 3: Crear función para invertir el texto
        String textoInvertido = invertirTexto(palabraFrase);

        // Paso 4: Mostrar el texto invertido por consola
        System.out.println("Texto invertido: " + textoInvertido);
        scanner.close();
    }

    // Paso 3: Función para invertir el texto
    private static String invertirTexto(String palabraFrase) {
        StringBuilder textoInvertido = new StringBuilder(palabraFrase);
        return textoInvertido.reverse().toString();
    }
}
