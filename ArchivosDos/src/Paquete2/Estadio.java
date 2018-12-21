
package Paquete2;

public class Estadio {
    String nombre,tipo;
    double capacidad;
       public Estadio() 
   {
      this( ""," ",0); // llama al constructor con tres argumentos
   }
    public Estadio(String n, String t, int c) {
        setNombre(n);
        setTipo(t);
        setCapacidad(c);
   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String ti) {
        tipo = ti;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double cap) {
        capacidad = cap;
    }

    @Override
    public String toString() {
        return String.format("Estadio\n Nombre: %s \t Tipo: %s \t Capacidad: %d",getNombre(),getTipo(), getCapacidad());
                
    }   
}
