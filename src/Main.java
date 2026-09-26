
void main() {
    Perro p1 = new Perro(2, "Daniel", "Bruno", 15, "Husky Siberiano");

    Perro p2 = new Perro();
    p2.setEdad(5);
    p2.setNombrePropietario("Juan");
    p2.setNombre("Rey");
    p2.setPeso(25);
    p2.setRaza("Labrador");

    Gato g1 = new Gato(3, "Chimuelo", "Daniel", 3, "Exterior");

    Gato g2 = new Gato();
    g2.setEdad(8);
    g2.setNombrePropietario("Juan");
    g2.setNombre("Coco");
    g2.setPeso(5);
    g2.setTipo("Interior");

    System.out.println("-------------PERRO---------------------------------------------------------------");
    p1.MosrarInformacion();
    System.out.println("Dosis Recomendada: " + p1.CalcularDosis() + " ml");

    System.out.println("-------------PERRO---------------------------------------------------------------");
    p2.MosrarInformacion();
    System.out.println("Dosis Recomendada: " + p2.CalcularDosis() + " ml");

    System.out.println("-------------GATO---------------------------------------------------------------");
    g1.MostrarInformacion();
    System.out.println("Alimento Recomendado: " + g1.CalcularAlimento() + " gramos");

    System.out.println("-------------GATO---------------------------------------------------------------");
    g2.MostrarInformacion();
    System.out.println("Alimento Recomendado: " + g2.CalcularAlimento() + " gramos");
}