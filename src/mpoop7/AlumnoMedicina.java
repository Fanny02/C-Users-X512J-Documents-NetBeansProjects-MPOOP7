/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop7;

/**
 *
 * @author Estefany Zavala 
 * @ version 1.2 23.06.2021
 */
public class AlumnoMedicina extends Alumno{
    private String instrumento;

    public AlumnoMedicina() {
    }

    public AlumnoMedicina(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
    
    public void curar(){
        System.out.println("Hoy es un buen dia para slavar vidas");
    }

    @Override
    public String toString() {
        return super.toString()+ "AlumnoMedicina{" + "instrumento=" + instrumento + '}';
    }
    
    
}
