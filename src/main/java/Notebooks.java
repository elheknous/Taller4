public class Notebooks extends DispositivoTecnologico{
    private String resolucion;
    private String teclado;
    private String bateria;

    public Notebooks(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, String ano, String precio, String stock, String resolucion, String teclado, String bateria) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, ano, precio, stock);
        this.resolucion = resolucion;
        this.teclado = teclado;
        this.bateria = bateria;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return super.toString()+"Notebooks{" +
                "resolucion='" + resolucion + '\'' +
                ", teclado='" + teclado + '\'' +
                ", bateria='" + bateria + '\'' +
                '}';
    }
}
