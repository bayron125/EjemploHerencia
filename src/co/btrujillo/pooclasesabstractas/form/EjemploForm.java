package co.btrujillo.pooclasesabstractas.form;

import co.btrujillo.pooclasesabstractas.form.elementos.*;
import co.btrujillo.pooclasesabstractas.form.elementos.select.Opcion;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        lenguaje.addOpcion(new Opcion("1", "java"))
                .addOpcion(new Opcion("2", "phyton").setSelected())
                .addOpcion(new Opcion("3","javaScript"))
                .addOpcion( new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "php"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value =\""+ this.valor+ "\">";
            }
        };

        saludar.setValor("Hola que tal, este campo esta deshabilitado");
        username.setValor("bayron125");
        password.setValor("lacosapeluda123");
        email.setValor("bayron125@hotmail.com");
        edad.setValor("26");
        experiencia.setValor("...mas de 10 años de experiencia...");

        System.out.println();

        List <ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);


        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

    }
}
