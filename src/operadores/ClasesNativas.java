package operadores;

import java.time.LocalDate;
import java.util.Date;

public class ClasesNativas {

    // Strings o de Texto
    static String texto = "Hola";

    // Numeros
    static Integer intNumber = 10;
    Double x = 10.10;
    float f = 12;
    Short shortNumer;
    Long longNumber;

    // Fechas
    static LocalDate fecha = LocalDate.now();

    public static void main(String[] args) {

        System.out.println(intNumber.compareTo(10)); //intNumber ==10
        System.out.println(intNumber.toString());
        System.out.println(Integer.compare(intNumber, 10)); // intNumber ==10

        System.out.println(String.join("Hola", " Mundo", " Soy ", "Deya"));
        // "Hola" + " Mundo"
        System.out.println(texto.toLowerCase()); // convierte todo a minusculas
        System.out.println(texto.toUpperCase()); // convierte todo a mayusculas
        System.out.println(texto.charAt(2)); // regresar un caracter en la posicion 2
        System.out.println(texto.equalsIgnoreCase("holA")); // no le importa el formato hola == hola
        System.out.println(texto.isEmpty());// regresa true si el texto esta vacio
        System.out.println(texto.length()); // regresa el tamanio del texto
        System.out.println(texto.replace("H", "h"));
        System.out.println(fecha);

        System.out.println(String.join("Hola", " Mundo ", "\nSoy ", "Deya"));
        // \n pasar linea
        // \t tabulador

    }

}
