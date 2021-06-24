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
public class ProfesorTeoria extends Profesor {
    private String numSalon;

    public ProfesorTeoria() {
    }

    public ProfesorTeoria(String numSalon) {
        this.numSalon = numSalon;
    }

    public String getNumSalon() {
        return numSalon;
    }

    public void setNumSalon(String numSalon) {
        this.numSalon = numSalon;
    }
    
    public void usoTraje(){
        System.out.println("Voy con traje");
    }
    
     @Override
    public String toString() {
        return super.toString()+"ProfesorTeoria{" + "numSalon=" + numSalon + '}';
    }
}
