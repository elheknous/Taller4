import java.util.StringTokenizer;

public class DispositivoTecnologico {
    private String marca;
    private String memoriaRam;
    private String memoriaAlmacenamiento;
    private String procesador;
    private String modelo;
    private String ano;
    private String precio;
    private String stock;

    public DispositivoTecnologico(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, String ano, String precio, String stock) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.ano = ano;
        this.precio = precio;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaAlmacenamiento() {
        return memoriaAlmacenamiento;
    }

    public void setMemoriaAlmacenamiento(String memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "DispositivoTecnologico{" +
                "marca='" + marca + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", memoriaAlmacenamiento='" + memoriaAlmacenamiento + '\'' +
                ", procesador='" + procesador + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", precio='" + precio + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
