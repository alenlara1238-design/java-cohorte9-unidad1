# Fundamentos de programación en Java

## Base teórica y ejemplos prácticos

**Propósito:** comprender los elementos esenciales de Java para escribir
programas que reciban datos, realicen operaciones, tomen decisiones,
repitan instrucciones y organicen la lógica en métodos y colecciones.

> Los ejemplos están pensados para ejecutarse en una clase Java. Salvo
> que se indique lo contrario, cada fragmento debe ubicarse dentro del
> método `main` de una clase.

------------------------------------------------------------------------

## 1. Variables y declaración en Java

Una **variable** es un espacio identificado por un nombre en el que un
programa almacena un dato. Su valor puede cambiar durante la ejecución.

Para declarar una variable se escribe el tipo de dato y luego su nombre:

``` java
int edad;
```

También es posible declararla e inicializarla en una sola instrucción:

``` java
int edad = 25;
String nombre = "Laura";
```

La estructura general es:

``` java
tipo nombreVariable = valor;
```

Reglas y recomendaciones:

-   El nombre debe comenzar con una letra, `_` o `$`; no puede comenzar
    con un número.
-   No puede contener espacios.
-   Java distingue entre mayúsculas y minúsculas: `edad` y `Edad` son
    nombres diferentes.
-   Se recomienda usar nombres descriptivos y la convención `camelCase`,
    por ejemplo `cantidadProductos`.

Ejemplo:

``` java
int cantidad = 5;
cantidad = 8;

System.out.println(cantidad); // 8
```

La segunda asignación reemplaza el valor anterior.

## 2. Tipos de datos primitivos

Java dispone de ocho tipos primitivos. Cada uno representa una clase de
valor y tiene un rango o precisión determinados.

  Tipo        Uso habitual                     Ejemplo
  ----------- -------------------------------- ------------------------------
  `byte`      Enteros pequeños                 `byte nivel = 10;`
  `short`     Enteros de rango corto           `short anio = 2026;`
  `int`       Números enteros de uso general   `int cantidad = 150;`
  `long`      Enteros de rango amplio          `long poblacion = 8000000L;`
  `float`     Decimales de precisión simple    `float precio = 19.5f;`
  `double`    Decimales de precisión doble     `double promedio = 4.75;`
  `char`      Un carácter Unicode              `char inicial = 'A';`
  `boolean`   Valores verdadero o falso        `boolean activo = true;`

Aspectos importantes:

-   Los enteros se escriben sin comillas.
-   Los literales `long` suelen llevar el sufijo `L`.
-   Los literales `float` deben llevar el sufijo `f` o `F`.
-   Un `char` utiliza comillas simples; un `String`, comillas dobles.
-   `boolean` solo admite `true` o `false`.

Ejemplo:

``` java
int unidades = 12;
double precioUnitario = 8.50;
boolean disponible = true;
char categoria = 'B';

System.out.println(unidades);
System.out.println(precioUnitario);
System.out.println(disponible);
System.out.println(categoria);
```

## 3. Strings y manejo inicial

`String` representa una secuencia de caracteres, es decir, texto. No es
un tipo primitivo: es una clase de Java.

``` java
String nombre = "Mariana";
String ciudad = "Cartagena";
```

Operaciones iniciales frecuentes:

  ----------------------------------------------------------------------------
  Operación               Ejemplo                      Resultado
  ----------------------- ---------------------------- -----------------------
  Obtener longitud        `nombre.length()`            Cantidad de caracteres

  Convertir a mayúsculas  `nombre.toUpperCase()`       `"MARIANA"`

  Convertir a minúsculas  `nombre.toLowerCase()`       `"mariana"`

  Quitar espacios al      `texto.trim()`               Texto sin esos espacios
  inicio y final                                       

  Obtener un carácter     `nombre.charAt(0)`           `'M'`

  Comparar contenido      `nombre.equals("Mariana")`   `true` si coincide
  ----------------------------------------------------------------------------

Ejemplo:

``` java
String nombre = "  Mariana  ";

System.out.println(nombre.trim());
System.out.println(nombre.trim().toUpperCase());
System.out.println(nombre.length());
```

