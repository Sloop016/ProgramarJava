Algoritmo extra14clase3
	
    Definir num, numUno, numDos Como Real
	
    Escribir "Ingrese un n�mero de dos cifras:"
    Leer num 
	
    numUno = num MOD 10
    num = trunc(num / 10)
    numDos = num MOD 10
    num = trunc(num / 10)
	
    Escribir "N�mero invertido: ", numUno, numDos, "."
	
FinAlgoritmo