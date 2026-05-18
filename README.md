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
