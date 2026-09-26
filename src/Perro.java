public class Perro extends Animal{
    private String Raza;


    public Perro() {
    }

    public Perro(int edad, String nombrePropietario, String nombre, double peso, String raza) {
        super(edad, nombrePropietario, nombre, peso);
        Raza = raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Raza='" + Raza + '\'' +
                '}';
    }

//metodos propios

    public double CalcularDosis(){
        return peso * 2;
    }

    public void MosrarInformacion(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kl");
        System.out.println("Nombre propietario:" + NombrePropietario);
        System.out.println("Raza: " + Raza);
    }
}
