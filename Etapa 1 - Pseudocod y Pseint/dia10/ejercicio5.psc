Algoritmo ejercicio5
    Definir i, mPar, mImp Como Entero
    mPar=0
    mImp=0 
    para i=1 hasta 100 hacer 
        si i MOD 2 = 0 Entonces
            mPar= mPar + 1 
        FinSi
        si i MOD 3 =0 Entonces
            mImp= mImp + 1
        FinSi
    FinPara
    Escribir "los multiplos de 2 son: ", mPar 
    Escribir "los multiplos de 3 son: ", mImp
FinAlgoritmo