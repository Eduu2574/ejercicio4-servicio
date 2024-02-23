package modelo;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {

    // ATRIBUTOS
    int numAlarmasRevisar;

    // CONSTRUCTOR
    public RevisionAlarma(String cliente, int numAlarmasRevisar) {
        super(cliente);
        this.numAlarmasRevisar = numAlarmasRevisar;
        this.trabajador = "Revisor Especialista Contraincendios";
    }

    // MÉTODOS GET Y SET DE numAlarmasRevisar
    public int getNumAlarmasRevisar() {
        return numAlarmasRevisar;
    }

    public void setNumAlarmasRevisar(int numAlarmasRevisar) {
        this.numAlarmasRevisar = numAlarmasRevisar;
    }

    // MÉTODOS

    public double costeMaterial() {

        return 0;
    }

    public double costeManoObra() {

        return (double) (this.numAlarmasRevisar / 3) * 40;
    }

    public double costeTotal() {

        return this.costeManoObra();
    }

    public String detalleServicio() {
        String cadena = "";
        cadena += "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
        cadena += "Cliente: " + this.cliente + "\n";
        cadena += "Fecha: " + this.fechaInicio + "\n";
        cadena += "----------------------\n";
        cadena += "TOTAL: " + this.costeTotal() + "\n";
        cadena += "----------------------\n";
        return cadena;
    }

}