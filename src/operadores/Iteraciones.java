package operadores;

public class Iteraciones {

    // for
    private static void forLopp(int numero){
        // 1,2,3,4,5
        // 1er it -> 1
        // 2da it -> 2
        // ... ult it -> 5

        //sintaxis de un for
        // for(inicializar un valor;  expresion booleana; iteracion) {
        //     operaciones....
        // }

        // Tengo un numero y quiero mostrar en pantalla toda su numeracion hasta llegar a el
        // entrada: 5 y debe mostrar 1,2,3,4,5

        for(int i = 0; i <= numero; i++) { //1,2,3,4,5
            System.out.println(i);
        }
    }

    public static void whileLoop(int numero) {
        // while(expresion_booleana){
        //      operaciones
        // }
        int i = 0;
        while(i <= numero){ // ciclo infinito //15
            System.out.println(i); //0, 3,6, 9, 12, 15,
            i+=3;
        }
    }


    // al menos se ejecuta una vez
    public static void doWhileLopp(int numero) {
        // do {
        //      operaciones
        // } while (expresion_booleana)
        int i = 6;
        do { // ciclo infinito //15
            System.out.println(i); //0, 3,6, 9, 12, 15,
        } while (i <= numero);
    }

    public static void main(String[] args) {
        System.out.println("--------------for-------------------");
        forLopp(5);
        System.out.println("--------------while-------------------");
        whileLoop(5);
        System.out.println("--------------do while-------------------");
        doWhileLopp(5);
    }
}
