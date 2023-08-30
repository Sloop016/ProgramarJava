//Se debe crear una matriz con las siguientes palabras como se muestra a continuación. Luego de
//eso debemos acomodar las palabras para que la primera letra ?R? de cada una quede en la
//posición 5, alineándose.

////////////////////////////////////////////////////////////////////////////

Algoritmo ejercicioCooperativoGuia4
	Definir tablero como Cadena
	Dimension tablero[9, 12]
	inicializarMatriz(tablero, 9, 12)
	agregarPalabra(tablero, "VECTOR", 0)
	agregarPalabra(tablero, "MATRIZ", 1)
	agregarPalabra(tablero, "PROGRAMA", 2)
	agregarPalabra(tablero, "SUBPROGRAMA", 3)
	agregarPalabra(tablero, "SUBPROCESO", 4)
	agregarPalabra(tablero, "VARIABLE", 5)
	agregarPalabra(tablero, "ENTERO", 6)
	agregarPalabra(tablero, "PARA", 7)
	agregarPalabra(tablero, "MIENTRAS", 8)
	acomodarPalabras(tablero,9,12)
	imprimirMatriz(tablero, 9, 12)
FinAlgoritmo

////////////////////////////////////////////////////////////////////////////
SubAlgoritmo inicializarMatriz(x,df,dc)
	Definir i,z Como Entero
	para i=0 Hasta df-1
		para z=0 hasta dc-1
			x[i,z] = "*"
		FinPara
	FinPara
FinSubAlgoritmo

////////////////////////////////////////////////////////////////////////////
SubAlgoritmo agregarPalabra(x,palabra,posicion)
	Definir i Como Entero
	para i=0 Hasta Longitud(palabra)-1
		x[posicion,i]=Subcadena(palabra,i,i)
	FinPara
FinSubAlgoritmo

////////////////////////////////////////////////////////////////////////////
SubAlgoritmo acomodarPalabras(x,df,dc)
	Definir i,z,posR Como Entero
	posR=0
	para i=0 Hasta df-1
		buscarR(x,i,dc,posR)
		//Recorremos las columnas de forma inversa a fin de correr las palabras
		Para z=dc-1 Hasta 0 Con Paso -1
			//a fin de saber hasta donde tenemos que arrastrar la palabra  restamos a la posicion que necesitamos ubicar la R que es 5 a la posicion de R
			si z-(5-posR) >= 0
				x[i,z]=x[i,z-(5-posR)]
			SiNo
				//Una vez que llegamos al punto final de recorrer todas las columnas principales, terminamos de completar los espacios con *
				x[i,z]="*"
			FinSi
		FinPara
	FinPara
FinSubAlgoritmo

////////////////////////////////////////////////////////////////////////////
SubAlgoritmo imprimirMatriz(x,df,dc)
	Definir i,z Como Entero
	para i=0 hasta df-1
		para z=0 Hasta dc-1
			Escribir Sin Saltar x[i,z]," | "
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo

////////////////////////////////////////////////////////////////////////////
SubAlgoritmo buscarR(x,f,dc,posicionR Por Referencia)
	Definir i Como Entero
	Definir rEncontrada Como Logico
	rEncontrada=Falso
	para i=0 Hasta dc-1
		si x[f,i] == 'R' y rEncontrada=Falso
			posicionR = i
			rEncontrada=Verdadero
		FinSi
	FinPara
FinSubAlgoritmo
