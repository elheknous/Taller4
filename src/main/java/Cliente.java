import javax.swing.*;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String numero;
    private String estadoCivil;
    private String ciudad;

    public Cliente(String nombre, String apellido, String correo, String numero, String estadoCivil, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero = numero;
        this.estadoCivil = estadoCivil;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", numero='" + numero + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
