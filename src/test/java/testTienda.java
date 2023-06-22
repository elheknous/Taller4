import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testTienda {
    @Test
    public void testAgregarCliente(){
        Tienda t = new Tienda();
        Cliente clienteEsperado = new Cliente("Jose","Matus","123","12345678",
                "viudo","Temuco");
        //CREACION DEL CLIENTE
        Cliente clienteObtenido = t.crearCliente("Jose","Matus","123","12345678",
                "viudo","Temuco");
        Assertions.assertEquals(clienteEsperado.toString(),clienteObtenido.toString());

    }

}
