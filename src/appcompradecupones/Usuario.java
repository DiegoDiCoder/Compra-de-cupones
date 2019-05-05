/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcompradecupones;

/**
 *
 * @author diego
 */
public class Usuario {
    String nombre;
    int CI;
    String clave;
    int cupones;

    public Usuario() {
    }

    public Usuario(String nombre, int CI, String clave, int cupones) {
        this.nombre = nombre;
        this.CI = CI;
        this.clave = clave;
        this.cupones = cupones;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCupones() {
        return cupones;
    }

    public void setCupones(int cupones) {
        this.cupones = cupones;
    }
    
    public void Compramaxima(int CI,int cupones){
        
        if (cupones==5){
            System.out.println("Error usted no puede adquirir mas de 5 cupones del mismo descuento"); //Esto deberia ser una ventana emergente
        }
        
    }
    
}
