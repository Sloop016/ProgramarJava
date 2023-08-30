Algoritmo ejericio5
	Definir numMin, numMax, num, cant Como Entero
	
	Escribir "Ingreso un valor minimo"
	Leer numMin
	Escribir  "Ingrese un valor maximo"
	Leer numMax
	
	cant = 0
	
	Escribir "Ingrese un numero"
	leer num
	
	Mientras num > numMin Y num < numMax Hacer
		cant = cant + 1
		num = num +1
		Escribir "Cant = " cant
		Escribir "Ingrese un numero"
		Leer num
	FinMientras
	
	Escribir "La cantidad de numeros ingresados dentro del intervalo " numMin " Y " numMax " fue: " cant
	
FinAlgoritmo
