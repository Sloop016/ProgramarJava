funcion retorno <- sumar (num1 Por Referencia, num2 Por Referencia)
	Definir retorno Como Entero
	retorno = num1+num2
FinFuncion

Algoritmo ejercicio1
	Definir num1, num2, resultado como entero
	Escribir "escriba dos numeros a sumar"
	leer num1, num2
	resultado = sumar (num1, num2)
	Escribir "el resultado es: " resultado
FinAlgoritmo


//Realizar una función que calcule la suma de dos números. En el algoritmo principal le pedire-
//mos al usuario los dos números para pasárselos a la función. Después la función calculará la
//suma y lo devolverá para imprimirlo en el algoritmo.