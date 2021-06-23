/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author kevin
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int NumeroDeTeclas;
    private int multimedia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int NumeroDeTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.NumeroDeTeclas = NumeroDeTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroDeTeclas() {
        return NumeroDeTeclas;
    }

    public void setNumeroDeTeclas(int NumeroDeTeclas) {
        this.NumeroDeTeclas = NumeroDeTeclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", NumeroDeTeclas=" + NumeroDeTeclas + ", multimedia=" + multimedia + '}';
    }


    
    
}
