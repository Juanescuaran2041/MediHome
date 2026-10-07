import java.util.ArrayList;
import java.util.List;

public class EquipoAtencion {
    private String codigo;
    private String nombre;
    private String zonaAtencion;

    private List<ProfesionalSalud> listaProfesionalSalud = new ArrayList<>();

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

    public void AgregarProfesional (ProfesionalSalud profesionalSalud){

        if (profesionalSalud == null) {
            throw new IllegalArgumentException("El profesional registrado no es correcto");
        }

        listaProfesionalSalud.add(profesionalSalud);
    }

    public List<ProfesionalSalud> getListaProfesionalSalud() {
        return listaProfesionalSalud;
    }

    public void retirarProfesional (ProfesionalSalud profesionalSalud){
        if (profesionalSalud == null) {
            throw new IllegalArgumentException("El profesional registrado no es correcto");
        }
        if (!this.listaProfesionalSalud.contains(profesionalSalud)) {
            throw  new  IllegalArgumentException("El profesional no se encuentra registrado actualmente");
        }

        listaProfesionalSalud.remove(profesionalSalud);
    }
}
