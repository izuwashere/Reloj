
package modelo;


public class tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public tiempo() {
    }

    public tiempo(double hora, double minutos, double segundos) {
        this.hora = (int) hora;
        this.minutos = (int) minutos;
        this.segundos = (int) segundos;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = (int) hora;
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = (int) minutos;
    }

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = (int) segundos;
    }
 
}
