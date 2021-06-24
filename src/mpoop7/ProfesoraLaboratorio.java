 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop7;

/**
 *
 * @author Estefany Zavala
 * @version 1.2 23.06.2021
 *
 */
public class ProfesoraLaboratorio extends Profesor {
    private String lab;

    public ProfesoraLaboratorio() {
    }

    public ProfesoraLaboratorio(String lab) {
        this.lab = lab;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }
    
    public void usoBata(){
        System.out.println("Voy con bata");
    }

    @Override
    public String toString() {
        return super.toString()+ "ProfesoraLaboratorio{" + "lab=" + lab + '}';
    }  
}
