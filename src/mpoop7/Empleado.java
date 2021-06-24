/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop7;

/**
 *
 * @author X512J
 */
public class Empleado {
    private String nombre;
    private int numEpleado;
    private float  sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, int numEpleado, float sueldo) {
        this.nombre = nombre;
        this.numEpleado = numEpleado;
        this.sueldo = sueldo;
    }
   
    public void aumentarSueldo(int porcentaje){
        sueldo = sueldo + (sueldo * porcentaje /100);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEpleado() {
        return numEpleado;
    }

    public void setNumEpleado(int numEpleado) {
        this.numEpleado = numEpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override // para saber el contenido
    public String toString() {
        return super.toString()+
                "Empleado{" + "nombre=" + nombre + ", numEpleado=" + numEpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
