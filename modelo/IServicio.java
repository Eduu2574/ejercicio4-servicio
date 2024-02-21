package modelo;
public interface IServicio {
    public abstract double costeMaterial();

    public abstract double costeManoObra();

    public abstract double costeTotal();

    public abstract String detalleServicio();
}
