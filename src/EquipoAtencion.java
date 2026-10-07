import java.util.ArrayList;
import java.util.List;

public class EquipoAtencion {
    private String codigo;
    private String nombre;
    private String zonaAtencion;

    private List<ProfesionalSalud> listaProfesionalSalud;

    public EquipoAtencion(String codigo, String nombre, String zonaAtencion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.zonaAtencion = zonaAtencion;
        this.listaProfesionalSalud = new ArrayList<>();
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

    public List<ProfesionalSalud> getListaProfesionalSalud() {
        return listaProfesionalSalud;
    }

    public void agregarProfesional(ProfesionalSalud profesionalSalud) {
        listaProfesionalSalud.add(profesionalSalud);
    }

    public void retirarProfesional(ProfesionalSalud profesionalSalud) {
        listaProfesionalSalud.remove(profesionalSalud);
    }
}
