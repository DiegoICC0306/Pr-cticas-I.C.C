# Práctica 8 (Mini-Lab): La Clase Punto
**Introducción a las Ciencias de la Computación (Semestre 2027-1)**  
**Facultad de Ciencias, UNAM**

---

## Datos del alumno

> **Nota de privacidad:** Si publicas tu proyecto en un repositorio público de GitHub, **no es necesario que incluyas esta sección** en este archivo para proteger tu privacidad. Es suficiente con que tus datos completos estén registrados en la entrega directa de Google Classroom.

---

## Descripción de la práctica

Breve descripción de los ejercicios realizados.
> Para el ejercicio 1 declaramos los atributos de la clase, despúes hicimos los métodos getters, setters, y los constructores.
> Después, nos enfocamos en hacer los métodos para resolver:
1) Desplazamiento: Tomamos un valor en x y en y y se lo sumamos al original.
2) Distancia euclidiana: Primero evaluamos que no sea null, y después en dos variables nuevas guardamos la resta de los puntos, para al final sumar sus cuadrados y obtener la distancia.
3) Punto medio: Primero vimos que no fuera null, y después hicimos la operación para obtener xm y ym, para finalmente regresarlos como parametros de un objeto nuevo.
4) Cuadrante: Hicimos cuatro condiciones, las cuales determinaban en que cuadrante caia, y de estar en el orgien, o en x o en y, regresaba 0
5) Alineación: Primero evaluamos que los dos puntos recibidos no sean null, y despupes, usamos la fórmula del producto cruz, para despues ver si el resultado era menor a 10^-9, si lo era regresa true, si no, false.
6) toString = Hicimos uso del método toString para representar el objeto como una cadena de texto.
7) equals = Hicimos uso del método para ver si dos puntos eran iguales. Primero vimos que no fuera nulo, o que si fuera un punto y no otro objeto, y después, declarando la tolerancia, comparamos las x y y, y si eran menores, regresaban true, si no, false.
---

## Comandos para compilar, ejecutar y documentar

Ejecuta los siguientes comandos desde la terminal ubicado en la raíz de esta carpeta:

### 1. Compilación
```bash
<~javac -d bin src/*.java> 
```

### 2. Ejecución de la verificación
```bash
<~java -cp bin PruebaPunto> 
```

### 3. Generación de documentación Javadoc
```bash
<javadoc -encoding UTF-8 -charset UTF-8 -author -version -private -d docs src/Punto.java> 
```

---

## Evidencia de ejecución

Copia y pega aquí el resumen final que mostró tu terminal al ejecutar `PruebaPunto`:

```================================================================================
  ICC 2027-1 | VERIFICACION AUTOMATIZADA: CLASE PUNTO (MINI-LAB 8)
================================================================================

>>> 1. PROBANDO CONSTRUCTORES Y GETTERS:
  [OK] Constructor por omision inicializa en (0.0, 0.0)
  [OK] Constructor con parametros inicializa en (3.0, 4.0)

>>> 2. PROBANDO SETTERS:
  [OK] Setters modifican correctamente las coordenadas

>>> 3. PROBANDO METODO DESPLAZAR:
  [OK] desplazar(1.5, -1.0) actualiza a (3.5, 2.0)

>>> 4. PROBANDO DISTANCIA EUCLIDIANA:
  [OK] Distancia de (0.0, 0.0) a (3.0, 4.0) es 5.0
  [OK] Distancia de (1.0, 2.0) a (4.0, 6.0) es 5.0
  [OK] Distancia con referencia null regresa -1.0

>>> 5. PROBANDO PUNTO MEDIO (OBJETO RETORNADO):
  [OK] Punto medio entre (1.0, 2.0) y (4.0, 6.0) es (2.5, 4.0)
  [OK] Punto medio con null regresa null

>>> 6. PROBANDO DETERMINACION DE CUADRANTES:
  [OK] Cuadrante de (5.0, 8.0) es I
  [OK] Cuadrante de (-3.0, 4.0) es II
  [OK] Cuadrante de (-2.0, -7.0) es III
  [OK] Cuadrante de (6.0, -1.0) es IV
  [OK] Cuadrante de (0.0, 5.0) en eje es 0
  [OK] Cuadrante del origen (0.0, 0.0) es 0

>>> 7. PROBANDO METODO toString():
  [OK] toString() de (3.0, 4.0) devuelve "(3.0, 4.0)"

>>> 8. PROBANDO METODO EQUALS (IDENTIDAD VS CONTENIDO):
  [OK] p1.equals(new Punto(3.0, 4.0)) retorna true
  [OK] p1.equals(new Punto(3.0, 4.1)) retorna false
  [OK] p1.equals(null) retorna false de forma segura

>>> 9. PROBANDO COLINEALIDAD (RETO: TRES PUNTOS EN UNA RECTA):
  [OK] (1,1), (2,2) y (5,5) estan alineados
  [OK] (1,1), (2,2) y (5,6) NO estan alineados

================================================================================
  RESUMEN DE PRUEBAS: 21 / 21 pruebas superadas con exito.
  ¡FELICIDADES! Todos los metodos de la clase Punto funcionan correctamente.
================================================================================
```

---

## Preguntas de reflexión (1.0 punto)

1. **¿Por qué el método `puntoMedio` crea y regresa un nuevo objeto `Punto`, mientras que `desplazar` modifica al mismo objeto que recibe el mensaje?**
   > [Porque punto medio nos da las coordenadas de un punto nuevo que esta en medio de otros dos, mientras que el desplazamiento lo que hace es mover las coordenadas del punto que ya teníamos, no hacer uno nuevo.]

2. **Al ejecutar `p1.distancia(p2)`, ¿a qué objeto en memoria hace referencia `this` y cómo accede el método a las coordenadas de `p2`?**
   > [this hace referencia a los atributos del objeto actual, y el método accede a las coordenadas llamando a p2, y luego al método get X()]

3. **Observa el archivo `PruebaPunto.java`: ¿por qué los atributos `pruebasExitosas`, `totalPruebas` y el método `verificar` están declarados como `static`? ¿Qué ocurriría si les quitáramos la palabra `static` y los llamáramos desde `main`? Menciona además dos métodos estáticos de las bibliotecas estándar de Java que utilizaste en `Punto.java`.**
   > [Son estáticos para poder analizar cualquier prueba, y no solo una en específico. Dos métodos que use fueron Math.abs y Math.sqrt]
