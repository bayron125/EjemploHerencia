package co.btrujillo.pooclasesabstractas.form.validador;

public class LargoValidador extends Validador{
    private String mensaje= "el campo debe contener entre %d y %d caracteres";
    private int min;
    private int max =Integer.MAX_VALUE;

    public LargoValidador(){

    }

    public LargoValidador(int min, int max){
        this.min=min;
        this.max=max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMensaje(String mensaje) {

    }

    @Override
    public String getMensaje(){
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor){
        this. mensaje= String.format(this.mensaje, this.min, this.max);
        if(valor ==null){
            return true;
        }
        int largo = valor.length();
        return(largo>=this.min&& largo<=max);
    }
}
