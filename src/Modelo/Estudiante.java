/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juan_david.carvajal
 */
public class Estudiante extends Persona {

    private String codigoE;
    private String carreraE;

    public Estudiante() {
    }

    public Estudiante(String codigoE, String carreraE, String nombreP, String telP, String correoP) {
        super(nombreP, telP, correoP);
        this.codigoE = codigoE;
        this.carreraE = carreraE;
    }
    
    

   
    public String getCarreraE() {
        return carreraE;
    }

    
    public void setCarreraE(String carreraE) {
        this.carreraE = carreraE;
    }

    
    public String getCodigoE() {
        return codigoE;
    }

   
    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + codigoE + ", " + carreraE + ".";
    }
    
}
