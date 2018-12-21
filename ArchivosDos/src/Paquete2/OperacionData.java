/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
public class OperacionData {
    
        ArrayList<Estadio> informacion;
    
    public void agregarInformacion(ArrayList<Estadio> info){
        informacion = info;
    }
    
    public ArrayList<Estadio> obtenerInformacion(){
        return informacion;
    }
    public double PromedioCapacidad(){
        double sumatoria=0,promedio=0;
        int acum=0;
          for (int i=0; i< informacion.size(); i++){
             sumatoria += obtenerInformacion().get(i).getCapacidad();
             acum++;
         }
         promedio = sumatoria/acum;
         System.out.println(promedio);
         return promedio;
    }
}
