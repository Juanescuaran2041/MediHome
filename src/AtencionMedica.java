import java.time.LocalDateTime;

public class AtencionMedica {
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String observacion;
    private String recomendacion;

    private SignosVitales signosVitales;


    public AtencionMedica(LocalDateTime fechaInicio, LocalDateTime fechaFin, String observacion, String recomendacion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observacion = observacion;
        this.recomendacion = recomendacion;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public String getObservacion() {
        return observacion;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }
}
