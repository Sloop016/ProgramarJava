Algoritmo extra3 
	Definir num, num2 como Entero	
	Definir resto como Real
	Escribir "Escribe un numero"
	Leer num
	Escribir "Escribe un numero"
	Leer num2
	resto = 0
	si num  <> resto y num2 <> resto Entonces
		si num % 2 = 0
			si num2 % 2 = 0 Entonces	
		finsi
			Escribir "Los numeros que eligio son " num " y " num2 ", Ambos son Pares "
			sino 
			escribir "Los numeros que eligio son " num " y " num2 ", Uno de ellos es Impar"
		FinSi
	sino 
		escribir "Uno de los numero es cero"
	FinSi
	
FinAlgoritmo
