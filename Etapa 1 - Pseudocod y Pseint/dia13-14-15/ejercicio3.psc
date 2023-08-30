Funcion mp <- esMultiplo(n1, n2)
    Definir mp Como Logico
    
    Si n1 % n2 == 0
        mp = Verdadero
    SiNo
        mp = Falso
    FinSi
    
FinFuncion
Algoritmo ejercicio3
	Definir n1,n2 Como Entero
	Definir m,mp Como Logico
	Escribir " ingrese un numero"
	leer n1
	Escribir "ingrese otro numero"
	leer n2
	mp=(n1/n2)=redon(n1/n2)
	m=mp
	Escribir m
FinAlgoritmo
