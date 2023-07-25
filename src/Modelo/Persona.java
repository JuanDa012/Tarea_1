/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Persona {

    private String nombreP;
    private String telP;
    private String correoP;

    public Persona() {
    }

    public Persona(String nombreP, String telefonoP, String correoP) {
        this.nombreP = nombreP;
        this.telP = telefonoP;
        this.correoP = correoP;
    }
    
    
    public String getCorreoP() {
        return correoP;
    }

    
    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }


    public String getTelefonoP() {
        return telP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telP = telefonoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return "" + nombreP + ", " + telP + ", " + correoP ;
    }
    

}
