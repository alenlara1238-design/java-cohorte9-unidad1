# Ejercicios guiados de Java: arreglos y construcción de clases

## Objetivo general

Fortalecer la capacidad de almacenar, organizar y modelar información en Java, mediante arreglos de tipos primitivos, arreglos de objetos y la construcción de clases que representen elementos de contextos cotidianos.

---

# Sección 1. Arreglos de tipos primitivos

## Ejercicio 1. Registro de puntuaciones en un videojuego

### Contexto

Un videojuego registra las puntuaciones obtenidas por un jugador en cinco partidas. Se necesita almacenar las puntuaciones, consultar los valores y calcular el promedio.

### Objetivos

- Crear un arreglo de tipo `int`.
- Almacenar valores en un arreglo.
- Recorrer un arreglo mediante un ciclo.
- Calcular el promedio de los elementos almacenados.

### Paso 1. Crear el arreglo

Crea un arreglo de tipo `int` que permita almacenar las puntuaciones de cinco partidas.

- El arreglo debe tener una capacidad de cinco elementos.
- Asigna inicialmente cinco puntuaciones diferentes.

### Paso 2. Recorrer el arreglo

Utiliza un ciclo `for` para recorrer el arreglo e imprimir cada una de las puntuaciones registradas.

### Paso 3. Calcular el promedio

- Crea una variable que permita acumular las puntuaciones.
- Recorre el arreglo y suma cada elemento.
- Calcula el promedio de las cinco partidas.
- Imprime el resultado.

### Paso 4. Analizar los resultados

Modifica las puntuaciones y verifica cómo cambia el promedio.

### Reto adicional

Determina cuál fue la puntuación más alta obtenida por el jugador.

---

## Ejercicio 2. Temperaturas de una semana

### Contexto

Una aplicación meteorológica necesita almacenar las temperaturas registradas durante siete días de la semana.

### Objetivos

- Crear un arreglo de tipo `double`.
- Almacenar datos numéricos decimales.
- Recorrer arreglos.
- Identificar valores máximos y mínimos.

### Paso 1. Crear el arreglo

Crea un arreglo de tipo `double` que permita almacenar siete temperaturas.

Asigna una temperatura diferente para cada posición del arreglo.

### Paso 2. Consultar las temperaturas

Utiliza un ciclo para imprimir las siete temperaturas registradas.

### Paso 3. Calcular la temperatura promedio

Calcula el promedio de las temperaturas registradas durante la semana.

### Paso 4. Identificar extremos

- Identifica la temperatura más alta.
- Identifica la temperatura más baja.

### Reto adicional

Diseña una lógica que permita identificar cuántos días tuvieron una temperatura superior al promedio semanal.

---

## Ejercicio 3. Inventario de energía de personajes

### Contexto

Un juego de aventura registra la energía disponible de cinco personajes. Cada personaje comienza con una cantidad de energía que puede variar durante el juego.

### Objetivos

- Crear arreglos de tipo `int`.
- Consultar y modificar posiciones.
- Recorrer arreglos.
- Aplicar condiciones sobre los elementos almacenados.

### Paso 1. Crear el arreglo

Crea un arreglo de tipo `int` que almacene la energía de cinco personajes.

Cada personaje debe tener una cantidad de energía entre 0 y 100.

### Paso 2. Mostrar la energía

Recorre el arreglo e imprime la energía disponible de cada personaje.

### Paso 3. Modificar la energía

- Selecciona una posición del arreglo.
- Modifica la energía del personaje ubicado en esa posición.
- Imprime nuevamente el arreglo para verificar el cambio.

### Paso 4. Identificar personajes

Utiliza una condición para identificar cuáles personajes tienen menos de 30 puntos de energía.

### Reto adicional

Diseña una lógica que permita identificar cuántos personajes tienen energía suficiente para continuar una misión, considerando que deben tener al menos 50 puntos.

---

# Sección 2. Arreglos de objetos a partir de clases

## Ejercicio 4. Biblioteca musical: arreglo de canciones

### Contexto

Una aplicación de música necesita almacenar información de varias canciones para mostrarlas en una lista de reproducción.

En lugar de almacenar únicamente nombres de canciones, se desea representar cada canción como un objeto.

### Objetivos

- Crear una clase.
- Definir atributos.
- Crear un constructor.
- Crear métodos getter.
- Instanciar objetos.
- Crear un arreglo de objetos.
- Recorrer un arreglo de objetos.

### Paso 1. Crear la clase `Cancion`

Crea un archivo llamado `Cancion.java`.

La clase debe representar una canción y tener los siguientes atributos:

| Atributo | Tipo de dato |
|---|---|
| titulo | String |
| artista | String |
| duracion | int |

El atributo `duracion` representa la duración de la canción en segundos.

### Paso 2. Crear el constructor

Define un constructor que permita inicializar los tres atributos al momento de crear una canción.

El constructor debe recibir:

- El título de la canción.
- El nombre del artista.
- La duración en segundos.

### Paso 3. Crear métodos getter

