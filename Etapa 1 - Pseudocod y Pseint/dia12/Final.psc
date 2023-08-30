Algoritmo Final
    //Definición de variables
    Definir calculadora Como Entero
    Definir cadena1, cadena2 Como Caracter
    Definir diagonal3D1, diagonal3D2 Como Entero
    ////Definimos las 3 dimensiones de la matriz calculadora
	Dimension calculadora[3,3,3]
	////Asignamos valores a las cadenas de texto
    cadena1 = "123456789"
    cadena2 = "987654321"
    ////Inicializamos la matriz
    inicializarMatriz(calculadora,3,3,3)
	////Llenamos las matrices como se marca en el enunciado
	llenarMatriz_Z0(calculadora, cadena1)
	llenarMatriz_Z1(calculadora, cadena2)
	llenarMatriz_Z2(calculadora)
	////Mostramos los resultados de la matriz
    imprimirMatriz(calculadora,3,3,3)
	////Asignamos los valores de las diagonales 3D
	//	diagonal3D1 = calculadora(0, 2, 0)*calculadora(1, 1,1)*calculadora(2, 0, 2)
	//	diagonal3D2 = calculadora(0, 0, 0)*calculadora(1, 1,1)*calculadora(2, 2, 2)
	
    ////Escribimos los resultados de las diagonales
    //Escribir "La multiplicación de los elementos de la diagonal 3D 1 es ", diagonal3D1
    //Escribir "La multiplicación de los elementos de la diagonal 3D 2 es ", diagonal3D2
	
FinAlgoritmo

SubProceso inicializarMatriz(calculadora,3,3,3)
	
	Definir i, j, z Como Entero
	Para i <- 0 Hasta 2 
		Para j <- 0 Hasta 2 
			Para z <- 0 hasta 2
				calculadora(i,j,z) = 0
			FinPara
		Fin Para
	Fin Para
FinSubProceso

SubProceso llenarMatriz_Z0(calculadora, cadena1)
	Definir i, j, z Como Entero
	Para i <- 0 Hasta 2 
		Para j <- 0 Hasta 2 
			Para z <- 0 hasta 2
				Si i=0 Entonces
					calculadora(i,j,z)=ConvertirANumero(cadena1)
				FinSi
			FinPara
		FinPara
	FinPara	
FinSubProceso

SubProceso llenarMatriz_Z1(calculadora, cadena2)
	Definir i, j, z Como Entero
	
	Para i <- 0 Hasta 2 
		Para j <- 0 Hasta 2 
			Para z <- 0 hasta 2
				Si i=1 Entonces
					calculadora(i,j,z)=ConvertirANumero(cadena2)
				FinSi
			FinPara
		FinPara
	FinPara	
FinSubProceso

SubProceso llenarMatriz_Z2(calculadora)
	Definir i, j, z Como Entero
	Para i <- 0 Hasta 2 
		Para j <- 0 Hasta 2 
			Para z <- 0 hasta 2
				Si i=2 Entonces
					
				FinSi
			FinPara
		FinPara
	FinPara
			
FinSubProceso

SubProceso imprimirMatriz(calculadora,3,3,3)
	Definir i, j, z Como Entero
	Para i <- 0 Hasta 2 
		Para j <- 0 Hasta 2 
			Para z <- 0 hasta 2
				Escribir Sin Saltar calculadora(i,j,z) " "
			FinPara
			Escribir ""
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso
	