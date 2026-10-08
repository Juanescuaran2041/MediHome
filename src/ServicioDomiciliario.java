import java.time.LocalDateTime;

public class ServicioDomiciliario {
    private String codigo;
    private LocalDateTime fechaProgramada;
    private String direccionAtencion;
    private String motivo;
    private EstadoServicio estado;

    private Paciente paciente;
    private ProfesionalSalud profesionalSalud;

    private AtencionMedica atencionMedica;

    public ServicioDomiciliario(String codigo, LocalDateTime fechaProgramada, String direccionAtencion, String motivo, EstadoServicio estado) {
        this.codigo = codigo;
        this.fechaProgramada = fechaProgramada;
        this.direccionAtencion = direccionAtencion;
        this.motivo = motivo;
        this.estado = estado;
    }

    public LocalDateTime getFechaProgramada() {
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

    public void setFechaProgramada(LocalDateTime fechaProgramada) {

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

    public void programarServicio(LocalDateTime fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
        System.out.println("Servicio domiciliario programado para: " + fechaProgramada);
    }

    public void asignarProfesional(ProfesionalSalud profesionalSalud) {
        if (profesionalSalud == null) {
            throw new IllegalArgumentException("El profesional asignado no es correcto");
        }
        if (!profesionalSalud.estaDisponible(fechaProgramada)) {
            throw new IllegalStateException("El profesional no está disponible para " + fechaProgramada);
        }

        this.profesionalSalud = profesionalSalud;
        profesionalSalud.agregarServicio(this);
        System.out.println("Profesional de salud asignado: " + profesionalSalud.getNombre());
    }

    public void iniciarServicio() {
        this.estado = EstadoServicio.EN_ATENCION;
        System.out.println("Servicio domiciliario iniciado.");
    }

    public void finalizar() {
        this.estado = EstadoServicio.FINALIZADO;
        System.out.println("Servicio domiciliario finalizado.");
    }

    public void cancelar() {
        if (estado == EstadoServicio.FINALIZADO) {
            throw new IllegalStateException("No se puede cancelar un servicio finalizado");
        }

        this.estado = EstadoServicio.CANCELADO;

        String mensaje = "El servicio " + codigo + " ha sido cancelado.";
        if (paciente != null && profesionalSalud != null) {
            paciente.notificar(mensaje);
            paciente.notificar(mensaje);
        }
    }

    public String generarReporte() {
        String reporte = "------REPORTE DE ATENCIÓN-------\n";
        reporte += "Servicio: " + codigo + "\n";
        reporte += "Fecha programada: " + fechaProgramada + "\n";
        reporte += "Dirección: " + direccionAtencion + "\n";
        reporte += "Motivo: " + motivo + "\n";
        reporte += "Estado: " + estado + "\n";

        reporte += "\n---Paciente---\n";
        if (paciente != null) {
            reporte += "ID: " + paciente.getIdentificacion() + "\n";
            reporte += "Nombre: " + paciente.getNombre() + "\n";
            reporte += "Correo: " + paciente.getCorreo() + "\n";
            reporte += "Teléfono: " + paciente.getTelefono() + "\n";
            reporte += "Dirección principal: " + paciente.getDireccionPrincipal() + "\n";
        } else {
            reporte += "Sin paciente \n";
        }

        reporte += "\n---Profesional salud---\n";
        if (profesionalSalud != null) {
            reporte += "ID: " + profesionalSalud.getIdentificacion() + "\n";
            reporte += "Nombre: " + profesionalSalud.getNombre() + "\n";
            reporte += "Registro profesional: " + profesionalSalud.getRegistroProfesional() + "\n";
            reporte += "Especialidad: " + profesionalSalud.getEspecialidad() + "\n";
        } else {
            reporte += "Sin profesional \n";
        }

        reporte += "\n---Atención médica---\n";
        if (atencionMedica != null) {
            reporte += "Inicio: " + atencionMedica.getFechaInicio() + "\n";
            reporte += "Fin: " + atencionMedica.getFechaFin() + "\n";
            reporte += "Observaciones: " + atencionMedica.getObservaciones() + "\n";
            reporte += "Recomendaciones: " + atencionMedica.getRecomendaciones() + "\n";

            reporte += "\n---Signos vitales---\n";
            for (SignosVitales signos : atencionMedica.getSignosVitales()) {
                reporte += "Medición: " + signos.getFecha() + "\n";
                reporte += "  Temperatura: " + signos.getTemperatura() + "\n";
                reporte += "  Frecuencia cardiaca: " + signos.getFrecuenciaCardiaca() + "\n";
                reporte += "  Presión arterial: " + signos.getPresionSistolica() + "/" + signos.getPresionDiastolica() + "\n";
                reporte += "  Saturación de oxígeno: " + signos.getSaturacionOxigeno() + "\n";
            }
        }
        return reporte;
    }
}