Implementa los métodos que permitan consultar:

- El título.
- El artista.
- La duración.

No es necesario implementar setters en este ejercicio.

### Paso 4. Crear la clase principal

Crea una clase con el método `main` para ejecutar el ejercicio.

Dentro de esta clase:

- Crea cinco objetos de tipo `Cancion`.
- Asigna información diferente a cada objeto.
- Utiliza canciones de diferentes artistas.

### Paso 5. Crear el arreglo

Crea un arreglo de tipo `Cancion` que permita almacenar los cinco objetos creados.

Asigna cada objeto a una posición del arreglo.

### Paso 6. Recorrer el arreglo

Utiliza un ciclo `for` para recorrer el arreglo.

Por cada canción almacenada, imprime:

- El título.
- El artista.
- La duración.

Utiliza los métodos getter para acceder a los atributos de cada objeto.

### Paso 7. Analizar el resultado

Verifica que cada posición del arreglo almacene un objeto de tipo `Cancion` y que puedas consultar la información de cada uno.

### Reto adicional

Diseña una lógica que permita calcular la duración total de todas las canciones almacenadas en la lista de reproducción.

---

## Ejercicio 5. Catálogo de videojuegos

### Contexto

Una plataforma de videojuegos necesita organizar un catálogo de juegos disponibles para sus usuarios.

Cada videojuego debe tener información que permita identificarlo y consultar sus características.

### Objetivos

- Crear una clase con atributos.
- Crear un constructor.
- Crear getters.
- Crear un arreglo de objetos.
- Recorrer un arreglo de objetos.

### Paso 1. Diseñar la clase `Videojuego`

Crea una clase llamada `Videojuego`.

Identifica y define tres atributos que permitan representar un videojuego.

Puedes utilizar como referencia los siguientes elementos:

- Nombre del videojuego.
- Género.
- Año de lanzamiento.

Define los tipos de datos adecuados para cada atributo.

### Paso 2. Crear el constructor

Implementa un constructor que permita inicializar los atributos del videojuego.

### Paso 3. Crear métodos getter

Implementa los métodos getter necesarios para consultar cada atributo.

### Paso 4. Instanciar videojuegos

En la clase principal:

- Crea cuatro objetos de tipo `Videojuego`.
- Asigna información diferente a cada objeto.
- Utiliza videojuegos de diferentes géneros.

### Paso 5. Crear un arreglo

Crea un arreglo de tipo `Videojuego` que permita almacenar los cuatro objetos.

### Paso 6. Recorrer el arreglo

Utiliza un ciclo para recorrer el arreglo e imprimir la información de cada videojuego.

### Paso 7. Analizar el resultado

Comprueba que cada videojuego esté almacenado en una posición del arreglo y que sus atributos puedan consultarse mediante los getters.

### Reto adicional

Utiliza una condición para identificar los videojuegos que fueron lanzados después del año 2020.

---

# Sección 3. Identificación de elementos y construcción de clases

En esta sección no se parte de una clase previamente definida. El estudiante debe analizar un contexto, identificar qué información necesita representar y decidir cómo construir una clase en Java.

Cada ejercicio debe incluir:

- Identificación de atributos.
- Selección de tipos de datos.
- Creación de la clase.
- Definición de un constructor.
- Implementación de getters.
- Implementación de setters.
- Instanciación de objetos.
- Consulta y modificación de atributos.

---

## Ejercicio 6. Diseñando un personaje de un videojuego

### Contexto

Un videojuego de aventura permite crear personajes que pueden evolucionar durante una partida. Cada personaje posee características que pueden modificarse conforme avanza el juego.

### Paso 1. Analizar el elemento

Observa el concepto de personaje de videojuego.

Identifica al menos tres características que permitan describirlo.

Por ejemplo, puedes considerar características relacionadas con su identidad, estado o capacidades.

### Paso 2. Identificar atributos

Define al menos tres atributos que representen las características identificadas.

Para cada atributo:

- Define su nombre.
- Define el tipo de dato.
- Explica qué información representa.

Organiza tu propuesta en una tabla antes de comenzar a programar.

| Atributo | Tipo de dato | ¿Qué representa? |
|---|---|---|
| | | |
| | | |
| | | |

### Paso 3. Crear la clase

Crea una clase llamada `Personaje`.

Define los atributos identificados en el paso anterior.

### Paso 4. Crear el constructor

Implementa un constructor que permita inicializar los atributos del personaje.

El constructor debe recibir los valores necesarios para crear un personaje con sus características iniciales.

### Paso 5. Crear los getters

Implementa un método getter para cada atributo.

Estos métodos permitirán consultar las características del personaje desde otras clases.

### Paso 6. Crear los setters

Implementa un método setter para cada atributo.

Estos métodos permitirán modificar las características del personaje después de su creación.

### Paso 7. Crear objetos

En la clase principal:

- Instancia dos personajes diferentes.
- Asigna valores diferentes a sus atributos.
- Imprime las características de cada personaje utilizando los getters.

### Paso 8. Modificar características

