// Ejercicio 1:
// Algoritmo: Ordenar y Comparar Números
// 1.	Inicio del Programa:
// •	Iniciar el programa.
// 2.	Solicitar Datos al Usuario:
// •	Pedir al usuario mediante prompt que ingrese tres números y guardarlos en variables (num1, num2, num3).
// 3.	Validar Datos Ingresados:
// •	Convertir los valores ingresados a números (parsedNum1, parsedNum2, parsedNum3) utilizando parseFloat.
// •	Verificar si los valores son números válidos. Si algún valor no es válido, mostrar un mensaje de error y finalizar el programa.
// 4.	Ordenar los Números:
// •	Crear un array sortedNumbers que contenga los números ordenados de menor a mayor.
// 5.	Mostrar Números Ordenados:
// •	Mostrar por consola o en el DOM el array sortedNumbers.
// •	Mostrar por consola o en el DOM los números ordenados de mayor a menor.
// •	Mostrar por consola o en el DOM los números ordenados de menor a mayor.
// 6.	Comparar Números para Verificar Igualdad:
// •	Verificar si los números son iguales (parsedNum1 === parsedNum2 && parsedNum2 === parsedNum3).
// •	Si son iguales, mostrar un mensaje indicando que los números son iguales.
// 7.	Fin del Programa:
// •	Finalizar el programa.
// Fin del Algoritmo.




// Pedir tres números al usuario
const num1 = prompt('Ingrese el primer número:');
const num2 = prompt('Ingrese el segundo número:');
const num3 = prompt('Ingrese el tercer número:');

// Convertir a número y verificar que sea válido
const parsedNum1 = parseFloat(num1);
const parsedNum2 = parseFloat(num2);
const parsedNum3 = parseFloat(num3);

if (isNaN(parsedNum1) || isNaN(parsedNum2) || isNaN(parsedNum3)) {
  console.error('Por favor, ingrese números válidos.');
} else {
  // Ordenar los números
  const sortedNumbers = [parsedNum1, parsedNum2, parsedNum3].sort((a, b) => a - b);

  // Mostrar los números por consola
  console.log(sortedNumbers);

  // Mostrar los números de mayor a menor
  console.log('Ordenados de mayor a menor:', sortedNumbers.join(', '));

  // Mostrar los números de menor a mayor
  console.log('Ordenados de menor a mayor:', sortedNumbers.reverse().join(', '));

  // Verificar si los números son iguales
  if (parsedNum1 === parsedNum2 && parsedNum2 === parsedNum3) {
    console.log('Los números son iguales.');
  }
}