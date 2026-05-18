public class FacturacionLegacy {

// CONSTANTES PARA LOS DESCUENTOS Y TIPOS DE CLIENTE USANDO SNAKE_CASE PARA MEJORAR LA LEGIBILIDAD

    private static final double DESCUENTO_VIP_DIA_VENTA = 0.25;
    private static final double DESCUENTO_VIP = 0.15;
    private static final double DESCUENTO_CLIENTE_ESTANDAR = 0.05;
    private static final int TIPO_CLIENTE_VIP = 1;
    private static final int TIPO_CLIENTE_ESTANDAR = 2;

    /**
     * Calcula el total final de una factura aplicando el descuento correspondiente
     * según el tipo de cliente y si existe un día de venta especial.
     *
     *  AQUÍ OBSERVAMOS UNA FIRMA DE MÉTODO MÁS CLARA Y DESCRIPTIVA, CON NOMBRES DE PARÁMETROS(VARIABLES EN camelCase) QUE EXPLICAN SU PROPÓSITO.
     * @param importeBase importe inicial de la factura antes de aplicar descuentos
     * @param tipoCliente tipo de cliente: 1 para VIP, 2 para estándar y otros valores sin descuento
     * @param esSocioVip indica si el cliente vip tiene descuento especial por día de venta
     * @return importe final después de aplicar el descuento correspondiente; devuelve 0 si el importe es menor o igual que 0
     * 
     * 
     */
//CÓDIGO SIN BLOQUE ELSE UTILIZANDO RETORNOS TEMPRANOS PARA MEJORAR LA LEGIBILIDAD Y REDUCIR LA NESTING DE CONDICIONES

    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
      // Si el importe base es menor o igual a 0, devolvemos 0 inmediatamente para evitar cálculos innecesarios y mejorar la legibilidad del código.
        if (importeBase <= 0) {
            return 0;
        }
      // Si el cliente es VIP y tiene descuento especial por día de venta, aplicamos el descuento del 25% y devolvemos el resultado.
        if (tipoCliente == TIPO_CLIENTE_VIP && esSocioVip) {
            return importeBase - (importeBase * DESCUENTO_VIP_DIA_VENTA);
        }
      // Si el cliente es VIP sin descuento especial por día de venta, aplicamos el descuento del 15% y devolvemos el resultado.
        if (tipoCliente == TIPO_CLIENTE_VIP) {
            return importeBase - (importeBase * DESCUENTO_VIP);
        }
      // Si el cliente es estándar, aplicamos el descuento del 5% y devolvemos el resultado.
        if (tipoCliente == TIPO_CLIENTE_ESTANDAR) {
            return importeBase - (importeBase * DESCUENTO_CLIENTE_ESTANDAR);
        }

        return importeBase;
    }
}