# Cuestionario de Java

Aplicación de consola que presenta un cuestionario de preguntas tipo test sobre Java, valida la entrada del usuario y comprueba las respuestas.

## Índice

1. [Descripción](#descripción)
2. [Requisitos](#requisitos)
3. [Diseño](#diseño)
   - [Pseudocódigo](#pseudocódigo)
4. [Estructura del proyecto](#estructuradelproyecto)
5. [Cómo ejecutar](cómoejecutar) 
---

## Descripción

El programa muestra preguntas sobre el lenguaje Java, cada una con **cuatro opciones de respuesta** (a, b, c, d). El usuario elige una opción, el programa valida que la entrada sea correcta y le indica si ha acertado o no.

## Requisitos

### Funcionales

- [ ] Cuestionario con preguntas de **4 respuestas** posibles.
- [ ] **Banco de preguntas** con un mínimo de **50 preguntas**.
- [ ] Todas las preguntas tratan sobre **Java**.
- [ ] **Verificar** si la respuesta elegida es la correcta.
- [ ] **Validar la entrada** del usuario (solo se aceptan `a`, `b`, `c` o `d`).

### No funcionales

- Interfaz de consola clara y fácil de usar.
- Mensajes de error comprensibles ante entradas inválidas.
- Código organizado y fácil de ampliar con nuevas preguntas.

## Diseño


### Pseudocódigo

Ejemplo con una pregunta (la validación se repite hasta que la entrada sea correcta):

```text
Escribir("Indica cuál de las siguientes opciones no es un tipo primitivo de Java:")
Escribir("a. int")
Escribir("b. char")
Escribir("c. boolean")
Escribir("d. String")

Mientras (Respuesta no sea a, b, c o d)
    Leer(Respuesta)
    Si (Respuesta no es a, b, c ni d)
        Escribir("Respuesta no válida. Escribe a, b, c o d.")
    Fin Si
Fin Mientras

Si (Respuesta = "d")
    Escribir("¡La respuesta es correcta!")
Sino
    Escribir("La respuesta es incorrecta.")
Fin Si
```



## Estructura del proyecto

```text
proyecto/
├── src/
│   └── Main.java
├── README.md
```


## Cómo ejecutar

```bash
javac src/Main.java
java -cp src Main
```

