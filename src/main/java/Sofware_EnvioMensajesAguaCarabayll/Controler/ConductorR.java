/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sofware_EnvioMensajesAguaCarabayll.Controler;

/**
 *
 * @author Elvis
 */
public class ConductorR  extends Persona{
    private int edad;
    private String numero_licencia;

    public ConductorR(int edad, String numero_licencia, String Nombre, String apellido, String dni) {
        super(Nombre, apellido, dni);
        this.edad = edad;
        this.numero_licencia = numero_licencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }
    
}
