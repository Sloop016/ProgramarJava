Algoritmo ejercicio1_interletra
		definir letraa, letrab como entero		
		
		escribir "Ingrese Var A y Var B: "
		leer letraa, letrab
		
		intercambio(letraa,letrab)
		
		escribir "La Var A es " letraa ", y la Var B es " letrab "."
FinAlgoritmo
subproceso intercambio(a por referencia, b por referencia)
	definir cambio Como Entero
	
	cambio=a
	a=b
	b=cambio
	
FinSubProceso