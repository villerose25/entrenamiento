/**
 * mi clase de la sesion1
 */
public class Sesion1 {
    String miVariable;
    // Constructor -> Siempre se llama igual que la clase y no son funciones ni metodos.
    // Inicializadores!
    public Sesion1() { //no recibo ningun argumento
        miVariable = "Hola ";
        System.out.println("Hola");
    }

    /**
     * Este constructor recibe el nombre de la persona
     * @param nombre
     */
    public Sesion1(String nombre) { // recibe un argumento
        System.out.println("Hola  "  + nombre);
    }

    public Sesion1(String nombre, int edad) {
        System.out.println("Hola" + " "  + nombre + " y tengo " + edad);
    }
}
