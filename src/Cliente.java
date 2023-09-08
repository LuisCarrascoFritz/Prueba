/**
 *
 * @author Luis Carrasco
 * @version 07-09-2023
 */
public class Cliente {
    private String nombre,apellido;
    private int edad,rut,telefono;
    private Vehiculo autito;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int edad, int rut, int telefono, Vehiculo autito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.telefono = telefono;
        this.autito = autito;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Vehiculo getAutito() {
        return autito;
    }

    public void setAutito(Vehiculo autito) {
        this.autito = autito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", rut=" + rut + ", telefono=" + telefono + ", autito=" + autito + '}';
    }
    
    
}