**Comparar Strings:** para comparar el contenido se utiliza `equals()` o
`equalsIgnoreCase()`. No se debe utilizar `==` como comparación habitual
de textos, porque compara referencias y no garantiza comparar el
contenido.

``` java
String clave = "Java";

System.out.println(clave.equals("Java"));           // true
System.out.println(clave.equalsIgnoreCase("JAVA")); // true
```

**Concatenación:** el operador `+` permite unir textos y otros valores.

``` java
String nombre = "Mariana";
int edad = 22;

System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
```

## 4. Constantes mediante `final`

Una constante es una variable cuyo valor no puede reasignarse después de
su inicialización. En Java se utiliza la palabra reservada `final`.

``` java
final double IVA = 0.19;
final int MAX_INTENTOS = 3;
```

Si se intenta cambiar su valor, el compilador genera un error:

``` java
final int MAX_INTENTOS = 3;
// MAX_INTENTOS = 5; // Error: no se puede reasignar una variable final
```

Por convención, los nombres de constantes se escriben en mayúsculas y se
separan palabras con guion bajo.

Ejemplo:

``` java
double precio = 100000;
final double IVA = 0.19;

double impuesto = precio * IVA;
double total = precio + impuesto;

System.out.println(total);
```

## 5. Entrada de datos con `Scanner`

La clase `Scanner`, del paquete `java.util`, permite leer datos que
introduce el usuario, por ejemplo desde el teclado.

Primero se importa la clase y luego se crea un objeto `Scanner` asociado
a `System.in`:

``` java
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        entrada.close();
    }
}
```

Métodos de lectura comunes:

  Método            Dato leído
  ----------------- -----------------------------------------
  `nextInt()`       Entero (`int`)
  `nextLong()`      Entero largo (`long`)
  `nextDouble()`    Decimal (`double`)
  `nextFloat()`     Decimal (`float`)
  `nextBoolean()`   Booleano
  `next()`          Una palabra, hasta el siguiente espacio
  `nextLine()`      Una línea completa de texto

**Atención con `nextInt()` y `nextLine()`:** los métodos que leen
números no consumen el salto de línea final. Si después se necesita leer
una línea completa, puede ser necesario consumir ese salto con otro
`nextLine()`.

``` java
System.out.print("Edad: ");
int edad = entrada.nextInt();
entrada.nextLine(); // Consume el salto de línea pendiente

System.out.print("Nombre completo: ");
String nombre = entrada.nextLine();
```

En programas sencillos se suele cerrar el `Scanner` al terminar de
utilizarlo.

## 6. Operadores aritméticos

Los operadores aritméticos permiten realizar cálculos.

  Operador   Operación          Ejemplo
  ---------- ------------------ ----------------
  `+`        Suma               `8 + 2` → `10`
  `-`        Resta              `8 - 2` → `6`
  `*`        Multiplicación     `8 * 2` → `16`
  `/`        División           `8 / 2` → `4`
  `%`        Residuo o módulo   `9 % 2` → `1`

Ejemplo:

``` java
int numero1 = 17;
int numero2 = 5;

System.out.println(numero1 + numero2); // 22
System.out.println(numero1 - numero2); // 12
System.out.println(numero1 * numero2); // 85
System.out.println(numero1 / numero2); // 3
System.out.println(numero1 % numero2); // 2
```

**División entre enteros:** cuando ambos operandos son enteros, Java
realiza división entera y descarta la parte decimal. Para obtener un
resultado decimal, al menos uno de los operandos debe ser decimal o
convertirse a decimal.

``` java
int a = 17;
int b = 5;

System.out.println(a / b);           // 3
System.out.println((double) a / b);  // 3.4
```

También existen operadores de incremento y decremento:

``` java
int contador = 4;
contador++; // equivale a sumar 1
contador--; // equivale a restar 1
```

## 7. Operadores relacionales

