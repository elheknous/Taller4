import java.util.ArrayList;

public class Tablets extends DispositivoTecnologico{
    private String resolucion;
    private ArrayList<String> accesorios;

    public Tablets(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, String ano, String precio, String stock, String resolucion, ArrayList<String> accesorios) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, ano, precio, stock);
        this.resolucion = resolucion;
        this.accesorios = accesorios;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public ArrayList<String> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<String> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String toString() {
        return super.toString()+ "Tablets{" +
                "resolucion='" + resolucion + '\'' +
                ", accesorios=" + accesorios +
                '}';
    }
}
