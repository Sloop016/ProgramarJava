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


//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le pedire-
//mos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n calcular� la
//suma y lo devolver� para imprimirlo en el algoritmo.