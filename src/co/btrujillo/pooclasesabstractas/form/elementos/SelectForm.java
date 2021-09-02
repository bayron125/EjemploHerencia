package co.btrujillo.pooclasesabstractas.form.elementos;
import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<String> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<String>();
    }

    public SelectForm(String nombre, List<String> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    @Override
    public String dibujarHtml() {
        return null;
    }
}
