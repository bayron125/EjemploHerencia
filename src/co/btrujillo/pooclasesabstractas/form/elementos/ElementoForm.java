package co.btrujillo.pooclasesabstractas.form.elementos;

import co.btrujillo.pooclasesabstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String nombre;
    protected String valor;
    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm(){
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<String> getErrores() {
        return errores;
    }
    public String getNombre(){
        return this.nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public boolean esValido(){
        for(Validador v: validadores){
            if(!v.esValido(this.valor)){
                errores.add(v.getMensaje());
            }
        }
        return errores.isEmpty();
    }

    abstract public String dibujarHtml();

}
