// Algoritmo: Calcular Factorial
// 1.	Inicio del Programa:
// •	Iniciar el programa.
// 2.	Solicitar un Número al Usuario:
// •	Pedir al usuario mediante prompt que ingrese un número entero no negativo y guardarlo en una variable (numero).
// 3.	Validar Datos Ingresados:
// •	Convertir el número ingresado a número entero (parsedNumero) utilizando parseInt.
// •	Verificar si el número es un entero no negativo. Si no es válido, mostrar un mensaje de error y finalizar el programa.
// 4.	Calcular el Factorial:
// •	Crear una función recursiva (calcularFactorial) que calcule el factorial de un número.
// •	Llamar a la función calcularFactorial con el número ingresado y guardar el resultado en una variable (factorial).
// 5.	Mostrar Resultado:
// •	Mostrar por consola o en el DOM el resultado del factorial del número ingresado.
// 6.	Fin del Programa:
// •	Finalizar el programa.



// calcular el factorial de un número
function calcularFactorial(numero) {
    if (numero === 0 || numero === 1) {
      return 1;
    } else {
      return numero * calcularFactorial(numero - 1);
    }
  }
  
  let numero;
  do {
    numero = prompt('Ingrese un número para calcular su factorial:');
    numero = parseFloat(numero);
  } while (isNaN(numero));
  
  // el número es un entero no negativo
  if (Number.isInteger(numero) && numero >= 0) {
    // Calcular el factorial y mostrar el resultado por consola
    const factorial = calcularFactorial(numero);
    console.log(factorial);
  }