// Algoritmo: Generar Serie de Fibonacci
// 1.	Inicio del Programa:
// •	Iniciar el programa.
// 2.	Solicitar un Número al Usuario:
// •	Pedir al usuario mediante prompt que ingrese un número entero no negativo y guardarlo en una variable (numero).
// 3.	Validar Datos Ingresados:
// •	Convertir el número ingresado a número entero (parsedNumero) utilizando parseInt.
// •	Verificar si el número es un entero no negativo. Si no es válido, mostrar un mensaje de error y finalizar el programa.
// 4.	Generar Serie de Fibonacci:
// •	Crear una función (generarFibonacci) que genere la serie de Fibonacci hasta un número dado.
// •	Llamar a la función generarFibonacci con el número ingresado y guardar el resultado en una variable (serieFibonacci).
// 5.	Mostrar Resultado:
// •	Mostrar por consola o en el DOM la serie de Fibonacci generada.
// 6.	Fin del Programa:
// •	Finalizar el programa.
// Fin del Algoritmo.



// generar la serie de Fibonacci hasta un número dado
function fibonacciSerie(numero) {
    const serie = [0, 1];
  
    for (let i = 2; i < numero; i++) {
      serie[i] = serie[i - 1] + serie[i - 2];
    }
  
    return serie;
  }
  
  let numero;
  
  do {
    numero = prompt('Ingrese un número para generar la serie de Fibonacci:');
    numero = parseInt(numero);
  } while (isNaN(numero) || numero < 0);
  
  const resultado = fibonacciSerie(numero);
  console.log(resultado);
  