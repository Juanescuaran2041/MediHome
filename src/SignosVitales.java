import java.time.LocalDateTime;

public class SignosVitales {
    private LocalDateTime fecha;
    private double temperatura;
    private int frecuenciaCardiaca;
    private int presionSistolica;
    private int presionDiastolica;
    private double SaturacionOxigeno;

    public SignosVitales(LocalDateTime fecha, double temperatura, int frecuenciaCardiaca, int presionSistolica, double saturacionOxigeno, int presionDiastolica) {
        this.fecha = fecha;
        this.temperatura = temperatura;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presionSistolica = presionSistolica;
        SaturacionOxigeno = saturacionOxigeno;
        this.presionDiastolica = presionDiastolica;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getPresionSistolica() {
        return presionSistolica;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public int getPresionDiastolica() {
        return presionDiastolica;
    }

    public double getSaturacionOxigeno() {
        return SaturacionOxigeno;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public void setPresionSistolica(int presionSistolica) {
        this.presionSistolica = presionSistolica;
    }

    public void setPresionDiastolica(int presionDiastolica) {
        this.presionDiastolica = presionDiastolica;
    }

    public void setSaturacionOxigeno(double saturacionOxigeno) {
        SaturacionOxigeno = saturacionOxigeno;
    }

    public void registrarMedicion() {
        System.out.println("Medición registrada: " + fecha);
    }
}
