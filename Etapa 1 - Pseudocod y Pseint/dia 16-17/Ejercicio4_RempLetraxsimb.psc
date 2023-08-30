//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y termi-
//nada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vo-
//	cal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (inclu-
//	yendo a las vocales acentuadas) se mantienen sin cambios.
//	
//	a e i o u
//	@ # $ % *
//	
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación co-
//	rrespondiente. Utilice la estructura "según" para la transformación.
//		
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//	NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
Algoritmo Ejercicio4_Rempletraxsimb
	Definir frase, switch, carac Como Caracter
	Definir Qcarac Como Entero
	carac=""
	Escribir "ingrese palabras a encriptar, Finalize con un punto"
	leer frase
	Qcarac=Longitud(frase)	
	encriptar(frase,switch,carac,Qcarac)
	escribir "la frase quedaria: " switch
FinAlgoritmo

SubAlgoritmo encriptar(frase Por Referencia, switch Por Referencia, carac Por Referencia, Qcarac Por Referencia)
	Definir contador Como Entero
	switch=""
	
	mientras subcadena(frase,Qcarac-1,Qcarac-1)<>"."
		escribir "No terminó su frase con un punto. Inténtelo denuevo:"
		leer frase
		Qcarac=longitud(frase)
	finmientras
	
	para contador = 0 hasta Qcarac con paso 1 Hacer
		carac = Subcadena(frase, contador,contador)
		si carac= "a" o carac = "e" o carac = "i" o carac = "o" o carac= "u" Entonces
			carac=Minusculas(carac)
		FinSi
		segun carac hacer
			"a":switch=Concatenar(switch,"@")
			"e":switch=Concatenar(switch,"#")
			"i":switch=Concatenar(switch,"$")
			"o":switch=Concatenar(switch,"%")
			"u":switch=Concatenar(switch,"*")
			De Otro Modo:
				switch=Concatenar(switch,carac)
		FinSegun
		
		
		
	FinPara
	
	
FinSubAlgoritmo
	