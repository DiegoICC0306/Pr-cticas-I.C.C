# Práctica 10 (Mini-Lab): Arreglos de Tipos Primitivos (`EstacionMeteorologica`)
**Introducción a las Ciencias de la Computación (Semestre 2027-1)**  
**Facultad de Ciencias, UNAM**

---

## Datos del alumno

> **Nota de privacidad:** Si publicas tu proyecto en un repositorio público de GitHub, **no es necesario que incluyas esta sección** en este archivo para proteger tu privacidad. Es suficiente con que tus datos completos estén registrados en la entrega directa de Google Classroom.

- **Nombre completo:** Diego Emiliano Sánchez Chávez / Luis Angel Lopez Perez


---

## Descripción de la práctica

Breve descripción de los ejercicios realizados.
>  Realizamos un programa que simula una estación meteorológica, en donde, haciendo uso de los arreglos de Java, hicimos las temperaturas de una semana, y luego usando los métodos implementados por nosotros, hicimos varos calculos con dichos datos, como conversión de datos, ver los días helados, etc.

---

## Comandos para compilar, ejecutar y documentar

Ejecuta los siguientes comandos desde la terminal ubicado en la raíz de esta carpeta:

### 1. Compilación
```bash
~javac -d bin src /*. java
```

### 2. Ejecución de las pruebas
```bash
~java -cp bin PruebaEstacionMeteorologica
```

### 3. Generación de documentación Javadoc
```bash
~javadoc -d doc -author -version src /*. java
```

---

## Evidencia de ejecución

Copia y pega aquí el resumen final de pruebas y la salida de tu prueba personalizada al ejecutar `PruebaEstacionMeteorologica`:

```text
================================================================================
  ICC 2027-1 | VERIFICACION AUTOMATIZADA: ESTACION METEOROLOGICA (MINI-LAB 10)
================================================================================
14.8
>>> 1. PROBANDO CONSTRUCTORES, INICIALIZACION Y ACCESO SEGURO:S D:\Documentos (SSD 2)\ICC\practica10> 
  [OK] Constructor por omision asigna "Estacion UNAM" y 7 dias
  [OK] Constructor por omision inicializa las casillas en -300.0 (sin lectura)
  [OK] Constructor con parametros valida nombre null y numDias <= 0 (usa 7)
  [OK] registrarTemperatura guarda valor valido en [0] y mantiene sin captura [5] en -300.0
  [OK] registrarTemperatura rechaza indices fuera de rango (-1 y 10)
  [OK] registrarTemperatura rechaza lecturas fuera de [-90.0, 60.0]
  [OK] obtenerTemperatura devuelve -300.0 en indices fuera de rango (-1 y 10)

>>> 2. PROBANDO ESTADISTICAS BASICAS Y toString():
  [OK] obtenerTemperatura(3) coincide con el ejemplo de la tabla (23.0)
  [OK] calcularPromedio de {18.5, 21.0, 19.5, 23.0, 17.0} es 19.8
  [OK] obtenerMaxima de {18.5, 21.0, 19.5, 23.0, 17.0} es 23.0
  [OK] obtenerMaxima funciona cuando TODAS las lecturas son negativas (-3.2)
  [OK] contarDiasCalurosos(> 20.0) en CU-UNAM devuelve 2
  [OK] contarDiasCalurosos(> 30.0) devuelve 0 cuando ninguno supera el umbral
  [OK] toString() devuelve el resumen estadistico exacto

>>> 3. PROBANDO CONVERSION A FAHRENHEIT Y ESCALAS:
  [OK] convertirAFahrenheit(0.0) devuelve 32.0 y convertirAFahrenheit(20.0) devuelve 68.0
  [OK] calcularPromedio(Escala.CELSIUS) devuelve 19.8
  [OK] calcularPromedio(Escala.FAHRENHEIT) devuelve 67.64

>>> 4. PROBANDO RETOS (HELADA Y VARIACION CONSECUTIVA):
  [OK] buscarPrimerDiaHelada en {12.0, 4.5, 0.0, -2.5, 3.0} devuelve indice 2
  [OK] buscarPrimerDiaHelada devuelve -1 si no hubo temperaturas <= 0.0
  [OK] mayorCambioConsecutivo en {18.0, 20.0, 11.5, 15.0, 22.0} es 8.5
  [OK] mayorCambioConsecutivo detecta el mayor cambio en el ultimo par (13.0)
  [OK] mayorCambioConsecutivo con 1 solo dia devuelve 0.0 sin excepcion

================================================================================
  RESUMEN DE PRUEBAS: 22 / 22 pruebas superadas con exito.
================================================================================

>>> 5. PRUEBA PERSONALIZADA:
Estacion: Sanchez | Dias: 5 | Promedio: 14.8 C | Maxima: 30.0 C
Promedio en CELSIUS: 14.8
Promedio en FAHRENHEIT: 58.64
```

---

## Preguntas de reflexión (1.0 punto)

1. **En la Parte 3.2 definiste el método `convertirAFahrenheit(double celsius)`. ¿Lo implementaste como método de instancia o como método de clase (`static`)? Justifica tu decisión de diseño explicando qué ventajas o implicaciones tiene la opción que elegiste.**
   > Como un método static, ya que así, si lo queremos usar, no es necesario crear un objeto nuevo.

2. **En el método `obtenerMaxima()`, ¿por qué es incorrecto inicializar la variable auxiliar del máximo en `0.0`? Explica qué problema concreto ocurre en estaciones donde todas las temperaturas son negativas y cómo lo resolviste.**
   > Porque estamos revisando por posiciones del arreglo, entonces conviene mejor inicializarla en la posición 0, y de ahí, con el ciclo for, compararla con las demás posiciones para obtener la máxima. El problema se resuelve haciendo comparaciones con la variale auxiliar. El ciclo va recorriendo las posiciones del arreglo, y entonces, usando un if, se evalua si hay alguna mayor que la auxiliar.

3. **Sobre la Parte 4 (Retos) y el manejo de días sin lectura (`-300.0`): explica brevemente cómo diseñaste la lógica de alguno de los dos retos (o qué limitaciones tendría calcular el promedio de la Parte 2 si un usuario consulta el promedio cuando solo se han registrado algunos días del arreglo).**
   > Validando si temperaturas.length <2 para devolver 0.0 y evitar errores cuando hay un 
  >dia; luego se recorrio el arrgelo desde i = 0 para comparar cada par sin desbordar el indice final.
   >mientras que a -300.0 se limita calcular promedio  por si faltan dias por registrar. 
---

## Comentarios adicionales sobre tu experiencia

Agrega aquí cualquier observación pertinente sobre el desarrollo de la práctica (por ejemplo: qué partes te costaron más trabajo, en dónde te atoraste o si algún caso específico no lograste resolver).
> En general fue una práctica rápida, aunque pudo llegar a ser un poco confuso entender la función de los ciclos, pero despúes de repetirlos múltiples veces, la lógica detrás de ellos quedo más clara. Lo más difícil fue arreglar los errores, ya que como siguen siendo cosas nuevas, no entendemos al 100% que es lo que hace cada cosa.
