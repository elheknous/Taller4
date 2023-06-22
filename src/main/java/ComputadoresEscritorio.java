public class ComputadoresEscritorio extends DispositivoTecnologico{
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantalla;

    public ComputadoresEscritorio(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, String ano, String precio, String stock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, ano, precio, stock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    public String getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(String tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public String getFuentePoder() {
        return fuentePoder;
    }

    public void setFuentePoder(String fuentePoder) {
        this.fuentePoder = fuentePoder;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return super.toString()+"ComputadoresEscritorio{" +
                "tarjetaVideo='" + tarjetaVideo + '\'' +
                ", fuentePoder='" + fuentePoder + '\'' +
                ", chasis='" + chasis + '\'' +
                ", pantalla=" + pantalla +
                '}';
    }
}
