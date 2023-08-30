//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.

Algoritmo Ejercicio5_convTxtaDist
	definir frase como texto
	
	escribir "Ingrese una frase a espaciar:"
	leer frase
	
	convertirEspaciado(frase)
	
FinAlgoritmo


subproceso convertirEspaciado(frase por referencia)
	
	definir i como entero

	Para i=0 Hasta longitud(frase)-1 Con Paso 1 Hacer
		EScribir sin saltar subcadena(frase,i,i), " "
	Fin Para
	
FinSubProceso