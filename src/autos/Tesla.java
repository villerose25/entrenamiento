package autos;

// Herencia - inheritance -> Podemos heredar atributos y comportamiento de otras clases.
// para heredar de una clase se usa la palabra extends NombreClase de la cual se va a heredar.
// heredar una interface (polimorfismo) se utiliza la palabra implements NombreClase
public class Tesla extends CochesElectrico implements ICarro{
    int tiempoMaximoDeRecarga = 0;

    public Tesla() {
        super("TipoTesla", "Tesla");
        setTipoCombustible(4);
    }

    public void setTiempoMaximoDeRecarga(int tiempoMaximoDeRecarga) {
        this.tiempoMaximoDeRecarga = tiempoMaximoDeRecarga;
    }

    public int getTiempoMaximoDeRecarga() {
        return tiempoMaximoDeRecarga;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo por medio de un boton.");
    }
}
