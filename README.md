# Refactorización de Código Legado

### Alberto Rueda Romero
### David Delgado Alonso

# Fase 1: Análisis de la Deuda Técnica

El proceso de refactorización del ejercicio conlleva diferentes pasos para su realización.

En primer lugar, probamos el código recibido y comprobamos que funcionaba correctamente antes de realizar cualquier modificación.

Además, nos planteamos diferentes cuestiones relacionadas con el significado de las variables, ya que no tenían contexto ni nombres descriptivos.

Era evidente que el código no era legible, puesto que no incluía comentarios ni documentación que facilitara su comprensión.

Tras analizar el nombre de las variables, dedujimos que el método trabajaba con distintos tipos de clientes, un importe base y una condición para clientes VIP. Por ello, sustituimos las variables `m`, `tC` y `dV` por nombres más descriptivos como `importeBase`, `tipoCliente` y `esSocioVip`.

También identificamos varios números mágicos, es decir, constantes utilizadas directamente en el código sin una declaración previa. Para mejorar la legibilidad, definimos constantes con nombres descriptivos como:

- `DESCUENTO_VIP_DIA`
- `DESCUENTO_VIP`
- `DESCUENTO_CLIENTE_ESTANDAR`
- `TIPO_CLIENTE_VIP`
- `TIPO_CLIENTE_ESTANDAR`

Por último, detectamos varias estructuras `if` que generaban confusión debido a la falta de claridad en las variables y constantes utilizadas. Para solucionarlo, optamos por simplificar la lógica eliminando bloques innecesarios y utilizando estructuras `if` más simples y limpias.

# Fase 2: Refactorización Asistida por el IDE

Para comenzar la refactorización utilizamos el IDE **Visual Studio Code**.

Para renombrar las variables, colocamos el cursor sobre la variable y presionamos `F2`. Después, escribimos el nuevo nombre siguiendo la convención `camelCase` y confirmamos con `Enter`.

Posteriormente, seleccionamos los números que identificamos como constantes y les asignamos nombres descriptivos utilizando la convención `SNAKE_CASE`.

Gracias a las nuevas variables y constantes, pudimos simplificar el código eliminando estructuras `else` innecesarias y dejando el método más limpio y fácil de entender.

# Fase 3: Verificación, Documentación y Entrega

La verificación se realizó correctamente y el código continúa funcionando sin errores. Además, el resultado final presenta una mejora notable en legibilidad y mantenimiento, incluyendo comentarios y una mejor estructura.

Aunque la versión original también funcionaba correctamente, disponer de un código más legible y comprensible facilita futuras modificaciones y reduce la posibilidad de errores. Con esta refactorización hemos conseguido un código más seguro, limpio y mantenible.
