// Algoritmo: Adivinar el Número Secreto
// 1.	Inicio del Programa:
// •	Iniciar el programa.
// 2.	Generar Número Secreto:
// •	Generar un número secreto aleatorio entre 1 y 100 y guardarlo en una variable (numeroSecreto).
// 3.	Solicitar Intentos al Usuario:
// •	Iniciar un bucle que permita al usuario realizar múltiples intentos para adivinar el número secreto.
// 4.	Solicitar Número al Usuario:
// •	Pedir al usuario mediante prompt que ingrese un número y guardarlo en una variable (intento).
// 5.	Validar Datos Ingresados:
// •	Convertir el número ingresado a número entero (parsedIntento) utilizando parseInt.
// •	Verificar si el número es un entero válido entre 1 y 100. Si no es válido, mostrar un mensaje de error y volver al paso 4.
// 6.	Comparar con el Número Secreto:
// •	Comparar el número ingresado con el número secreto.
// •	Si son iguales, mostrar un mensaje de felicitaciones y terminar el bucle.
// 7.	Mostrar Resultado:
// •	Mostrar por consola o en el DOM un mensaje indicando si el intento fue correcto o incorrecto.
// •	Mostrar la lista de números introducidos hasta el momento.
// 8.	Repetir o Finalizar:
// •	Volver al paso 4 si el número no ha sido adivinado y el usuario desea realizar otro intento.
// •	Finalizar el programa si el número ha sido adivinado o si el usuario decide no realizar más intentos.
// 9.	Fin del Programa:
// •	Finalizar el programa.
// Fin del Algoritmo.


// Función para generar un número aleatorio entre 1 y 100
function generarNumeroSecreto() {
    return Math.floor(Math.random() * 100) + 1;
  }
  
  // Solicitar al usuario que adivine el número secreto
  let numeroSecreto = generarNumeroSecreto();
  let intentos = 0;
  const numerosIntroducidos = [];
  
  do {
    // Solicitar un número al usuario
    let intento = prompt('Adivina el número secreto (del 1 al 100):');
    intento = parseInt(intento);
  
    // Verificar si el intento es un número válido
    if (isNaN(intento) || intento < 1 || intento > 100) {
      console.error('Por favor, ingrese un número válido del 1 al 100.');
      continue;
    }
  
    // Agregar el intento a la lista de números introducidos
    numerosIntroducidos.push(intento);
  
    // Incrementar el contador de intentos
    intentos++;
  
    // Verificar si el número es correcto
    if (intento === numeroSecreto) {
      console.log('Felicidades, adivinaste el número secreto.');
      break;
    } else {
      console.log('Ups, el número secreto es incorrecto, vuelve a intentarlo.');
    }
  } while (true);
  
  // Mostrar la lista de números introducidos por consola
  console.log('Números introducidos:', numerosIntroducidos);
  
  // También puedes mostrar los resultados en el DOM si lo prefieres
  document.write('<p>Felicidades, adivinaste el número secreto.</p>');
  document.write('<p>Números introducidos: ' + numerosIntroducidos.join(', ') + '</p>');