public class Mascota {
    // Atributos
    String raza;
    String tipo;
    String color;
    int edad;
    boolean ojosColor = false;
    String sonido;
    boolean volar = false;
    String nombre;

    public Mascota(String tipo, String nombre) {
        this.nombre = nombre;
        System.out.println("Soy un " + tipo + " y me llamo " + nombre);
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isOjosColor() {
        return ojosColor;
    }

    public void setOjosColor(boolean ojosColor) {
        this.ojosColor = ojosColor;
    }

    public
    String getSonido() {
        return this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public boolean vuela() {
        return volar;
    }

    public String puedeVolar() {
        if(this.volar)
            return "Puedo volar!!!";
        else
            return "No vuela";
    }
    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}
