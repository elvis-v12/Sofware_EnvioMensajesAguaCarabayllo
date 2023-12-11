/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sofware_EnvioMensajesAguaCarabayll.Controler;

/**
 *
 * @author Elvis
 */
public class Cisterna {
    private String placa;
    private double capacidad;
    private int grifos;

    public Cisterna(String placa, double capacidad, int grifos) {
        this.placa = placa;
        this.capacidad = capacidad;
        this.grifos = grifos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getGrifos() {
        return grifos;
    }

    public void setGrifos(int grifos) {
        this.grifos = grifos;
    }
    
    
    
}
