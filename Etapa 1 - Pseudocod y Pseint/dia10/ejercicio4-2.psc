Algoritmo ejercicio4
    Definir i, mult2, mult3 Como Entero
    mult2=0
    mult3=0 
    para i=1 hasta 100 hacer 
        si i MOD 2 = 0 Entonces
            mult2= mult2 + 1 
        FinSi
        si i MOD 3 =0 Entonces
            mult3= mult3 + 1
        FinSi
    FinPara
    Escribir "los multiplos de 2 son: ", mult2 
    Escribir "los multiplos de 3 son: ", mult3
FinAlgoritmo