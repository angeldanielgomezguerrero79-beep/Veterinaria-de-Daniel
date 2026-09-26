public class Animal {
    protected String Nombre;
    protected  int edad;
    protected double peso;
    protected String NombrePropietario;


    public Animal() {
    }


    public Animal(int edad, String nombrePropietario, String nombre, double peso) {
        this.edad = edad;
        NombrePropietario = nombrePropietario;
        Nombre = nombre;
        this.peso = peso;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombrePropietario() {
        return NombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        NombrePropietario = nombrePropietario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                ", Nombre='" + Nombre + '\'' +
                ", peso=" + peso +
                ", NombrePropietario='" + NombrePropietario + '\'' +
                '}';
    }

    //Metodos propios
    public void MostrarInformacion(){
        System.out.println("Nombre" + Nombre);
        System.out.println("Edad" + edad);
        System.out.println("Peso" + peso);
        System.out.println("Nombre propietario" + NombrePropietario);
    }



}
