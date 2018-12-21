
package Paquete;

public class Persona {
    String nombre;
    int edad; 
       public Persona() 
   {
      this( "", 0 ); // llama al constructor con cuatro argumentos
   }
    public Persona(String nom, int ed){
        nombre = nom;
        edad = ed;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad = e;
    }
}
