
package Paquete;

public class Main{
   public static void main( String args[] )
   {
      CrearArchivo aplicacion = new CrearArchivo();
      aplicacion.abrirArchivo();
      aplicacion.agregarRegistros();
      aplicacion.cerrarArchivo();
   } // fin de main
}