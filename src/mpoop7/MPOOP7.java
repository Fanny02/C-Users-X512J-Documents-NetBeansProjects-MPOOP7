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
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ger1 = new Gerente();
        ger1.setNombre("Raul");
        ger1.setNumEpleado(9876);
        ger1.setSueldo(15000);
        System.out.println(ger1);
        ger1.asignarPresupuesto(100000);
        System.out.println(ger1);
        System.out.println("Pesupuesto: " + ger1.getPresupuesto());
        
        
        System.out.println("##############");
        Gerente ger2 = new Gerente (500000,"Julieta",15, 30000);
        System.out.println(ger2);
        ger2.aumentarSueldo(10);
        System.out.println(ger2);
        
        
        System.out.println("###########################");
        Gerente ger3 = new Gerente();
        if(ger3 instanceof Gerente){
            System.out.println("Es una instancia de Gerente");
            
        }if(ger3 instanceof Empleado){
            System.out.println("Es una instancia de Empleado");
        }else{
            System.out.println("No es instancia de Empleado");
        }if (ger3 instanceof Object){
            System.out.println("Si es una instancia de Object");
        } else{
            System.out.println("No es instancia de Object");
        }

        System.out.println("**********Actividad*************");
        //alunmno
        AlumnoIngenieria al1 = new AlumnoIngenieria();
        //System.out.println(al);
        //Alumno al1 = new Alumno();
        //System.out.println(al1);
        al1.setNombre("Estefany");
        al1.setEdad(20);
        al1.setGenero("Femenino");
        //System.out.println(al1);
        al1.setNumCuenta(317179723);
        al1.setTieneBeca(false);
        //System.out.println(al1);
        al1.setCircuito("Electrico");
        System.out.println(al1);
        
        AlumnoMedicina al2 = new AlumnoMedicina();
        al2.setNombre("Alejandra");
        al2.setEdad(20);
        al2.setGenero("Femenino");
        al2.setNumCuenta(317165463);
        al2.setTieneBeca(true);
        al2.setInstrumento("Bisturi");
        System.out.println(al2);
        
        //profesor
        ProfesorTeoria pt = new ProfesorTeoria();
        pt.setNombre("Marco");
        pt.setEdad(45);
        pt.setGenero("Masculino");
        pt.setNumEmpleado(456897845);
        pt.setSueldo(30000);
        pt.setNumSalon("A203");
        System.out.println(pt);
        
        ProfesoraLaboratorio pl = new ProfesoraLaboratorio();
        pl.setNombre("Elena");
        pl.setEdad(35);
        pl.setGenero("Femenino");
        pl.setNumEmpleado(468795231);
        pl.setSueldo(25000);
        pl.setLab("Termodinamica");
        System.out.println(pl);
        
        //instancias
        Alumno al3 = new Alumno();
        if (al3 instanceof Alumno){
            System.out.println("Es una instancia de Alumno");
        } if(al3 instanceof Persona) {
            System.out.println("Es una intancia de Persona");
        } else {
            System.out.println("No es instancia de Persona");
        } if (al3 instanceof Object){
            System.out.println("Es una instancia de Object");
        } else {
            System.out.println("No es una instancia de Object");
        }
        System.out.println("##########");
        AlumnoIngenieria al4 = new AlumnoIngenieria();
        if (al4 instanceof Alumno){
            System.out.println("Es una instancia de Alumno");
        } if(al4 instanceof Persona) {
            System.out.println("Es una intancia de Persona");
        } else {
            System.out.println("No es instancia de Persona");
        } if (al4 instanceof Object){
            System.out.println("Es una instancia de Object");
        } else {
            System.out.println("No es una instancia de Object");
        }
        
        
        
        
        
    }
    
}
