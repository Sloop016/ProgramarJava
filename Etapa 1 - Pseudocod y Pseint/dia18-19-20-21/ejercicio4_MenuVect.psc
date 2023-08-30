Algoritmo ejercicio4_MenuVect
	
	Definir eleccion como caracter
	definir dimensiones como entero
	definir vecA, vecB, vecC Como Real
	
	escribir "Defina la dimension de los vectores a utilizar:"
	leer dimensiones
	
	dimension vecA(dimensiones)
	dimension vecB(dimensiones)
	dimension vecC(dimensiones)
	
	vecB(0)=101
	vecA(0)=101
	
	limpiar pantalla
	
	hacer
		escribir ""
		Escribir "Ingrese la opción que desea realizar:"
		escribir ""
		escribir "A. Llenar Vector A."
		escribir "B. Llenar Vector B."
		escribir "C. Llenar Vector C con la suma de los vectores A y B."
		escribir "D. Llenar Vector C con la resta de los vectores B y A."
		escribir "E. Mostrar."
		escribir "F. Salir."
		ESCRIBIR ""
		leer eleccion
		eleccion=mayusculas(eleccion)
		
		segun eleccion hacer
			
			"A": 	limpiar pantalla
				
				opcionA(vecA, dimensiones)
				
			"B":	limpiar pantalla
				
				opcionB(vecB, dimensiones)
				
			"C":	limpiar pantalla
				
				opcionC(vecA ,vecB ,vecC, dimensiones)
				
			"D":	limpiar pantalla
				
				opcionD(VecA,vecB,vecC,dimensiones)
				
			"E":	limpiar pantalla
				
				opcionE(vecA,vecB,vecC,dimensiones)
				
			"F":	limpiar pantalla
			
			De Otro Modo:
				
				mientras eleccion<>"A" y eleccion<>"B" y eleccion<>"C" y eleccion<>"D" y eleccion<>"E" y eleccion<>"F"
					
					escribir "Opción inválida. Inténtalo nuevamente:"
					leer eleccion
					
				finmientras
				
		FinSegun
		
	mientras que eleccion<>"F"

escribir "Saliendo del programa..."
	
FinAlgoritmo

///*******************************************************************************

subproceso opcionA(vecA por referencia,dimensiones)
	
	DEFInir contador Como Entero
	
	para contador=0 hasta dimensiones-1 con paso 1 Hacer
		vecA(contador)=Aleatorio(-100,100)
	FinPara
	
	escribir "El vector A ha sido rellenado."
	ESCRIBIR ""
	ESCRIBIR "*******************************"
	
FinSubProceso

///*******************************************************************************

subproceso opcionB(vecB por referencia, dimensiones)

	DEFInir contador Como Entero
	
	para contador=0 hasta dimensiones-1 con paso 1 Hacer
		vecB(contador)=Aleatorio(-100,100)
	FinPara
	
	escribir "El vector B ha sido rellenado."
	ESCRIBIR ""
	ESCRIBIR "*******************************"
	
FinSubProceso

///*******************************************************************************

subproceso opcionC(vecA por referencia ,vecB por referencia,vecC por referencia, dimensiones)

	definir contador Como Entero
	
	si vecB(0)=101 o vecA(0)=101 entonces  
		
		escribir "No se rellenó el vector C porque el vector A o el vector B aún no están rellenados"
		ESCRIBIR ""
		ESCRIBIR "*******************************"
		
	sino 
		para contador=0 hasta dimensiones-1 con paso 1 Hacer
			vecC(contador)=vecA(contador)+vecB(contador)
		FinPara
		
		escribir "El vector C ha sido rellenado con la suma de los vectores A y B."
		ESCRIBIR ""
		ESCRIBIR "*******************************"
		
	FinSi
	
finsubproceso

///*******************************************************************************

subproceso opcionD(vecA por referencia ,vecB por referencia,vecC por referencia, dimensiones)
	
	definir contador Como Entero
	
	si vecB(0)=101 o vecA(0)=101 entonces  
		
		escribir "No se rellenó el vector C porque el vector A o el vector B aún no están rellenados"
		ESCRIBIR ""
		ESCRIBIR "*******************************"
		
	sino 
		para contador=0 hasta dimensiones-1 con paso 1 Hacer
			vecC(contador)=vecB(contador)-vecA(contador)
		FinPara
		
		escribir "El vector C ha sido rellenado con la resta del vector A hacia el vector B."
		ESCRIBIR ""
		ESCRIBIR "*******************************"
		
	FinSi
	
FinSubProceso

///*******************************************************************************

subproceso opcionE(vecA,vecB,vecC,Dimensiones)
	
	definir elegido Como Caracter
	definir contador como entero
	
	escribir "Elija cuál vector quiere ver: A, B o C."
	
	leer elegido
	elegido=mayusculas(elegido)
	
	mientras elegido<>"A" y elegido<>"B" y elegido<>"C" 
		Escribir "Opción inválida. Inténtalo denuevo:"
		leer elegido
	FinMientras
	
	segun elegido hacer
		
		"A": Escribir "A continuación se mostrará cada posición del vector A:"
			
			para contador=0 hasta dimensiones-1 con paso 1 Hacer
				escribir "Su posición " contador " es " vecA(contador)
			FinPara
			
		"B": Escribir "A continuación se mostrará cada posición del vector B:"
			
			para contador=0 hasta dimensiones-1 con paso 1 Hacer
				escribir "Su posición " contador " es " vecB(contador)
			FinPara
			
		"C": Escribir "A continuación se mostrará cada posición del vector C:"
			
			para contador=0 hasta dimensiones-1 con paso 1 Hacer
				escribir "Su posición " contador " es " vecC(contador)
			FinPara
			
	FinSegun
	
FinSubProceso









