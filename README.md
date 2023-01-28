# Java-Principiantes

Práctica de **Java**

---

## :star:Instalación Java e Intellij
- Se descarga de Java Development Kit (JDK), agregarla en **variable de entorno**. En la terminal escribi ```java --version``` y debemos ver la versión instalada.
- Se descargar el entorno de desarrollo IntelliJ, existe la version **Community** (free) y la versión **Ultimate** (paga).
- La creación del Proyecto: **Welcome to InteliJ IDEA** > **New Proyect** > **Java** > **Proyect SDK** (elegir versión de JDKs) > **Next**.
Se puede hacer click en **crear proyecto a partir de una plantilla** > **Proyect Name**:  (el nombre del proyecto), **Proyecto location** : (donde estara ubicado) > **Finish**.
Se crea el proyecto con la clase **main**

```
- proyect
  -src
      -com.company
           -main
```
- Verificar funcionamiento: “Hola mundo”

```Java
package com.company;
public class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo!");
  }
}
```

- Hacemos click en el boton **play** . Por consola vemos **Hola mundo**
