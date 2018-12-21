/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;


public class Main {
        
        public static void main(String[] args) {    
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();   //Creamos un objeto de tipo LeerArchivoTexto1
        OperacionData operaciones = new OperacionData();    
        aplicacion.abrirArchivo();   //Llamamos el metodo abrir archivo de la clase 
        operaciones.agregarInformacion(aplicacion.leerRegistros());
        System.out.printf("El promedio es: %.2f", operaciones.PromedioCapacidad());
       }   

}