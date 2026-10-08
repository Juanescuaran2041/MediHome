import java.util.ArrayList;
import java.util.List;

public class EquipoAtencion {
    private String codigo;
    private String nombre;
    private String zonaCobertura;

    private List<ProfesionalSalud> listaProfesionalSalud = new ArrayList<>();

    public EquipoAtencion(String codigo, String nombre, String zonaCobertura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.zonaCobertura = zonaCobertura;
        this.listaProfesionalSalud = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public List<ProfesionalSalud> getListaProfesionalSalud() {
        return listaProfesionalSalud;
    }

    public void agregarProfesionalSalud(ProfesionalSalud profesionalSalud) {
        if (profesionalSalud == null) {
            throw new IllegalArgumentException("El profesional registrado no es correcto");
        }

        listaProfesionalSalud.add(profesionalSalud);
    }
    public void retirarProfesionalSalud(ProfesionalSalud profesionalSalud) {
        if (profesionalSalud == null) {
            throw new IllegalArgumentException("El profesional registrado no es correcto");
        }
        if (!this.listaProfesionalSalud.contains(profesionalSalud)) {
            throw new IllegalArgumentException("El profesional no se encuentra registrado actualmente");
        }

        listaProfesionalSalud.remove(profesionalSalud);
    }
}
