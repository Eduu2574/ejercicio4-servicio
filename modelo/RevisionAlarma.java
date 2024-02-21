package modelo;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    int numAlarmasRevisar;

    public RevisionAlarma(String cliente, int numAlarmasRevisar) {
        super(cliente);
        this.numAlarmasRevisar = numAlarmasRevisar;
        this.trabajador="Revisor Especialista Contraincendios";
    }
}