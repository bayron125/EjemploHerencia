package co.btrujillo.pooclasesabstractas.form.elementos;

abstract public class ElementoForm {

    protected String nombre;
    protected String valor;

    public ElementoForm(){
    }

    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml()

}
