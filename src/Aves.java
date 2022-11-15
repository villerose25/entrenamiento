public class Aves extends Mascota{


    public Aves() {
        super("Ave", "Soy un ave");
        setVolar(true);
    }

    public Aves(String nombre) {
        super("Ave", nombre);
        setVolar(true);
    }

    public boolean getVolar() {
        return true;
    }
}
