
package practica1;
public class Telefono {
    private String correo_electronico;
    private String nombre;
    private String estado;
    private String numero;

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Telefono(String correo_electronico, String nombre, String estado, String numero) {
        this.correo_electronico = correo_electronico;
        this.nombre = nombre;
        this.estado = estado;
        this.numero = numero;
    }

    public String toString() {
        return "Correo Electronico:" + correo_electronico +'\n'+"Nombre:" + nombre +'\n'+"Estado:" + estado+'\n'+ "Numero:" + numero +'\n';
    }
   
    
}
