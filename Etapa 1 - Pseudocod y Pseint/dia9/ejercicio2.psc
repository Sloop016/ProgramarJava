Algoritmo ejercicio2
	Definir max , min , num, cont, i Como Entero
	Definir promedio Como Real
	Escribir "ingrese un n�mero"
	leer num
	cont = 0
	max = num
	i = 0
	min = num
	Repetir
		i = i + num
		si (num > max) Entonces
			max = num 	//num max
		FinSi
		
		si (num < min) Entonces
			min = num //num min
		FinSi
		
		cont = cont + 1 //contador para promedio
		Escribir "Ingrese un numero" 
		Leer num
		
	Mientras Que (num <> 0)
	promedio = i / cont
	
	Escribir "El numero maximo es " ,max 
	Escribir "El n�mero minimo es: ", min 
	Escribir "El promedio total es: " promedio
FinAlgoritmo
