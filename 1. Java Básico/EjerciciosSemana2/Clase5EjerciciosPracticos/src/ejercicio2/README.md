# Ejercicio Nº 2 - Herencia y Polimorfismo - Individual

## Clase "Vestimenta"

La clase "Vestimenta" contendrá los siguientes atributos:

- `código`: Código de identificación de la prenda.
- `nombre`: Nombre de la prenda.
- `precio`: Precio de la prenda.
- `marca`: Marca de la prenda.
- `talla`: Talla de la prenda.
- `color`: Color de la prenda.

## Clases Hijas

Se crearán cuatro clases hijas que hereden de la clase "Vestimenta":

1. **Zapato:** Con atributos adicionales como material y tipo de cierre.
2. **Pantalón:** Con atributos adicionales como estilo y tipo de tejido.
3. **Camiseta:** Con atributos adicionales como manga y cuello.
4. **Sombrero:** Con atributos adicionales como tipo y tamaño.

## Métodos en Clases Hijas

Cada clase hija implementará un método específico que mostrará un mensaje en pantalla con información relevante sobre la prenda.

- **Zapato:** Método para mostrar la marca de los zapatos.
- **Pantalón:** Método para mostrar el estilo de los pantalones.
- **Camiseta:** Método para mostrar el tipo de manga de las camisetas.
- **Sombrero:** Método para mostrar el tipo de sombrero.

## Creación del Vector y Ejecución de Métodos

En el método `main`, se creará un vector de tipo "Vestimenta" y se almacenarán instancias de cada una de las clases hijas. Luego, se recorrerá el vector y se ejecutará el método correspondiente en cada posición.
