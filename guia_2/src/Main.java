public class Main {

    public static void main(String[] args) {

        //////////////////////      Ejercicio 1 Libro       /////////////////////
        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        //b. Imprima por pantalla al autor previamente instanciado.
        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        //pesos con una cantidad de 150 copias.
        //d. Imprima por pantalla el libro instanciado.
        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.
        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        //Libro “Effective Java”.
        //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje:
        //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        //h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        //cambios necesarios en el método del punto g, para imprimir un nuevo
        //mensaje que liste los autores que contribuyeron a ese libro.



        //////////////////////      Ejercicio 2 Venta       /////////////////////
        //a. Investigue la clase UUID y sus métodos estáticos para la generación de los
        //ids. Investigue la clase LocalDate y sus métodos estáticos para la generación
        //de la fecha.
        //b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto
        //haga uso de un método que facilite la impresión del mismo.
        //Cliente[id=?, nombre=?, email=?, descuento=?]
        //c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        //Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
        //monto total luego de aplicarle el descuento.
        //d. Cree un método que facilite la impresión del objeto de tipo Factura y que
        //siga el siguiente formato.
        //Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
        //email=?, descuento=?]]
        //e. Analizar de agregar el tipo ItemVenta, que representa un producto que
        //forma parte de la venta. El mismo contiene un id, un nombre, descripción y
        //precio unitario. Considere las modificaciones necesarias en el tipo Factura
        //para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
        //calcular los montos totales con y sin el descuento aplicado


        //////////////////////      Ejercicio 3 Cuenta Bancaria       /////////////////////
        //a. Crear un Cliente e imprimirlo en pantalla.
        //b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
        //10000.
        //c. Realizar operaciones de depósito y extracción para probar esa
        //funcionalidad.
        //d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,
        //de máximo 2000 pesos. Esto significa que la cuenta puede aceptar un
        //balance negativo con un máximo de - 2000. Realice los cambios y pruebas
        //necesarias.
        //e. Analice cómo implementaría con las herramientas conocidas hasta el
        //momento, llevar un registro de como máximo 10 operaciones de depósito y
        //extracción que se realizaron en la cuenta. En donde se almacene en
        //memoria de alguna forma la siguiente cadena de texto:
        //i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
        //ii. Extracción: "El {NombreCliente}, retiró {MontoRetirado}"


    }
}
