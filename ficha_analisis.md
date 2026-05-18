# FICHA DE ANÁLISIS — Parrot Kata

## 1. CODE SMELLS DETECTADOS:
*   [x] Switch Statement / Conditional by Type
*   [x] Campos en la clase base que solo usa una subclase
*   [x] Enum que modela tipos de objetos (señal de que debería haber subclases)
*   [ ] "Unreachable" exception como muleta del switch
*   [ ] Otros: ___________

## 2. ATRIBUTOS POR TIPO DE LORO:

| TIPO | Usa `numberOfCoconuts` | Usa `voltage` | Usa `isNailed` |
| :--- | :--- | :--- | :--- |
| **EUROPEAN** | | | |
| **AFRICAN** | X | | |
| **NORWEGIAN_BLUE** | | X | X |

## 3. COMPORTAMIENTO DE `getSpeed()` POR TIPO:
*   **EUROPEAN:** `speed` = 12.0 (`getBaseSpeed()`)
*   **AFRICAN:** `speed` = `Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts)`
*   **NORWEGIAN_BLUE:** `speed` = 0 (si `nailed`) / `Math.min(24.0, voltage * getBaseSpeed())` (si libre)

## 4. COMPORTAMIENTO DE `getCry()` POR TIPO:
*   **EUROPEAN:** `cry` = "Sqoork!"
*   **AFRICAN:** `cry` = "Sqaark!"
*   **NORWEGIAN_BLUE:** `cry` = "Bzzzzzz" (si `voltage > 0`) / "..." (si no)

## 5. PREGUNTA DE ORO: 
**¿Qué pasa con `numberOfCoconuts`, `voltage` e `isNailed` cuando los mueves a las subclases que los necesitan? ¿Pueden eliminarse del constructor de la clase base?**
Cuando se mueven a las subclases correspondientes, estos atributos dejan de ser necesarios en la clase base `Parrot`. Por lo tanto, pueden y deben eliminarse del constructor de la clase base, simplificando enormemente su instanciación y haciendo que cada subclase maneje exclusivamente sus propios parámetros.
