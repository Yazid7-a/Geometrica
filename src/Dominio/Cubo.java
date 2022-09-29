/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Cubo {
    
    public int ancho;
    public int alto;
    public int profundo;

    public Cubo() {
    }

    public Cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cubo{");
        sb.append("ancho=").append(ancho);
        sb.append(", alto=").append(alto);
        sb.append(", profundo=").append(profundo);
        sb.append('}');
        return sb.toString();
    }
    
    public int calcularVolumen(int ancho, int alto, int profundo){
        return ancho * alto * profundo;
    }
}
