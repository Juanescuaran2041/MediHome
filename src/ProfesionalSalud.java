public class ProfesionalSalud extends Usuario implements Notificable {
    private String registroProfeisonal;
    private String especialidad;

    public ProfesionalSalud(String registroProfeisonal, String especialidad,  String identificacion, String nombre, String correo) {
        super(identificacion, nombre, correo);
        this.registroProfeisonal = registroProfeisonal;
    }

    public String getRegistroProfeisonal() {
        return registroProfeisonal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setRegistroProfeisonal(String registroProfeisonal) {
        this.registroProfeisonal = registroProfeisonal;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void notificar(String mensaje){
        System.out.println(mensaje);
    }
}
