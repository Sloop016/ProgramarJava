///Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
///una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
///mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
///clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
///correctamente.
Algoritmo ejercicio1
	Definir palabra Como caracter
	Definir i,suma Como entero 
	i=1
	Repetir
		Escribir "ingrese una palabra"
		leer palabra
		i= i+1
	Mientras Que i<=3 y palabra <> "eureka"
	si palabra = "eureka" Entonces
	Escribir "ha ingresado la palabra correcta"	
	sino
	Escribir "usted agoto los intentos"
	FinSi
	
	
FinAlgoritmo
