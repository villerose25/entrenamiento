 public class Metodos {

    // Tener una responsabilidad propia.
    // modificador public, privado, protected --> encapsulamiento?
    // tipo de dato --> opcional, solo cuando son funciones
    // nombre -> pascalCase iniciar con minuscula, despues mayusculas
    // parametros --> opcionales

    // puede ser ser visible desde cualquier parte
    public void sumaDeDosNumeros() {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero1 + numero2);
    }

    // que solo se utiliza en el proyecto que se encuentra.
    // donde se importa
    protected void sumaDeDosNumeros(int numero1, int numero2) {
        System.out.println(numero1 + numero2);
    }

    // privados solo se pueden ver en la clase contenedora
    private static void restaDeDosNumeros(int numero1, int numero2) {
        System.out.println(numero1 - numero2);
    }

    // Los metodos estaticos, no necesitan ser instanciados
     public static void restaDeDosNumerosStatico(int numero1, int numero2) {
         System.out.println(numero1 - numero2);
     }


     public static void main(String[] args) {
        restaDeDosNumeros(1,1);
    }


    // Funcion Tiene logica, proceso interno, serie de pasos para realizar algo
     // una funcion siempre regresa un valor/objeto
     // 1. identificador
     // 2. tipo de dato/objeto que se va a regresar
     // 3. nombre de la funcion
     public int sumaDeDosNumerosFunction(int numero1,int numero2) {
        int sumatoria = numero1 + numero2;
        return sumatoria;
        //return numero1 + numero2;
     }

     public boolean isReady(String ready) {
        if(ready == "Ok" )
            return true;

        return false;
     }
}
