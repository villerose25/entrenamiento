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
}
