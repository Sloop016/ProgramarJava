Algoritmo sin_titulo
	Definir nota1,nota2,nota3,nota4 Como Real
	Definir condicion Como Logico
	Escribir "valor de la nota 1"
	leer nota1
	Escribir "valor de la nota 2"
	leer nota2
	Escribir "valor de la nota 3"
	leer nota3
	Escribir "valor de la nota 4"
	leer nota4
	si (nota1>nota2) y (nota2>nota3) y (nota3>nota4) y (nota4>nota1) Entonces
		
		Escribir " la nota 4 fue eliminada, el promedio es: " (nota1+nota2+nota3)/3
	SiNo
		si (nota2>nota3) y (nota1>nota2) o (nota3>nota4) y (nota4>nota1) Entonces
			Escribir " la nota 3 fue eliminada, el promedio es: " (nota1+nota2+nota4)/3
		SiNo
			si (nota1>nota2) o (nota2>nota3) y (nota3>nota4) y (nota4>nota1) entonces
				Escribir " la nota 2 fue eliminada, el promedio es: " (nota1+nota4+nota3)/3
			sino 
				escribir	"la nota 1 fue eliminada, el promedio es: " (nota2+nota3+nota4)/3
				finsi 
			finsi
		FinSi
FinAlgoritmo
