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
