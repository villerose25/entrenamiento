package autos;

import com.sun.deploy.security.SelectableSecurityManager;
import javafx.scene.SubScene;

public class Carro {

    // propiedades
    String color;
    public int numeroLlantas;
    int numeroPuertas;
    String modelo;
    String vin;
    String tipoCombustible;
    int velocidadMaxima;
    String nombre;

    boolean encendido = false;

    enum TipoCombustible {
        Gasolina,
        Gas,
        Diesel,
        NoAplica,
        NoSeleccionado
    }

    // metodos de obtener y colocar informacion
    // get / set
    String getColor() {
        return color;
    }

    public void setColor(String valorColor) {
        this.color = valorColor; //
    }

    int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas; //
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public Carro(String nombre) {
        this.nombre = nombre;
        System.out.println("Soy un " + nombre);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTipoCombustible(int tipoCombustible) {
        switch (tipoCombustible) {
            case 1:
                this.tipoCombustible = "Gasolina";
                break;
            case 2:
                this.tipoCombustible = "Diesel";
                break;
            case 3:
                this.tipoCombustible = "Gas";
                break;
            case 4:
                this.tipoCombustible = "No aplica";
                break;
            default:
                this.tipoCombustible = "No seleccionado";
                break;
        }

    }

    public int getVelocidadMaxima() {
        // Manejo de errores
        // try { } --> intenta hacer esto
        // catch (Exception ex) {}--> atrapa el error
        try {
            if(velocidadMaxima == 0)
                throw new Exception("No se ha establecido una velocidad maxima");

            return velocidadMaxima;
        } catch (Exception e) {
            return -1;
        }

    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void avanzar() {
        if(encendido)
            System.out.println("Avanzando...");
        else
            System.out.println("El coche esta apagado.");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }
}
