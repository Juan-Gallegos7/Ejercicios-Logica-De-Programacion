// <!-- 
// 1. Iniciar el programa.

// 2. Crear un array para almacenar los 10 números.

// 3. Solicitar al usuario que ingrese 10 números y almacenarlos en el array.

// 4. Crear dos arrays adicionales: uno para los números primos y otro para los no primos.

// 5. Iterar sobre el array original y clasificar cada número como primo o no primo.

// 6. Mostrar por consola el array original.

// 7. Mostrar por consola el array con los números primos al inicio.

// INICIO

//     // Paso 2: Crear un array para almacenar los 10 números
//     Crear arrayNumeros de tamaño 10

//     // Paso 3: Solicitar al usuario que ingrese 10 números
//     PARA i DESDE 0 HASTA 9
//         ESCRIBIR "Ingrese el número en la posición " + i
//         LEER arrayNumeros[i]
//     FIN PARA

//     // Paso 4: Crear arrays adicionales para primos y no primos
//     Crear arrayPrimos de tamaño 10
//     Crear arrayNoPrimos de tamaño 10
//     inicializar contadores primos = 0, noPrimos = 0

//     // Paso 5: Clasificar los números como primos o no primos
//     PARA i DESDE 0 HASTA 9
//         SI arrayNumeros[i] es primo
//             arrayPrimos[primos] = arrayNumeros[i]
//             primos++
//         SINO
//             arrayNoPrimos[noPrimos] = arrayNumeros[i]
//             noPrimos++
//         FIN SI
//     FIN PARA

//     // Paso 6: Mostrar el array original
//     ESCRIBIR "Array Original:"
//     PARA i DESDE 0 HASTA 9
//         ESCRIBIR "pos[" + i + "] = " + arrayNumeros[i]
//     FIN PARA

//     // Paso 7: Mostrar el array con primos al inicio
//     ESCRIBIR "Array con Números Primos al Inicio:"
//     PARA i DESDE 0 HASTA primos-1
//         ESCRIBIR "pos[" + i + "] = " + arrayPrimos[i]
//     FIN PARA

//     PARA i DESDE 0 HASTA noPrimos-1
//         ESCRIBIR "pos[" + (primos + i) + "] = " + arrayNoPrimos[i]
//     FIN PARA

// FIN -->





import java.util.Scanner;

public class OrdenarNumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Crear un array para almacenar los 10 números
        int[] arrayNumeros = new int[10];

        // Paso 3: Solicitar al usuario que ingrese 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            arrayNumeros[i] = scanner.nextInt();
        }

        // Paso 4: Crear arrays adicionales para primos y no primos
        int[] arrayPrimos = new int[10];
        int[] arrayNoPrimos = new int[10];
        int primos = 0, noPrimos = 0;

        // Paso 5: Clasificar los números como primos o no primos
        for (int i = 0; i < 10; i++) {
            if (esPrimo(arrayNumeros[i])) {
                arrayPrimos[primos] = arrayNumeros[i];
                primos++;
            } else {
                arrayNoPrimos[noPrimos] = arrayNumeros[i];
                noPrimos++;
            }
        }

        // Paso 6: Mostrar el array original
        System.out.println("Array Original:");
        for (int i = 0; i < 10; i++) {
            System.out.println("pos[" + i + "] = " + arrayNumeros[i]);
        }

        // Paso 7: Mostrar el array con primos al inicio
        System.out.println("Array con Números Primos al Inicio:");
        for (int i = 0; i < primos; i++) {
            System.out.println("pos[" + i + "] = " + arrayPrimos[i]);
        }

        for (int i = 0; i < noPrimos; i++) {
            System.out.println("pos[" + (primos + i) + "] = " + arrayNoPrimos[i]);
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Función para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}