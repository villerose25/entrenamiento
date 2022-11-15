
import autos.*;

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

        // Mandar llamar la clase carro
        /*Carro jetta = new Carro("Jetta");
        jetta.setColor("Rojo");
        jetta.setVin("123123ASDASD123");
        jetta.setTipoCombustible(1);

        Carro mustang = new Carro("Mustang");
        mustang.setColor("Blanco");
        mustang.setVin("123123A2DASD123");
        mustang.setTipoCombustible(1);
        mustang.setVelocidadMaxima(220);
        System.out.println(mustang.getVelocidadMaxima());

        jetta.encender();
        jetta.avanzar();
        jetta.frenar();

        mustang.avanzar();


        ICarro tesla = new Tesla();
        tesla.encender();

        // encender con llave
        ICarro carro = new Ford();
        carro.encender();

         */

        Mascota nuevaMascota = new Mamifero("Perro");
        nuevaMascota.setSonido("Woof woof");
        nuevaMascota.setColor("Cafe");
        //nuevaMascota.puedeVolar();

        Mascota perico = new Aves("Perico");
        perico.setSonido("habla");



        System.out.println(perico.puedeVolar() + " y mi sonido es "+ perico.getSonido());
        System.out.println(nuevaMascota.puedeVolar() + " y mi sonido es "+ nuevaMascota.getSonido());


    }

    // Crear una clase Mascota
    // Mandar llamar la clase al menos una vez

    private void Metodos() {
        // poder llamar un metodo, hay que primero llamar su clase.
        // NombreClase elObjeto = new NombreClase();
        Metodos miMetodo = new Metodos();
        //miMetodo.sumaDeDosNumeros(10,12);
        int sumatoria = miMetodo.sumaDeDosNumerosFunction(10,40);
        System.out.println(miMetodo.sumaDeDosNumerosFunction(10,40));
        //Metodos.restaDeDosNumerosStatico(20,10);

        System.out.println(miMetodo.isReady("No"));
        boolean isReady = miMetodo.isReady("Ok"); //-> regresa un true

        if(isReady) // -boolean?
            System.out.println("Esta listo");
    }

    private void sesion1(){
        String miApellido = "Davila";
        // linea que nos indica una salida a pantalla
        System.out.println("Este es mi primer codigo! " + miApellido);


        // instanciar una clase
        Sesion1 miSesionObjeto; // sin inicializar
        miSesionObjeto = new Sesion1();

        Sesion1 miSesionObjeto2 = new Sesion1("Deya");
    }

}