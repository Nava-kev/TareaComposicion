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
public class Computadora {
    private String Marca;
    private String Modelo;
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String Marca, String Modelo, CPU cpu, Monitor monitor, Mouse mouse, Teclado teclado) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.cpu = cpu;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
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

    @Override
    public String toString() {
        return "Computadora{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", cpu=" + cpu + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }
    
    
    
    
    
    
    
    
    
}
