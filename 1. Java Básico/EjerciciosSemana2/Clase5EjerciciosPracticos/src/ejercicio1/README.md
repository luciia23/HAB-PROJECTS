# Ejercicio Nº 1 - Herencia, Polimorfismo y Encapsulamiento - Individual


## Clase "Animal"

La clase "Animal" contendrá los siguientes atributos:

- `id`: Identificador del animal.
- `nombre`: Nombre del animal.
- `edad`: Edad del animal.
- `tipoPiel`: Tipo de piel del animal.
- `tipoAlimentacion`: Tipo de alimentación del animal.

Además, se incluirá el método `saludar()` que imprimirá en pantalla el mensaje "Hola, soy un animal".

## Clases Hijas

Se crearán tres clases hijas que hereden de la clase "Animal":

1. **Mamífero:** Con atributos adicionales como número de patas, tipo de reproducción, color de pelaje y hábitat.
2. **Ave:** Con atributos adicionales como envergadura de alas, tipo de vuelo, color de plumaje y tipo de pico.
3. **Reptil:** Con atributos adicionales como longitud, tipo de escamas, tipo de veneno y hábitat.

## Métodos en Clases Hijas

Cada clase hija implementará un método `saludar()` que sobrescribirá el método de la clase base "Animal" con un mensaje específico para ese tipo de animal.

## Método "main"

En el método `main`, se creará un objeto de cada clase hija y se llamará al método `saludar()` desde cada objeto.

*d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?*

*e) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?*
