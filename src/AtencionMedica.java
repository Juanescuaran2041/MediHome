import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AtencionMedica {
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String observaciones;
    private String recomendaciones;

    private List<SignosVitales> signosVitales = new ArrayList<>();


    public AtencionMedica(LocalDateTime fechaInicio, LocalDateTime fechaFin, String observaciones, String recomendacion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observaciones = observaciones;
        this.recomendaciones = recomendacion;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public List<SignosVitales> getSignosVitales() {
        return signosVitales;
    }

    public void registrarSignosVitales(SignosVitales signosVitales) {
        if (signosVitales == null) {
            throw new IllegalArgumentException("La medición de signos vitales no es correcta");
        }

        this.signosVitales.add(signosVitales);
    }
}
