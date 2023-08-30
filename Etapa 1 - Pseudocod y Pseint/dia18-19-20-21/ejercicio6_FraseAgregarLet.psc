Algoritmo ejercicio6_FraseAgregarLet
	
	definir vector,frase, letra Como Caracter
	definir contador, posicion como entero
	dimension vector(20)
	
	escribir "Ingrese una frase: "
	leer frase
	
	mientras longitud(frase)>20
		escribir "Frase demasiado larga. Inténtelo denuevo:"
		leer frase
	FinMientras
	
	para contador=0 hasta 19 con paso 1 Hacer
		
		si contador<=longitud(frase)
			vector(contador)=subcadena(frase,contador,contador)
		sino
			vector(contador)=" "
		finsi
		
	FinPara
	
	escribir "Ingrese un caracter:"
	leer letra
	
	mientras longitud(letra)>1 
		escribir "Debe ingresar 1 solo caracter. Inténtelo denuevo:"
		leer letra
		mientras letra=""
			escribir "Debe ingresar 1 caracter. Inténtelo denuevo:"
			leer letra
		FinMientras
	FinMientras
	
	escribir "Ingrese una posición dentro del vector:"
	leer posicion
	
	mientras posicion>20 o posicion<0
		escribir "Posición inválida. Inténtelo denuevo:"
		leer posicion
	FinMientras
	
	si vector(posicion)=" "
		entonces vector(posicion)=letra
		
		para contador=0 hasta 19 con paso 1 hacer
			escribir sin saltar vector(contador)
		finpara
		
	sino escribir "Ese espacio en el vector ya esta ocupado."
	FinSi
	
FinAlgoritmo