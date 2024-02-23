//////// INICIO ///////////
//     // Paso 2: Crear un objeto HashMap para almacenar pares de palabras
//     Crear diccionario como un objeto HashMap

//     // Paso 3: Agregar al menos 20 palabras y sus traducciones al diccionario
//     diccionario.put("gato", "cat");
//     diccionario.put("perro", "dog");
//     diccionario.put("casa", "house");
//     diccionario.put("libro", "book");
//     diccionario.put("sol", "sun");

//     // Paso 4: Seleccionar al azar 5 palabras en español
//     palabrasSeleccionadas = seleccionarAzar(diccionario, 5)

//     // Paso 5: Solicitar al usuario que ingrese la traducción al inglés de cada palabra
//     respuestasCorrectas = 0
//     respuestasIncorrectas = 0

//     PARA cada palabra en palabrasSeleccionadas
//         ESCRIBIR "Traduzca la palabra '" + palabra + "':"
//         LEER respuestaUsuario

//         // Paso 6: Verificar si la respuesta es correcta
//         SI respuestaUsuario es igual a diccionario.obtenerTraduccion(palabra)
//             respuestasCorrectas++
//         SINO
//             respuestasIncorrectas++
//         FIN SI
//     FIN PARA

//     // Paso 7: Mostrar por consola cuántas respuestas fueron correctas e incorrectas
//     ESCRIBIR "Respuestas Correctas: " + respuestasCorrectas
//     ESCRIBIR "Respuestas Incorrectas: " + respuestasIncorrectas

// FIN



import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class JuegoTraduccion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Paso 2: Crear un objeto HashMap
        Map<String, String> diccionario = new HashMap<>();

        // Paso 3: Agregar palabras y sus traducciones al diccionario
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("listo", "smart");
        diccionario.put("tarea", "task");
        diccionario.put("cada", "each");
        diccionario.put("ambos", "both");
        diccionario.put("fuga", "leak");
        diccionario.put("destino", "fate");
        diccionario.put("trabajo", "job");
        diccionario.put("sol", "sun");
        diccionario.put("vacio", "empty");
        diccionario.put("evitar", "avoid");
        diccionario.put("odiar", "hate");
        diccionario.put("cercano", "close");
        diccionario.put("desafiar", "challenge");
        diccionario.put("aburrido", "boring");
        diccionario.put("hombro", "shoulder");


        // Paso 4: Seleccionar al azar 5 palabras en español
        String[] palabrasSeleccionadas = seleccionarAzar(diccionario, 5, random);

        // Paso 5: Solicitar al usuario que ingrese la traducción al inglés de cada palabra
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Traduzca la palabra '" + palabra + "': ");
            String respuestaUsuario = scanner.nextLine();

        // Paso 6: Verificar si la respuesta es correcta
            if (respuestaUsuario.equals(diccionario.get(palabra))) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }

        // Paso 7: Mostrar por consola cuántas respuestas fueron correctas e incorrectas
        System.out.println("Respuestas Correctas: " + respuestasCorrectas);
        System.out.println("Respuestas Incorrectas: " + respuestasIncorrectas);
        scanner.close();
    }

    // seleccionar al azar palabras del diccionario
    private static String[] seleccionarAzar(Map<String, String> diccionario, int cantidad, Random random) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        String[] seleccionadas = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            seleccionadas[i] = palabras[random.nextInt(palabras.length)];
        }

        return seleccionadas;
    }
}