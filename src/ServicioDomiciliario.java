import java.time.LocalDate;

public class ServicioDomiciliario {
    private String codigo;
    private LocalDate fechaProgramada;
    private String direccionAtencion;
    private String motivo;
    private EstadoServicio estado;

    private Paciente paciente;
    private ProfesionalSalud profesionalSalud;

    private AtencionMedica atencionMedica;

    public ServicioDomiciliario(String codigo, LocalDate fechaProgramada, String direccionAtencion, String motivo, EstadoServicio estado) {
        this.codigo = codigo;
        this.fechaProgramada = fechaProgramada;
        this.direccionAtencion = direccionAtencion;
        this.motivo = motivo;
        this.estado = estado;
    }

    public LocalDate getFechaProgramada() {
        return fechaProgramada;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDireccionAtencion() {
        return direccionAtencion;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaProgramada(LocalDate fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public void setDireccionAtencion(String direccionAtencion) {
        this.direccionAtencion = direccionAtencion;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public ProfesionalSalud getProfesionalSalud() {
        return profesionalSalud;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesionalSalud(ProfesionalSalud profesionalSalud) {
        this.profesionalSalud = profesionalSalud;
    }

    public AtencionMedica getAtencionMedica() {
        return atencionMedica;
    }

    public void setAtencionMedica(AtencionMedica atencionMedica) {
        this.atencionMedica = atencionMedica;
    }

    public void programarServicio(LocalDate fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
        System.out.println("Servicio domiciliario programado para: " + fechaProgramada);
    }

    public void asignarProfesional(ProfesionalSalud profesionalSalud) {
        this.profesionalSalud = profesionalSalud;
        System.out.println("Profesional de salud asignado: " + profesionalSalud.getNombre());
    }

    public void iniciarServicio() {
        this.estado = EstadoServicio.EN_PROGRESO;
        System.out.println("Servicio domiciliario iniciado.");
    }

    public void finalizarServicio() {
        this.estado = EstadoServicio.FINALIZADO;
        System.out.println("Servicio domiciliario finalizado.");
    }
}
