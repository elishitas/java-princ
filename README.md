# Java-Principiantes

Práctica de **Java**

---

## :star:Instalación Java e Intellij
- Descarga de Java Development Kit (JDK) agregarla en **variable de entorno**. En la terminal hacemos ```java --version``` debemos ver la version instalada.
- Descargar entorno de desarrollo IntelliJ, existe la version **Community** (free) y la versión **Ultimate** (paga).
- Creación de Proyecto: **Welcome to InteliJ IDEA** > **New Proyect** > **Java** > **Proyect SDK** (elegir versión de JDKs) > **Next**.
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

- Le hacemos click en el boton **play** . Por consola vemos **Hola mundo**
