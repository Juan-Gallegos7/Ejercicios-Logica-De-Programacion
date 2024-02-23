// 1. Iniciar el programa.

// 2. Solicitar al usuario un día de la semana y una hora (horas y minutos) mediante la consola.
//    - Entradas: diaSemana (string), hora (entero), minutos (entero)

// 3. Validar los datos de entrada.
//    - Verificar que el día de la semana y la hora sean válidos.
//    - Si no son válidos, mostrar un mensaje de error y volver al paso 2.

// 4. Calcular cuántos minutos faltan para el fin de semana (Viernes a las 15:00 hrs).
//    - Utilizar la información proporcionada por el usuario para calcular los minutos restantes.

// 5. Mostrar el resultado por consola.
//    - Salida: Mensaje indicando los minutos restantes para el fin de semana.

// 6. Finalizar el programa.


// INICIO

//     // Paso 2: Solicitar día de la semana y hora al usuario
//     HACER
//         ESCRIBIR "Ingrese un día de la semana (Lunes - Viernes):"
//         LEER diaSemana

//         ESCRIBIR "Ingrese la hora (0-23):"
//         LEER hora

//         ESCRIBIR "Ingrese los minutos (0-59):"
//         LEER minutos
//     MIENTRAS (diaSemana no es válido o hora no es válido o minutos no es válido)

//     // Paso 4: Calcular minutos restantes para el fin de semana
//     minutosRestantes = calcularMinutosRestantes(diaSemana, hora, minutos)

//     // Paso 5: Mostrar el resultado por consola
//     ESCRIBIR "Faltan " + minutosRestantes + " minutos para el fin de semana"

// FIN


import java.util.Scanner;

public class MinutosParaFinDeSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Solicitar día de la semana y hora al usuario
        String diaSemana;
        int hora;
        int minutos;

        do {
            System.out.print("Ingrese un día de la semana (Lunes - Viernes): ");
            diaSemana = scanner.nextLine();

            System.out.print("Ingrese la hora (0-23): ");
            hora = scanner.nextInt();

            System.out.print("Ingrese los minutos (0-59): ");
            minutos = scanner.nextInt();

            scanner.nextLine(); // Limpiar el buffer del scanner
        } while (!validarDatosEntrada(diaSemana, hora, minutos));

        // Paso 4: Calcular minutos restantes para el fin de semana
        int minutosRestantes = calcularMinutosRestantes(diaSemana, hora, minutos);

        // Paso 5: Mostrar el resultado por consola
        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana");

        // Cerrar el scanner
        scanner.close();
    }

    // Paso 3: Validar datos de entrada
    private static boolean validarDatosEntrada(String diaSemana, int hora, int minutos) {
        // Validar que el día de la semana sea válido (Lunes - Viernes)
        if (!(diaSemana.equalsIgnoreCase("Lunes") || diaSemana.equalsIgnoreCase("Martes") ||
              diaSemana.equalsIgnoreCase("Miércoles") || diaSemana.equalsIgnoreCase("Jueves") ||
              diaSemana.equalsIgnoreCase("Viernes"))) {
            System.out.println("Error: Día de la semana no válido.");
            return false;
        }

        // Validar que la hora sea válida (0-23)
        if (hora < 0 || hora > 23) {
            System.out.println("Error: Hora no válida.");
            return false;
        }

        // Validar que los minutos sean válidos (0-59)
        if (minutos < 0 || minutos > 59) {
            System.out.println("Error: Minutos no válidos.");
            return false;
        }

        return true;
    }

    // Paso 4: Calcular minutos restantes para el fin de semana
    private static int calcularMinutosRestantes(String diaSemana, int hora, int minutos) {
        // Definir los minutos del fin de semana (Viernes a las 15:00 hrs)
        final int minutosFinDeSemana = (4 * 24 * 60) + (15 * 60);

        // Definir los minutos actuales desde el inicio de la semana
        int minutosActuales = 0;

        switch (diaSemana.toLowerCase()) {
            case "lunes":
                minutosActuales = hora * 60 + minutos;
                break;
            case "martes":
                minutosActuales = (24 * 60) + (hora * 60 + minutos);
                break;
            case "miércoles":
                minutosActuales = (2 * 24 * 60) + (hora * 60 + minutos);
                break;
            case "jueves":
                minutosActuales = (3 * 24 * 60) + (hora * 60 + minutos);
                break;
            case "viernes":
                minutosActuales = (4 * 24 * 60) + (hora * 60 + minutos);
                break;
        }

        // Calcular los minutos restantes para el fin de semana
        int minutosRestantes = minutosFinDeSemana - minutosActuales;

        // Manejar el caso cuando ya es fin de semana
        if (minutosRestantes < 0) {
            minutosRestantes = 0;
        }

        return minutosRestantes;
    }
}