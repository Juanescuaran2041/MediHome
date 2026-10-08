public class Paciente extends Usuario implements Notificable{
    private String telefono;
    private String direccionPrincipal;

    public Paciente(String identificacion, String nombre, String telefono, String direccionPrincipal, String correo) {
        super(identificacion, nombre, correo);
        this.telefono = telefono;
        this.direccionPrincipal = direccionPrincipal;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    @Override
    public void notificar(String mensaje){
        System.out.println(mensaje + "Paciente");
    }
}
