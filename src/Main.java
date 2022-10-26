import com.sun.org.apache.xpath.internal.operations.Bool;

// clase -> es una plantilla que contiene elementos, objeto, metodos, funciones, variables.
// public y class
// Nomenclatura nombre de clases --> Pascal case -> primer letra empiece con mayuscula
public class Main {


    //Variables camelCase
    // Tipo dato nombre de la variable
    // this significa que vamos a hacer uso de algun elemento de la clase
    String miVariable;
    static String miNombre = "Deyanira";
    Character miChar = 'g'; //un solo caracter entre comillas simples
    Integer miEdad = 20;// de tipo entero --> a una clase
    int miEdad2 = 25;//es un objeto de la clase integer
    double miFloat = 10.20 ;// valores con punto decimal //Float
    Boolean miBoleano = true; // false --> 1 o 0

    // Metodos, funciones, variables y constructores
    public static void main(String[] args) {
        String miApellido = "Davila";
        // linea que nos indica una salida a pantalla
        System.out.println("Este es mi primer codigo! " + miApellido);


        // instanciar una clase
        Sesion1 miSesionObjeto; // sin inicializar
        miSesionObjeto = new Sesion1();

        Sesion1 miSesionObjeto2 = new Sesion1("Deya");

    }


}