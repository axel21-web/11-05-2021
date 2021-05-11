/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edeu.ni.programacion2.activofx.Controller.pojo;

/**
 *
 * @author Sistemas-31
 */
public class Activo {
    private String Nombre, tipo;
    private float valorA;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValorA() {
        return valorA;
    }

    public void setValorA(float valorA) {
        this.valorA = valorA;
    }

    public float getValorS() {
        return ValorS;
    }

    public void setValorS(float ValorS) {
        this.ValorS = ValorS;
    }
    private float ValorS;

    public Activo(String Nombre, String tipo, int valorA, float ValorS) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.valorA = valorA;
        this.ValorS = ValorS;
    }
    
}
