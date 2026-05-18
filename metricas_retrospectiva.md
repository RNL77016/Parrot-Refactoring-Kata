# MÓDULO 3 — Métricas de Éxito y Retrospectiva

## 3.1 Medir la reducción de condicionales

| Métrica | Antes | Objetivo | Resultado |
| :--- | :--- | :--- | :--- |
| **`switch` en clase Parrot** | 2 | **0** | 0 |
| **`case` por tipo de loro en Parrot** | 6 | **0** | 0 |
| **Campos solo usados por una subclase en Parrot** | 3 (`numberOfCoconuts`, `voltage`, `isNailed`) | **0** | 0 |
| **Clases concretas por tipo** | 0 | **3** | 3 |
| **Para añadir un cuarto loro hay que modificar** | `Parrot.java` (2 métodos) | **0 clases existentes** | 0 |

## 3.2 Consultar las soluciones de Emily Bache
*   **¿Tomaste el mismo orden de extracción de subclases?** Sí, al extraer primero el caso más simple (`EuropeanParrot`) y validarlo, establecemos el patrón para las siguientes subclases.
*   **¿Hiciste `Parrot` abstracta antes o después de mover la lógica?** Después. Es fundamental primero tener las implementaciones concretas pasando los tests antes de eliminar la implementación base haciendo abstractos los métodos de la clase padre.
*   **¿Eliminaste `ParrotTypeEnum`? ¿Emily lo hace?** Sí, lo eliminamos porque ya no tiene utilidad. Al usar polimorfismo, el compilador y la JVM saben intrínsecamente de qué tipo es la instancia, haciendo obsoleto un enum de control de tipo. Emily también promueve la eliminación de código pre-polimórfico muerto.
*   **¿Cuántos commits tiene tu historial? ¿Son más o menos granulares que ella?** Aproximadamente 6 commits granulares correspondientes a los micro-pasos del ejercicio, permitiendo mantener los tests siempre en verde y dando seguridad al proceso.

## 3.3 Retrospectiva del equipo
*   **¿En qué momentos el navigator aportó más valor? ¿En qué momentos molestó?** El navigator aportó valor al recordar la necesidad de verificar pruebas constantemente y señalar las variables exclusivas de cada loro, previniendo errores de diseño en los constructores finales.
*   **¿Hubo desacuerdos sobre el orden de los pasos? ¿Cómo los resolvisteis?** No hubo desacuerdos mayores; seguimos la recomendación de "Micro-pasos" propuesta por la kata, asegurando que un test rojo temporal se solventara integrando el arreglo al instante (por ejemplo, al abstraer `Parrot` y actualizar `ParrotTest` atómicamente).
*   **¿Cuándo exactamente "desaparecieron" los switch? ¿En qué micro-paso fue?** Desaparecieron en el micro-paso I1, cuando convertimos a `Parrot` en abstracta y sus métodos `getSpeed` y `getCry` también fueron marcados como abstractos, descartando su implementación predeterminada con switch.
*   **¿Podrías añadir ahora un cuarto tipo de loro (`DeadParrot`) en menos de 5 minutos?** Sí, gracias al diseño final (Open/Closed Principle de SOLID), agregar un `DeadParrot` únicamente requiere crear una nueva clase `DeadParrot extends Parrot` e implementar sus métodos `getSpeed` y `getCry`, sin modificar absolutamente ninguna clase de negocio existente.
