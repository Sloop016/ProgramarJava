//9. Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales repetidas.
//Al final el procedimiento mostrará la frase final.
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan
//		al no estar repetidas.

Algoritmo ejercicio9_rmvdeVocal
	
	definir frase como texto
	
	escribir "Ingrese una frase:"
	leer frase
	repetidas(frase)

FinAlgoritmo



subproceso repetidas(frase)
	definir contadorA, contadorB,A,E,I,O_,U Como Entero
	definir caracter_ como texto
	
	A=0
	E=0
	I=0
	O_=0
	U=0
	
	Para contadorB=0 Hasta longitud(frase)-1 Con Paso 1 Hacer
		
		caracter_=subcadena(frase,contadorB,contadorB)
		
		segun MAYUSCULAS(caracter_)
			
			"A": A=A+1
			"E": E=E+1
			"I": I=I+1
			"O": O_=O_+1
			"U": U=U+1
				
		FinSegun
		
		si ((mayusculas(caracter_)= "A" o mayusculas(caracter_)= "Á") y A>=2) o ((mayusculas(caracter_)="E"  o mayusculas(caracter_)= "É") y E>=2) O ((mayusculas(caracter_)="I"  o mayusculas(caracter_)= "Í") y I>=2) o ((mayusculas(caracter_)="O" o mayusculas(caracter_)= "Ó") y O_>=2) o ((mayusculas(caracter_)="U" o mayusculas(caracter_)= "Ú" ) y U>=2)
			entonces escribir sin saltar ""
		sino escribir sin saltar caracter_
		FinSi
		
	Fin Para
	
FinSubProceso


