import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProfesionalSalud extends Usuario implements Notificable {
    private String registroProfesional;
    private String especialidad;

    private List<ServicioDomiciliario> serviciosAsignados = new ArrayList<>();

    public ProfesionalSalud(String registroProfesional, String especialidad,  String identificacion, String nombre, String correo) {
        super(identificacion, nombre, correo);
        this.registroProfesional = registroProfesional;
        this.especialidad = especialidad;
    }

    public String getRegistroProfesional() {
        return registroProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setRegistroProfesional(String registroProfsional) {
        this.registroProfesional = registroProfsional;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<ServicioDomiciliario> getServiciosAsignados() {
        return serviciosAsignados;
    }

    public void agregarServicio(ServicioDomiciliario servicio) {
        if (servicio == null) {
            throw new IllegalArgumentException("El servicio registrado no es correcto");
        }

        serviciosAsignados.add(servicio);
    }

    public boolean estaDisponible(LocalDateTime hora) {
        if (hora == null) {
            throw new IllegalArgumentException("La hora consultada no es correcta");
        }

        for (ServicioDomiciliario servicio : serviciosAsignados) {
            boolean activo = servicio.getEstado() != EstadoServicio.CANCELADO
                    && servicio.getEstado() != EstadoServicio.FINALIZADO;

            if (activo && hora.equals(servicio.getFechaProgramada())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void notificar(String mensaje){
        System.out.println(mensaje);
    }
}
