/**
 *
 * @author Luis Carrasco
 * @version 07-09-2023
 */
public class Vehiculo {
    private String marca,tipo,patente;
    private int kilometraje,año;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String tipo, String patente, int kilometraje, int año) {
        this.marca = marca;
        this.tipo = tipo;
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", tipo=" + tipo + ", patente=" + patente + ", kilometraje=" + kilometraje + ", a\u00f1o=" + año + '}';
    }

    
    
   
}

