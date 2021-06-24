package abstractfactory.model;

public class Fusion implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Fusion\nFábrica: Ford\nCategoria:Sedan");
    }
}