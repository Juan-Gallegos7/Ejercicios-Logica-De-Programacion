// 1. Iniciar el programa.

// 2. Crear un objeto HashMap para almacenar pares de palabras (Español-Inglés).

// 3. Agregar al menos 20 palabras y sus traducciones al diccionario.

// 4. Solicitar al usuario una palabra en español.

// 5. Verificar si la palabra está en el diccionario.
//    - Si está, mostrar la traducción en inglés por consola.
//    - Si no está, mostrar un mensaje indicando que la palabra no se encuentra en el diccionario.

// 6. Finalizar el programa.



// INICIO

//     // Paso 2: Crear un objeto HashMap para almacenar pares de palabras
//     Crear diccionario como un objeto HashMap

//     // Paso 3: Agregar al menos 20 palabras y sus traducciones al diccionario
//     diccionario.put("gato", "cat");
//     diccionario.put("perro", "dog");
//     // ... agregar más palabras al diccionario

//     // Paso 4: Solicitar al usuario una palabra en español
//     ESCRIBIR "Ingrese una palabra en español:"
//     LEER palabraEspañol

//     // Paso 5: Verificar si la palabra está en el diccionario
//     SI diccionario contiene la palabraEspañol
//         traduccionIngles = diccionario.obtenerTraduccion(palabraEspañol)
//         ESCRIBIR "La traducción en inglés es: " + traduccionIngles
//     SINO
//         ESCRIBIR "La palabra no se encuentra en el diccionario"
//     FIN SI

// FIN





import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Crear un objeto HashMap para almacenar pares de palabras
        HashMap<String, String> diccionario = new HashMap<>();

        // Paso 3: Agregar al menos 20 palabras y sus traducciones al diccionario
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("sol", "sun");
        // ... agregar más palabras al diccionario

        // Paso 4: Solicitar al usuario una palabra en español
        System.out.print("Ingrese una palabra en español: ");
        String palabraEspañol = scanner.nextLine();

        // Paso 5: Verificar si la palabra está en el diccionario
        if (diccionario.containsKey(palabraEspañol)) {
            String traduccionIngles = diccionario.get(palabraEspañol);
            System.out.println("La traducción en inglés es: " + traduccionIngles);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
