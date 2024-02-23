
// Algoritmo: Convertir Temperatura
// 1.	Inicio del Programa:
// •	Iniciar el programa.
// 2.	Solicitar Temperatura en Grados Celsius:
// •	Pedir al usuario mediante prompt que ingrese la temperatura en grados Celsius y guardarla en una variable (temperaturaCelsius).
// 3.	Validar Datos Ingresados:
// •	Convertir la temperatura ingresada a número (parsedTemperatura) utilizando parseFloat.
// •	Verificar si la temperatura es un número válido. Si no es válido, mostrar un mensaje de error y finalizar el programa.
// 4.	Calcular Conversiones:
// •	Calcular la temperatura en grados Fahrenheit utilizando la fórmula (Celsius * 9/5) + 32 y guardar el resultado en una variable (temperaturaFahrenheit).
// •	Calcular la temperatura en grados Kelvin utilizando la fórmula Celsius + 273.15 y guardar el resultado en una variable (temperaturaKelvin).
// 5.	Mostrar Resultados:
// •	Mostrar por consola o en el DOM la temperatura en grados Fahrenheit.
// •	Mostrar por consola o en el DOM la temperatura en grados Kelvin.
// 6.	Fin del Programa:
// •	Finalizar el programa.
// Fin del Algoritmo.




// Celsius a Fahrenheit
function celsiusToFahrenheit(celsius) {
    return (celsius * 9 / 5) + 32;
  }
  
// Celsius a Kelvin
  function celsiusToKelvin(celsius) {
    return celsius + 273.15;
  }
  
  let temperaturaCelsius;
  do {
    temperaturaCelsius = prompt('Ingrese la temperatura en grados Celsius:');
    temperaturaCelsius = parseFloat(temperaturaCelsius);
  } while (isNaN(temperaturaCelsius));
  
  const temperaturaFahrenheit = celsiusToFahrenheit(temperaturaCelsius);
  const temperaturaKelvin = celsiusToKelvin(temperaturaCelsius);
  
  console.log(`Grados Fahrenheit: ${temperaturaFahrenheit}`);
  console.log(`Grados Kelvin: ${temperaturaKelvin}`);
  