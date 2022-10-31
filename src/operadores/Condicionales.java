package operadores;

import javafx.scene.SubScene;

public class Condicionales {


    public static void main(String[] args) {

        switchCase("Nueva");

    }

    private static void switchCase( String tipoLicencia) {

        switch (tipoLicencia) {
            case "Vencida":
                System.out.println("Necesitas renovar");
                break; //ayuda a salirnos del switch
            case "Nueva":
                System.out.println("OK");
                break;
            case "Por vencer":
                System.out.println("Tu licencia casi vence!");
                break; //ayuda a salirnos del switch
            default:
                System.out.println("No podemos evaluar tu licencia");
        }

    }

    private void ifElse() {
        // If - Else Evaluar varias condiciones
        // if (condicion) {
        //    statements...
        //    instrucciones...
        // } else {
        //    varias instrucciones...
        // }

        int edad = 17;
        // mayor= a 18 anios
        // mayor= de 15 licencia provisional

        if(edad >= 18) {
            System.out.println("Licencia aceptada");
        } else if (edad >= 15) {
            System.out.println("Licencia provisional");
        } else {
            System.out.println("Licencia rechazada");
        }


        if(edad >= 15) {
            if(edad >= 18)
                System.out.println("Licencia aceptada");
            else
                System.out.println("Licencia provisional");
        } else
            System.out.println("Licencia rechazada");


        // ternarios
        // ? --> significa entonces
        // : --> sino
        String resultado = edad >= 15 ? "Licencia provisional" : "Licencia rechazada";
        System.out.println(resultado);

        boolean resultadobooleano = edad >= 18 ? true : false;
    }
}
