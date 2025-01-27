/*Nos pide que determinemos los dígitos de un número dado están en orden de menor a mayor.
Esto significa que cada dígito del número debe ser igual o 
mayor que el anterior cuando se leen de izquierda a derecha. 
Si cualquier dígito es menor que el anterior, el número no es "ordenado" 
y la respuesta debe ser false; si todos los dígitos están en orden, la respuesta debe ser true.*/

/* Función tidyNumber(número)
    Convertir número a cadena de caracteres (Char)
    Convertir la cadena a un arreglo de caracteres (Digitos)
    
    Para i = 1 hasta la longitud de digitos - 1
        Si digitos[i] es menor que digitos[i - 1]
            Devolver falso
        FinSi
    FinPara
    
    Devolver verdadero
FinFunción

Función principal
    Imprimir tidyNumber(12)    // true
    Imprimir tidyNumber(32)    // false
    Imprimir tidyNumber(39)    // true
    Imprimir tidyNumber(1024)  // false
    Imprimir tidyNumber(12576) // false
    Imprimir tidyNumber(13579) // true
    Imprimir tidyNumber(2335)  // true
FinFunción
 */
