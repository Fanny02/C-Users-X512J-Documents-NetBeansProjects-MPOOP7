/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop7;

/**
 *
 * @author estefany Zavala
 * @version 1.2 23.06.2021
 */
public class AlumnoIngenieria extends Alumno{
    private String circuito;

    public AlumnoIngenieria() {
    }

    public AlumnoIngenieria(String circuito) {
        this.circuito = circuito;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }
    
    public void calcular(){
        System.out.println("Estoy calculando");
    }

    @Override
    public String toString() {
        return super.toString()+"AlumnoIngenieria{" + "circuito=" + circuito + '}';
    }
    
    
}
