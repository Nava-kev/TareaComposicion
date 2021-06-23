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
public class Mouse {
    private String Marca;
    private String Modelo;
    private String tipo;

    public Mouse() {
    }

    public Mouse(String Marca, String Modelo, String tipo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mouse{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", tipo=" + tipo + '}';
    }

}
