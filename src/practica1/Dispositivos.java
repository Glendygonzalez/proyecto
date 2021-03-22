//
package practica1;

public class Dispositivos {
 static String correo_electronico;
 static String  nombre;
 static String estado;

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

    public Dispositivos(String correo_electronico, String nombre, String estado) {
        this.correo_electronico = correo_electronico;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String toString() {
        return "Correo Electronico: " + correo_electronico + '\n'+"nombre: " + nombre +'\n'+ "estado: " + estado ;
    }
   

}