Los operadores relacionales comparan dos valores y producen un resultado
booleano: `true` o `false`.

  Operador   Significado         Ejemplo
  ---------- ------------------- --------------
  `==`       Igual a             `edad == 18`
  `!=`       Diferente de        `edad != 18`
  `>`        Mayor que           `edad > 18`
  `<`        Menor que           `edad < 18`
  `>=`       Mayor o igual que   `edad >= 18`
  `<=`       Menor o igual que   `edad <= 18`

Ejemplo:

``` java
int edad = 20;

System.out.println(edad >= 18); // true
System.out.println(edad < 18);  // false
System.out.println(edad == 20); // true
```

Estos operadores se utilizan con frecuencia en las condiciones de los
condicionales y ciclos.

## 8. Operadores lógicos

Los operadores lógicos permiten combinar o negar expresiones booleanas.

  Operador   Nombre     Resultado general
  ---------- ---------- ---------------------------------------------------
  `&&`       AND (Y)    `true` cuando ambas condiciones son verdaderas
  `||`       OR (O)     `true` cuando al menos una condición es verdadera
  `!`        NOT (NO)   Invierte el valor lógico

Ejemplo con AND:

``` java
int edad = 25;
boolean tieneDocumento = true;

boolean puedeIngresar = edad >= 18 && tieneDocumento;
System.out.println(puedeIngresar); // true
```

Ejemplo con OR:

``` java
boolean esEstudiante = false;
boolean esDocente = true;

System.out.println(esEstudiante || esDocente); // true
```

Ejemplo con NOT:

``` java
boolean activo = false;

System.out.println(!activo); // true
```

**Cortocircuito:** `&&` deja de evaluar cuando encuentra una condición
falsa; `||` deja de evaluar cuando encuentra una condición verdadera.
Esto es útil cuando la segunda expresión depende de que la primera se
cumpla.

## 9. Conversión de tipos de datos

La conversión de tipos consiste en transformar un valor de un tipo de
dato a otro.

### Conversión automática (ampliación)

Java puede convertir automáticamente algunos tipos numéricos a otros con
mayor capacidad para representar valores.

``` java
int cantidad = 10;
double resultado = cantidad;

System.out.println(resultado); // 10.0
```

### Conversión explícita (casting)

Cuando se convierte un tipo de mayor capacidad a otro de menor
capacidad, se debe indicar explícitamente la conversión. Puede perderse
información.

``` java
double precio = 25.90;
int precioEntero = (int) precio;

System.out.println(precioEntero); // 25
```

El casting anterior elimina la parte decimal; no realiza un redondeo.

### Conversión entre texto y números

Para convertir un `String` a un número se pueden utilizar métodos de las
clases envoltorio:

``` java
String textoEdad = "28";
int edad = Integer.parseInt(textoEdad);

String textoPrecio = "49.90";
double precio = Double.parseDouble(textoPrecio);
```

Para convertir un número a texto:

``` java
int cantidad = 15;
String texto = String.valueOf(cantidad);
```

Si el texto no representa un número válido, métodos como `parseInt()`
pueden lanzar `NumberFormatException`.

## 10. Condicionales `if`, `else if`, `else` y `switch`

Los condicionales permiten ejecutar instrucciones según el resultado de
una condición.

### `if`

Ejecuta un bloque cuando la condición es verdadera.

``` java
int edad = 20;

if (edad >= 18) {
    System.out.println("Es mayor de edad");
}
```

### `if` y `else`

Permite elegir entre dos caminos.

``` java
int edad = 16;

if (edad >= 18) {
    System.out.println("Puede ingresar");
} else {
    System.out.println("No puede ingresar");
}
```

### `else if`

Permite evaluar varias condiciones en orden. Se ejecuta el primer bloque
cuya condición sea verdadera.

``` java
double nota = 4.2;

if (nota >= 4.5) {
    System.out.println("Desempeño superior");
} else if (nota >= 3.5) {
    System.out.println("Desempeño alto");
} else if (nota >= 3.0) {
    System.out.println("Desempeño básico");
} else {
    System.out.println("Debe mejorar");
}
```

El orden de las condiciones importa: conviene evaluar primero los rangos
más altos cuando se trabaja con intervalos.

### `switch`

Se utiliza para seleccionar una alternativa según el valor de una
expresión. Es apropiado, por ejemplo, para menús u opciones concretas.

