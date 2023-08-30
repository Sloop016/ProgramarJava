Funcion res <- login ( user, contra, i )
	definir res Como Logico
	si (user="usuario1" y contra="asdasd" y i >= 0) entonces
		res=verdadero
	sino
		res=falso
	finsi
Fin Funcion

Algoritmo ejercicio8_user_pw
    
	definir user, contra Como Caracter
	definir res como logico
	definir i, x como entero
    
	escribir "ingrese usuario"
	leer user
	escribir "ingrese contraseña" 
	leer contra
	i=2
	res=login(user, contra, i)
	
	mientras res=falso y i > 0 hacer
		escribir "Resultado Incorrecto, le queda " i " intento/s"
		Escribir "-----------------------------------------------"
		Escribir "Por favor ingrese su usuario"
		leer user
		Escribir "Ingrese su clave"
		leer contra
		i=i-1
		res=login(user, contra, i)
        
		si res=verdadero
			escribir "Ingreso Exitoso"
		sino
			escribir "Acceso Bloqueado"
		FinSi
	finmientras
FinAlgoritmo