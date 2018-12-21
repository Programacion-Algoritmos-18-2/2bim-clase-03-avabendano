/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class LeerArchivoTexto {

    private Scanner entrada;
    OperacionData operacion = new OperacionData();

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estadios.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // lee registro del archivo
    // lee registro del archivo
    public ArrayList<Estadio> leerRegistros() {
        ArrayList<Estadio> lista = new ArrayList<>();


        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext()) {
                Estadio estadio = new Estadio();
                String linea = entrada.nextLine();
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                estadio.setNombre(linea_partes.get(0));
                estadio.setTipo(linea_partes.get(1));
                estadio.setCapacidad(Double.parseDouble(linea_partes.get(2))); //Transformamos a tipo double la cadena de la lista
                lista.add(estadio);
            } // fin de while
            //operacion.agregarInformacion(lista);

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
}