``` java
int opcion = 2;

switch (opcion) {
    case 1:
        System.out.println("Consultar");
        break;
    case 2:
        System.out.println("Registrar");
        break;
    case 3:
        System.out.println("Salir");
        break;
    default:
        System.out.println("Opción no válida");
}
```

En la forma tradicional, `break` evita que la ejecución continúe hacia
los siguientes casos. `default` se ejecuta cuando ningún caso coincide.

## 11. Ciclos `for`, `while` y `do-while`

Los ciclos permiten repetir instrucciones. Se diferencian principalmente
por la forma en que controlan la repetición.

### Ciclo `for`

Es útil cuando se conoce o se controla mediante un contador la cantidad
de repeticiones.

``` java
for (int i = 1; i <= 5; i++) {
    System.out.println("Repetición " + i);
}
```

Su estructura incluye:

1.  Inicialización: `int i = 1`.
2.  Condición: `i <= 5`.
3.  Actualización: `i++`.

### Ciclo `while`

Evalúa la condición antes de ejecutar el bloque. Puede ejecutarse cero o
más veces.

``` java
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}
```

Es importante actualizar la variable de control cuando corresponda para
evitar un ciclo infinito.

### Ciclo `do-while`

Ejecuta primero el bloque y después evalúa la condición. Por eso se
ejecuta al menos una vez.

``` java
int numero = 1;

do {
    System.out.println(numero);
    numero++;
} while (numero <= 5);
```

La condición del `do-while` termina con punto y coma.

### Comparación

  -----------------------------------------------------------------------
  Ciclo                   ¿Cuándo evalúa la       Uso frecuente
                          condición?              
  ----------------------- ----------------------- -----------------------
  `for`                   Antes de cada           Repeticiones
                          repetición              controladas por
                                                  contador

  `while`                 Antes de cada           Repetir mientras se
                          repetición              cumpla una condición

  `do-while`              Después de cada         Menús o procesos que
                          repetición              deben ejecutarse al
                                                  menos una vez
  -----------------------------------------------------------------------

## 12. Métodos con parámetros

Un método es un bloque de código con nombre que realiza una tarea. Los
**parámetros** permiten recibir información para trabajar con ella.

Ejemplo:

``` java
public static void saludar(String nombre) {
    System.out.println("Hola, " + nombre);
}
```

En este ejemplo, `nombre` es un parámetro. Para ejecutar el método se
realiza una llamada y se proporciona un argumento:

``` java
saludar("Camila");
```

Un método puede recibir varios parámetros:

``` java
public static void mostrarDatos(String nombre, int edad) {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
}
```

Llamada:

``` java
mostrarDatos("Camila", 24);
```

Los argumentos deben corresponder con la cantidad, el orden y los tipos
de los parámetros definidos.

## 13. Métodos con valores de retorno

Un método también puede procesar información y devolver un resultado
mediante `return`.

``` java
public static int sumar(int a, int b) {
    int resultado = a + b;
    return resultado;
}
```

La llamada puede almacenar el valor devuelto:

``` java
int total = sumar(8, 5);
System.out.println(total); // 13
```

El tipo declarado antes del nombre del método (`int`, en este caso)
indica el tipo de valor que devuelve.

Cuando un método no devuelve un valor se utiliza `void`:

``` java
public static void mostrarMensaje() {
    System.out.println("Proceso terminado");
}
```

Ejemplo con `double`:

``` java
public static double calcularPromedio(double nota1, double nota2) {
    return (nota1 + nota2) / 2;
}
```

Un método que declara un tipo de retorno debe devolver un valor
compatible en todos los caminos de ejecución posibles.

## 14. Scope o alcance de las variables

El **scope** es la región del código en la que una variable puede
utilizarse.

### Variable local

Se declara dentro de un método o bloque y solo puede utilizarse desde
ese ámbito.

``` java
public static void mostrarEdad() {
    int edad = 30;
    System.out.println(edad);
}
```

La variable `edad` no puede utilizarse directamente desde otro método.

### Variable de bloque

