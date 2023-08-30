///1. Realiza un programa que sólo permita introducir los caracteres S y N. Si el usuario
///ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que
///diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".
Algoritmo sin_titulo
	Definir palabra Como Cadena
	Definir condicion, p Como Caracter
	Escribir "Escriba una letra"
	Leer palabra
	si (subcadena(palabra,0,0) == "P") o (subcadena(palabra,0,0) == "N") o (subcadena(palabra,0,0) == "n") o (subcadena(palabra,0,0) == "p") Entonces
		Escribir "CORRECTO"
	sino 
		Escribir "INCORRECTO"
	FinSi
	
	
FinAlgoritmo
