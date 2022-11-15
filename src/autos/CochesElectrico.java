package autos;

public class CochesElectrico extends Carro {

    public CochesElectrico(String modeloCargador, String nombre) {
        // llamar al constructor de la clase madre, (Carro). Utilizando la palabra super();
        super(nombre);
        System.out.println(modeloCargador);
    }
}
