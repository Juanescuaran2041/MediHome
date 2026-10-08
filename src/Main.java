import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(
                "123456789",
                "María Gómez",
                "3001234567",
                "Calle 10 # 20-30",
                "maria.gomez@example.com"
        );

        ProfesionalSalud profesional = new ProfesionalSalud(
                "TP-98765",
                "Medicina general",
                "987654321",
                "Andrés Rodríguez",
                "andres.rodriguez@example.com"
        );

        EquipoAtencion equipo = new EquipoAtencion(
                "EQ-001",
                "Equipo domiciliario norte",
                "Zona norte"
        );
        equipo.agregarProfesionalSalud(profesional);

        LocalDateTime fechaAtencion = LocalDateTime.now().withSecond(0).withNano(0);
        ServicioDomiciliario servicio = new ServicioDomiciliario(
                "SRV-001",
                fechaAtencion,
                paciente.getDireccionPrincipal(),
                "Control médico general",
                EstadoServicio.SOLICITADO
        );
        servicio.setPaciente(paciente);
        servicio.programarServicio(fechaAtencion);
        servicio.setEstado(EstadoServicio.PROGRAMADO);
        servicio.asignarProfesional(profesional);

        servicio.iniciarServicio();

        AtencionMedica atencion = new AtencionMedica(
                fechaAtencion,
                fechaAtencion.plusMinutes(30),
                "Paciente en buen estado general.",
                "Mantener hidratación y continuar con los controles."
        );
        SignosVitales signosVitales = new SignosVitales(
                fechaAtencion,
                36.7,
                72,
                120,
                98.0,
                80
        );
        atencion.registrarSignosVitales(signosVitales);
        signosVitales.registrarMedicion();
        servicio.setAtencionMedica(atencion);

        servicio.finalizar();

        System.out.println("\nEquipo asignado: " + equipo.getNombre());
        System.out.println(servicio.generarReporte());
    }
}