Una variable declarada dentro de un bloque, por ejemplo dentro de un
`if` o un ciclo, está limitada a ese bloque.

``` java
if (true) {
    int cantidad = 10;
    System.out.println(cantidad);
}

// System.out.println(cantidad); // No está disponible aquí
```

### Variable de instancia y variable estática

En una clase también pueden declararse atributos fuera de los métodos:

``` java
public class Persona {
    String nombre; // Variable de instancia: pertenece a cada objeto
    static int cantidadPersonas = 0; // Variable estática: pertenece a la clase
}
```

Por ahora, la idea principal es identificar dónde se declara una
variable y desde qué partes del programa puede utilizarse.

## 15. Reutilización de lógica

Reutilizar lógica significa escribir una tarea una sola vez y ejecutarla
desde distintos lugares del programa. Los métodos ayudan a evitar
instrucciones duplicadas y facilitan el mantenimiento.

Sin reutilización, podríamos repetir el mismo cálculo:

``` java
double total1 = 100000 + (100000 * 0.19);
double total2 = 250000 + (250000 * 0.19);
```

Con un método:

``` java
public static double calcularTotalConIva(double precio) {
    final double IVA = 0.19;
    return precio + (precio * IVA);
}
```

Se reutiliza así:

``` java
double total1 = calcularTotalConIva(100000);
double total2 = calcularTotalConIva(250000);

System.out.println(total1);
System.out.println(total2);
```

Ventajas:

-   Evita duplicar instrucciones.
-   Reduce errores cuando una regla debe cambiar.
-   Hace que el código sea más fácil de leer.
-   Permite dividir un problema grande en tareas pequeñas.

Una buena práctica es que cada método tenga una responsabilidad clara y
un nombre que describa lo que hace.

## 16. Introducción a arrays y `ArrayList`

Cuando se necesita almacenar varios valores relacionados, se pueden
utilizar estructuras de datos como los arrays y las listas dinámicas.

### Arrays

Un array almacena varios elementos del mismo tipo. Su tamaño se define
al crearlo y no cambia durante su existencia.

Declaración e inicialización:

``` java
int[] notas = {4, 5, 3, 4};
```

También se puede crear indicando el tamaño:

``` java
int[] edades = new int[3];

edades[0] = 20;
edades[1] = 22;
edades[2] = 19;
```

Los índices comienzan en cero. En un array de tres posiciones, los
índices válidos son `0`, `1` y `2`.

Consultar elementos y longitud:

``` java
System.out.println(notas[0]);    // 4
System.out.println(notas.length); // 4
```

Recorrer un array con `for`:

``` java
for (int i = 0; i < notas.length; i++) {
    System.out.println(notas[i]);
}
```

También se puede utilizar el `for-each` cuando no se necesita trabajar
directamente con el índice:

``` java
for (int nota : notas) {
    System.out.println(nota);
}
```

Acceder a un índice fuera del rango produce
`ArrayIndexOutOfBoundsException`.

### `ArrayList`

`ArrayList` es una colección que permite almacenar una cantidad variable
de elementos. A diferencia de un array tradicional, puede crecer o
reducirse durante la ejecución.

Se encuentra en el paquete `java.util` y utiliza tipos de referencia
como parámetro genérico. Para almacenar números primitivos se utilizan
sus clases envoltorio, por ejemplo `Integer` para `int` y `Double` para
`double`.

``` java
import java.util.ArrayList;

public class ListaNotas {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(4);
        notas.add(5);
        notas.add(3);

        System.out.println(notas.get(0)); // 4
        System.out.println(notas.size()); // 3

        notas.set(1, 4); // Reemplaza el elemento de la posición 1
        notas.remove(0); // Elimina el elemento de la posición 0

        System.out.println(notas);
    }
}
```

Operaciones frecuentes:

  Método                 Función
  ---------------------- -------------------------------------
  `add(valor)`           Agrega un elemento
  `get(indice)`          Consulta un elemento
  `set(indice, valor)`   Reemplaza un elemento
  `remove(indice)`       Elimina el elemento de una posición
  `size()`               Devuelve la cantidad de elementos
  `isEmpty()`            Indica si la lista está vacía
  `contains(valor)`      Comprueba si contiene un valor

