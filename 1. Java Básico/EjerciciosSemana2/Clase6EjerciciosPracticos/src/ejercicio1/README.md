# Ejercicio Nº 1 - Collections, Clases Abstractas e Interfaces

## Descripción del Ejercicio

Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.

### Requerimientos

- **Clase Abstracta Vehiculo:** 
  - Atributos: id, placa, marca, modelo, año, costo.
  - Método abstracto para calcular la antigüedad del vehículo.

- **Interfaces: Electrico y Combustion**
  - Métodos abstractos: cargarEnergia(), recargarCombustible().
  - Mostrar mensaje de tipo de recarga.

- **Clase Auto:** 
  - Hereda de Vehiculo e implementa Electrico.
  - Atributos específicos: capacidadBateria (mah), autonomia (hs).

- **Clase Camioneta:** 
  - Hereda de Vehiculo e implementa Combustion.
  - Atributos específicos: capacidadTanque, consumoCombustible.

- **Clase Moto:** 
  - Hereda de Vehiculo e implementa Combustion.
  - Atributos específicos: cilindrada, tipoMotor.

- **Main:** 
  - Crear objetos de diferentes tipos de vehículos y añadirlos a un ArrayList de tipo Vehiculo.
  - Mostrar información incluyendo cálculo de antigüedad y recarga de energía o combustible.