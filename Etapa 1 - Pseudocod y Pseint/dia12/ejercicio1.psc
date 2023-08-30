Algoritmo ejericio1
	definir num,i, j Como Entero
	Escribir "ingrese un número del 1 al 20"
	para i<-1 hasta 5 con paso 1 Hacer
		
		leer num
			Si num>0 y num<21 Entonces
				escribir sin saltar num " "
				Para j=0 hasta num-1 con paso 1 Hacer
					escribir sin saltar "*"
					
				FinPara
			SiNo
				escribir "Ingrese un número valido"
			Finsi
			Escribir ""
	Finpara
			
FinAlgoritmo
