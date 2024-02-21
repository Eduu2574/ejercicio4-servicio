package modelo;
import java.time.LocalDate;

public abstract class Servicio {
    String trabajador;
    LocalDate fechaInicio;
    String cliente;

    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public Servicio(String cliente2) {
        //TODO Auto-generated constructor stub
    }

    public abstract double costeMaterial();

    public abstract double costeManoObra();

    public abstract double costeTotal();

    public abstract String detalleServicio();

}