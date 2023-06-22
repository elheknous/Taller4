import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    @Test
    public void verificarDispositovo(){
        ArrayList<String> ac = new ArrayList<>();
        ac.add("lapiz");
        ac.add("funda");
        ArrayList <Tablets> tablets = new ArrayList<>();
        Tablets t = new Tablets("Asus","8","512","i5","Nuevo","2010","5000","10","1080",ac);
        tablets.add(t);
        Tienda tienda = new Tienda(tablets);

        String esperado = t.toString();
        String recivido = tienda.obtenerEspecificaciones();

        Assertions.assertEquals(esperado,recivido);


    }

}