Utiliza los setters para modificar una o más características de uno de los personajes.

Después de realizar los cambios, imprime nuevamente la información del personaje.

### Reto adicional

Piensa en una característica que no debería aceptar cualquier valor.

Por ejemplo, una característica que no debería ser negativa.

¿Cómo podrías utilizar un setter para controlar el valor que recibe ese atributo?

---

## Ejercicio 7. Diseñando un dispositivo tecnológico

### Contexto

Una tienda de tecnología necesita representar los dispositivos que comercializa. Para este ejercicio, se trabajará con un dispositivo específico: un teléfono inteligente.

### Paso 1. Analizar el elemento

Observa un teléfono inteligente e identifica características que permitan representarlo en un programa.

Piensa en información que permita diferenciar un teléfono de otro.

### Paso 2. Identificar atributos

Selecciona al menos tres atributos.

Puedes considerar características relacionadas con:

- Identificación del dispositivo.
- Fabricante.
- Características técnicas.

Registra los atributos y sus tipos de datos.

| Atributo | Tipo de dato | ¿Qué representa? |
|---|---|---|
| | | |
| | | |
| | | |

### Paso 3. Crear la clase

Crea una clase llamada `Telefono`.

Define los atributos que seleccionaste en el paso anterior.

### Paso 4. Crear el constructor

Implementa un constructor que permita inicializar todos los atributos del teléfono.

### Paso 5. Implementar getters

Crea los métodos getter que permitan consultar cada atributo.

### Paso 6. Implementar setters

Crea los métodos setter que permitan modificar cada atributo.

### Paso 7. Instanciar objetos

Crea dos objetos de tipo `Telefono`.

Cada objeto debe representar un dispositivo diferente.

### Paso 8. Consultar información

Utiliza los getters para imprimir la información de cada dispositivo.

### Paso 9. Modificar información

Utiliza los setters para modificar al menos dos atributos de uno de los teléfonos.

Imprime nuevamente la información para verificar los cambios.

### Reto adicional

¿Qué atributo podría necesitar una validación antes de aceptar un nuevo valor?

Implementa una validación dentro de su setter.

---

## Ejercicio 8. Diseñando una mascota virtual

### Contexto

Una aplicación de mascotas virtuales permite crear animales digitales que pueden interactuar con el usuario.

Cada mascota posee características que permiten identificarla y conocer su estado.

### Paso 1. Analizar el elemento

Selecciona una mascota virtual que quieras representar en tu programa.

Puede ser un perro, gato, dragón, dinosaurio u otro animal ficticio.

Identifica las características que permitan describirla.

### Paso 2. Identificar atributos

Define al menos tres atributos para representar tu mascota.

Considera aspectos como:

- Identificación.
- Características físicas o descriptivas.
- Estado actual.

Selecciona los tipos de datos adecuados.

| Atributo | Tipo de dato | ¿Qué representa? |
|---|---|---|
| | | |
| | | |
| | | |

### Paso 3. Crear la clase

Crea una clase llamada `MascotaVirtual`.

Define los atributos identificados.

### Paso 4. Crear el constructor

Implementa un constructor que permita crear una mascota virtual con sus características iniciales.

### Paso 5. Crear getters

Implementa los métodos getter para consultar los atributos.

### Paso 6. Crear setters

Implementa los métodos setter para modificar los atributos.

### Paso 7. Instanciar mascotas

Crea al menos dos mascotas virtuales diferentes.

Cada objeto debe tener características propias.

### Paso 8. Consultar y modificar

- Imprime la información de las mascotas.
- Modifica al menos dos atributos de una mascota.
- Imprime nuevamente la información para verificar los cambios.

### Reto adicional

Identifica una característica que pueda cambiar durante la interacción con la mascota.

Piensa en una manera de controlar los valores que recibe esta característica mediante un setter.

---

# Actividad de cierre

Una vez finalizados los ejercicios, responde las siguientes preguntas con tus propias palabras:

1. ¿Qué diferencia existe entre almacenar datos de tipo primitivo en un arreglo y almacenar objetos en un arreglo?
2. ¿Qué ventajas ofrece representar una canción, un videojuego o un teléfono mediante una clase?
3. ¿Qué función cumple el constructor al crear un objeto?
4. ¿Por qué se utilizan los métodos getter para consultar atributos?
5. ¿Qué utilidad tienen los setters cuando se necesita modificar la información de un objeto?
6. ¿Qué criterios utilizaste para identificar los atributos de una clase?
7. ¿Qué otras características o comportamientos podrían agregarse a las clases que construiste?

## Recomendaciones para el desarrollo

- Organiza cada ejercicio en archivos independientes.
- Utiliza nombres descriptivos para las clases, atributos y métodos.
- Mantén los atributos con acceso `private`.
- Utiliza constructores para inicializar los objetos.
- Utiliza getters y setters para consultar y modificar los atributos.
- Verifica los resultados en consola.
- No copies las clases de otros ejercicios sin analizar qué representan sus atributos y comportamientos.

