//7. Crear un programa que dibuje una escalera de números, donde cada línea de números comience
//en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al
//comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123

Algoritmo Ejercicio7_Escalera
	definir altura Como Entero
	
	escribir "Ingrese la altura de su escalera:"
	leer altura
	
    escalera(altura)
	
FinAlgoritmo

SubProceso escalera(altura)
	
	Definir i, j como entero
	
	Para i=1 Hasta altura Con Paso 1 Hacer
		
		Para j=1 Hasta i Con Paso 1 Hacer
			escribir sin saltar j
		Fin Para
		
		escribir ""
		
	Fin Para
	
FinSubProceso