Recorrer un `ArrayList`:

``` java
for (int i = 0; i < notas.size(); i++) {
    System.out.println(notas.get(i));
}
```

O mediante `for-each`:

``` java
for (int nota : notas) {
    System.out.println(nota);
}
```

### Array o `ArrayList`: ¿cuál utilizar?

  Característica                  Array              `ArrayList`
  ------------------------------- ------------------ ---------------------------
  Tamaño                          Fijo               Dinámico
  Acceso por índice               Sí                 Sí
  Longitud o cantidad             `length`           `size()`
  Agregar elementos               No tiene `add()`   `add()`
  Tipos primitivos directamente   Sí                 No; usa clases envoltorio

------------------------------------------------------------------------

## Ejemplo integrador: registro y cálculo de notas

El siguiente programa reúne variables, constantes, entrada de datos,
operaciones, condicionales, ciclos, métodos y un `ArrayList`.

``` java
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroNotas {

    public static double calcularPromedio(ArrayList<Double> notas) {
        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.size();
    }

    public static void mostrarResultado(double promedio) {
        if (promedio >= 3.0) {
            System.out.println("Resultado: aprobado");
        } else {
            System.out.println("Resultado: debe mejorar");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        final int CANTIDAD_NOTAS = 3;

        for (int i = 1; i <= CANTIDAD_NOTAS; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = entrada.nextDouble();
            notas.add(nota);
        }

        double promedio = calcularPromedio(notas);

        System.out.println("Promedio: " + promedio);
        mostrarResultado(promedio);

        entrada.close();
    }
}
```

**¿Qué conceptos aparecen?**

-   `ArrayList<Double>` almacena las notas.
-   `final` define la cantidad de notas que se solicitarán.
-   `Scanner` recibe los datos del usuario.
-   `for` repite la solicitud.
-   `add()` incorpora cada nota a la lista.
-   `calcularPromedio()` recibe una lista y devuelve un `double`.
-   `mostrarResultado()` recibe un valor y toma una decisión con
    `if/else`.
-   Las variables locales se utilizan dentro de sus respectivos métodos.

**Consideración:** este ejemplo supone que el usuario ingresa valores
numéricos válidos y que las tres notas están disponibles. La validación
de entradas y el manejo de excepciones pueden incorporarse en una etapa
posterior.

------------------------------------------------------------------------

## Recomendaciones generales

1.  Utilizar nombres descriptivos para variables y métodos.
2.  Mantener una indentación consistente.
3.  Inicializar las variables antes de utilizarlas.
4.  Comparar textos con `equals()` y no con `==`.
5.  Verificar las condiciones de los ciclos para evitar repeticiones
    infinitas.
6.  Dividir los problemas en métodos pequeños con responsabilidades
    claras.
7.  Elegir arrays cuando el tamaño sea fijo y `ArrayList` cuando se
    necesite una colección dinámica.
8.  Probar los programas con diferentes valores, incluidos los límites
    de las condiciones.

## Glosario breve

  -----------------------------------------------------------------------
  Concepto                            Definición
  ----------------------------------- -----------------------------------
  Variable                            Espacio identificado que almacena
                                      un valor modificable

  Tipo de dato                        Define qué clase de valor puede
                                      almacenarse

  Constante                           Variable cuyo valor no puede
                                      reasignarse

  Operador                            Símbolo que permite realizar una
                                      operación

  Condicional                         Estructura que selecciona
                                      instrucciones según una condición

  Ciclo                               Estructura que repite instrucciones

  Método                              Bloque de código con nombre que
                                      realiza una tarea

  Parámetro                           Variable declarada en la definición
                                      de un método para recibir datos

  Argumento                           Valor que se envía al llamar un
                                      método

  Retorno                             Valor que un método entrega
                                      mediante `return`

  Scope                               Alcance o región donde una variable
                                      está disponible

  Array                               Estructura de tamaño fijo que
                                      almacena elementos del mismo tipo

  `ArrayList`                         Colección dinámica que permite
                                      agregar y eliminar elementos
  -----------------------------------------------------------------------
