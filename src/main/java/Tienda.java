import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    private String dirrecion;
    private ArrayList<Tablets> tablets;
    private ArrayList<Notebooks> notebooks;
    private ArrayList<ComputadoresEscritorio> computadoresEscritorios;
    private ArrayList<Cliente> clientes;

    public Tienda(String dirrecion, ArrayList<Tablets> tablets, ArrayList<Notebooks> notebooks, ArrayList<ComputadoresEscritorio> computadoresEscritorios,ArrayList<Cliente> clientes) {
        this.dirrecion = dirrecion;
        this.tablets = tablets;
        this.notebooks = notebooks;
        this.computadoresEscritorios = computadoresEscritorios;
        this.clientes = clientes;
    }

    public Tienda(ArrayList<Tablets> tablets) {
        this.tablets = tablets;
    }

    public Tienda() {
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public ArrayList<Tablets> getTablets() {
        return tablets;
    }

    public void setTablets(ArrayList<Tablets> tablets) {
        this.tablets = tablets;
    }

    public ArrayList<Notebooks> getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(ArrayList<Notebooks> notebooks) {
        this.notebooks = notebooks;
    }

    public ArrayList<ComputadoresEscritorio> getComputadoresEscritorios() {
        return computadoresEscritorios;
    }

    public void setComputadoresEscritorios(ArrayList<ComputadoresEscritorio> computadoresEscritorios) {
        this.computadoresEscritorios = computadoresEscritorios;
    }

    public void agregarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("Apellido");
        String apellido = sc.next();
        System.out.println("Correo: ");
        String correo = sc.next();
        System.out.println("Numero: ");
        String numero = sc.next();
        System.out.println("Estado civil: ");
        String estadoCivil = sc.next();
        System.out.println("Ciudad: ");
        String ciudad = sc.next();

        Cliente c = crearCliente(nombre,apellido,correo,numero,estadoCivil,ciudad);
        this.clientes.add(c);
    }

    public Cliente crearCliente(String nombre, String apellido, String correo, String numero, String estadoCivil,String ciudad) {
        Cliente aux = new Cliente(nombre,apellido,correo,numero,estadoCivil,ciudad);
        return aux;


    }

    public void obtenerInformacion(){
        //Como ejemplo se obtendra la primera tablet
        String espe = obtenerEspecificaciones();
        System.out.println(espe);

    }

    public String obtenerEspecificaciones() {
        //Como ejemplo se obtendra la primera tablet
        Tablets tSelelccionada = this.tablets.get(0);
        System.out.println("Especificaciones: ");
        return tSelelccionada.toString();


    }

    public void agregarPcEscritotio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("MemoriaRam");
        String memoriaRam = sc.next();
        System.out.println("MemoriaAlmacenamiento: ");
        String memoriaAlmacenamiento = sc.next();
        System.out.println("Procesador: ");
        String procesador = sc.next();
        System.out.println("Modelo: ");
        String modelo = sc.next();
        System.out.println("Año: ");
        String ano = sc.next();
        System.out.println("Precio: ");
        String precio = sc.next();
        System.out.println("Stock");
        String stock = sc.next();
        System.out.println("Tarjeta de video: ");
        String tarjeta = sc.next();
        System.out.println("Fuente de poder: ");
        String fuente = sc.next();
        System.out.println("Chasis: ");
        String cahsis = sc.next();
        System.out.println("marca pantalla: ");
        String maracapantalla = sc.next();
        System.out.println("Modelo pantalla: ");
        String modeloPantalla = sc.next();
        System.out.println("Año: ");
        String anoPantalla = sc.next();

        Pantalla p = new Pantalla(maracapantalla,modeloPantalla,anoPantalla);

        ComputadoresEscritorio c = crearComputadoresEscritorio(marca,memoriaRam,memoriaAlmacenamiento,procesador,modelo,ano,precio,stock,tarjeta,fuente,cahsis,p);
        this.computadoresEscritorios.add(c);
    }

    private ComputadoresEscritorio crearComputadoresEscritorio(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, String ano, String precio, String stock, String tarjeta, String fuente, String cahsis, Pantalla p) {
        ComputadoresEscritorio aux = new ComputadoresEscritorio(marca,memoriaRam,memoriaAlmacenamiento,procesador,modelo,ano,precio,stock,tarjeta,fuente,cahsis,p);
        return aux;
    }

    public void agregarNotebook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("MemoriaRam");
        String memoriaRam = sc.next();
        System.out.println("MemoriaAlmacenamiento: ");
        String memoriaAlmacenamiento = sc.next();
        System.out.println("Procesador: ");
        String procesador = sc.next();
        System.out.println("Modelo: ");
        String modelo = sc.next();
        System.out.println("Año: ");
        String ano = sc.next();
        System.out.println("Precio: ");
        String precio = sc.next();
        System.out.println("Stock");
        String stock = sc.next();
        System.out.println("resolucion: ");
        String resolucion = sc.next();
        System.out.println("Teclado: ");
        String teclado = sc.next();
        System.out.println("Bateria: ");
        String bateria = sc.next();

        this.notebooks.add(new Notebooks(marca,memoriaRam,memoriaAlmacenamiento,procesador,modelo,ano,precio,stock,resolucion,teclado,bateria));


    }
    public void agregarTablets(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = sc.next();
        System.out.println("MemoriaRam");
        String memoriaRam = sc.next();
        System.out.println("MemoriaAlmacenamiento: ");
        String memoriaAlmacenamiento = sc.next();
        System.out.println("Procesador: ");
        String procesador = sc.next();
        System.out.println("Modelo: ");
        String modelo = sc.next();
        System.out.println("Año: ");
        String ano = sc.next();
        System.out.println("Precio: ");
        String precio = sc.next();
        System.out.println("Stock");
        String stok = sc.next();
        System.out.println("Resolucion: ");
        String resolucion = sc.next();


        ArrayList<String> accesorios = new ArrayList<>();
        accesorios.add(sc.next());
        accesorios.add(sc.next());
        accesorios.add(sc.next());

        this.tablets.add(new Tablets(marca,memoriaRam,memoriaAlmacenamiento,procesador,modelo,ano,precio,stok,resolucion,accesorios));



    }

    @Override
    public String toString() {
        return "Tienda{" +
                "dirrecion='" + dirrecion + '\'' +
                ", tablets=" + tablets +
                ", notebooks=" + notebooks +
                ", computadoresEscritorios=" + computadoresEscritorios +
                ", clientes=" + clientes +
                '}';
    }
}
