Algoritmo ejercicio1
	Definir letra Como caracter
	Definir num, num2 Como Entero
	Definir condicion Como Logico
	Escribir "Defina que operacion desea hacer"
	Escribir "S ó s : SUMA"
	Escribir "R ó r : RESTA"
	Escribir "M ó m : MULTIPLICACION"
	Escribir "D ó d : DIVISION"
	Escribir "Ingrese la letra deseada"
	leer letra	
	letra = Mayusculas(letra)
	condicion = (letra == "S") o (letra == "R") o (letra == "M") o (letra == "D")
	si condicion entonces
	Escribir "Ingrese primer numero a operar"
	leer num
	Escribir "Ingrese primer numero a operar"
	leer num2
	segun letra hacer
		"S" o "s" :
			Escribir "Usted quiere realizar una Suma. Su resultado es: " num+num2 
		"R" o "r" :
			Escribir "Usted quiere realizar una Resta. Su resultado es: " num-num2 
		"M" o "m" :
			Escribir "Usted quiere realizar una Multiplicacion. Su resultado es: " num*num2 
		"D" o "d" :
			Escribir "Usted quiere realizar una Division. Su resultado es: " num/num2 
		De Otro Modo:
			Escribir "No elegiste la Correspondiente accion"
	FinSegun
sino 
	escribir	"No elegiste la Correspondiente accion"
FinSi

	Escribir "Operacion Realizada."
FinAlgoritmo
