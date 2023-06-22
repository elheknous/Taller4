public class Pantalla {
    private String marca;
    private String modelo;
    private String ano;

    public Pantalla(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    @Override
    public String toString() {
        return "Pantalla{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
