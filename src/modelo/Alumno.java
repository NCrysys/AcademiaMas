/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author a22noellr
 */
public class Alumno implements Serializable {
    private String nombre;
    private String localidad;
    private ArrayList<Modulo> modulos;
    
    public Alumno(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulos = new ArrayList<Modulo>();
    }
    
    public Alumno(String nombre, String localidad, ArrayList<Modulo> modulos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulos = modulos;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public void añadirModulo(Modulo a){
        modulos.add(a);
    }
    
    public String[] getNombreModulos(){
        String[] nombreModulos = new String[modulos.size()];
        for (int i = 0; i < modulos.size(); i++) {
            nombreModulos[i] = modulos.get(i).getNombre();
        }
        return nombreModulos;
    }
    
    public double getNumeroHoras(){
        double numeroHoras=0;
        for (int i = 0; i < modulos.size(); i++) {
            numeroHoras += modulos.get(i).getHoras();
        }
        return numeroHoras;
    }
}
