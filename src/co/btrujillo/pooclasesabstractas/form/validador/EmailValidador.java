package co.btrujillo.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "el formato es invalido";
    private static final String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
