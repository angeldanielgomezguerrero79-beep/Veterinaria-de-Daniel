public class Gato extends Animal{
    private String Tipo;


    public Gato() {
    }

    public Gato(int edad, String nombrePropietario, String nombre, double peso, String tipo) {
        super(edad, nombrePropietario, nombre, peso);
        Tipo = tipo;
    }


    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    @Override
    public String  toString() {
        return "Gato{" +
                "Tipo='" + Tipo + '\'' +
                '}';
    }

//metodos propios
    public double CalcularAlimento(){
        return peso *15;

    }

    public void MostrarInformacion(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kl");
        System.out.println("Nombre propietario: " + NombrePropietario);
        System.out.println("Tipo: " + Tipo);
    }
}
