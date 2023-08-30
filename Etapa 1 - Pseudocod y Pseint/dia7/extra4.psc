Algoritmo extra4
	Definir llanta Como Entero
	Escribir "cuantas llantas quiere comprar"
	leer llanta	
	si (llanta <= 4 ) Entonces
		Escribir "el precio por llanta son 3000 c/u. danto un total de: $" llanta*3000
		sino
		si (llanta >= 5 ) y (llanta <= 9 ) Entonces
			Escribir "el precio por llanta son 2500 c/u. danto un total de: $" llanta*2500
			sino
			si (llanta >= 10) Entonces
				Escribir "el precio por llanta son 2000 c/u. danto un total de: $" llanta*2000
			FinSi
		FinSi
	FinSi
FinAlgoritmo
