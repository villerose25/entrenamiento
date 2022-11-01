package operadores;

// un arreglo solo puede ser de un solo tipo
// Es una lista de elementos dentro de un objeto
// [1,2,3,4,5,6]
// "hola", "hello", "hi", "que onda"
// [ true, true, false, true]
// [String, String, String, String]
// ['h', 'o', 'l', 'a']
public class Arreglos {

    public static void main(String[] args) {

        // [80, 23, 230, 500, 40, 101, 1]
        // arreglo
        // tipo de dato y el nombre
        int[] miArreglo = {80, 23, 230, 500, 40, 101};
                //posicion 0,  1,  2,  3,   4,   5,   6 -> 7 elementos en total
        int miArreglo2[] = {80, 23, 230, 500, 40, 101, 1}; // no es tan recomendable

       // int miArreglo3 = new Integer()[];
        int contador = 0;
        int sumatoria = 0;
        for (int i =0; i <= miArreglo.length - 1; i++) //.length toma el tamanio de nuestro arreglo
        {
            // regresar a pantalla el numero que es mayor a 100
            if(miArreglo[i] >= 100) {
                System.out.println("Es mayor a 100: " + miArreglo[i]);
                contador += 1; // contador = contador + 1;
            }

            sumatoria += miArreglo[i]; // sumatoria + miArreglo[i]; // 0 + 80
            // 80 --> 103 y lo guarda en la variable sumatoria
        }

        // cuantos numeros son mayores a 100
        System.out.println("El total de numeros mayores a 100 son: " + contador); // 3
        System.out.println("El total es: " + sumatoria); // 3


        System.out.println("------------------- for each - --------------------"); // 3
        // for each
        for (int numero : miArreglo) { //aqui no se estan manejando indices, sino elementos del arreglo
            System.out.println(numero);
        }


        //for (int i = miArreglo.length - 1; i >= 0; i--)
        //    System.out.println(miArreglo[i]);
    }


    // Escribir una clase que dado un numero, iterarlo desde 1 hasta ese numero
    // int numero = 10;
    // 1. muestre en pantalla cuales son pares 0... 10 ->salida 2,4,6,8,10
    // 2. muestre cuales se pueden dividir entre 3 -->salida 3,6,9
}
