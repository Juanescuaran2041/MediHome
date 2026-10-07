public class Paciente extends Usuario implements Notificable{
    private String telefono;
    private String direccion;

    public Paciente(String identificacion, String nombre, String telefono, String direccion, String correo) {
        super(identificacion, nombre, correo);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void notificar(String mensaje){
        System.out.println(mensaje + "Paciente");
    }
}
