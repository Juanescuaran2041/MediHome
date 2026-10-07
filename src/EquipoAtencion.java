public class EquipoAtencion {
    private String codigo;
    private String nombre;
    private String zonaAtencion;

    private ProfesionalSalud profesionalSalud;

    public EquipoAtencion(String codigo, String nombre, String zonaAtencion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.zonaAtencion = zonaAtencion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getZonaAtencion() {
        return zonaAtencion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZonaAtencion(String zonaAtencion) {
        this.zonaAtencion = zonaAtencion;
    }

    public void AgregarProfesional (ProfesionalSalud profesionalSalud) {
        this.profesionalSalud = profesionalSalud;
    }

    public void retirarProfesional() {
        this.profesionalSalud = null;
    }
}
