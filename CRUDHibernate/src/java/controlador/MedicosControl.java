package controlador;


import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.MedicosDao;
import modelo.entidad.Medicos;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class MedicosControl {

    /**
     * Creates a new instance of medicosControl
     */
    private List<Medicos> listaMedicos;
    private Medicos Medicos;

    public MedicosControl() {
        Medicos = new Medicos();
    }

    public List<Medicos> getListaMedicos() {
        MedicosDao ad = new MedicosDao();
        listaMedicos = ad.listarMedicos();
        return listaMedicos;
    }

    public void setListaMedicos(List<Medicos> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public Medicos getMedicos() {
        return Medicos;
    }

    public void setMedicos(Medicos Medicos) {
        this.Medicos = Medicos;
    }

    public void limpiarMedicos() {
        Medicos = new Medicos();
    }

    public void agregarMedicos() {
        MedicosDao ad = new MedicosDao();
        ad.agregar(Medicos);
    }

    public void modificarMedicos() {
        MedicosDao ad = new MedicosDao();
        ad.modificar(Medicos);
        limpiarMedicos();
    }

    public void eliminarMedicos() {
        MedicosDao ad = new MedicosDao();
        ad.eliminar(Medicos);
        limpiarMedicos();
    }
}

