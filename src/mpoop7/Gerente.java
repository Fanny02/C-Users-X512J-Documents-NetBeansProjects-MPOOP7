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
public class Gerente extends Empleado{ //
    private float presupuesto;

    public Gerente() {
    }

    public Gerente(float presupuesto, String nombre, int numEpleado, float sueldo) {
        super(nombre, numEpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    private void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void asignarPresupuesto(float presupuesto){
        setPresupuesto(presupuesto);
    }

    @Override
    public String toString() {
        return super.toString () +
                     "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
