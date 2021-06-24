package abstractfactory.model;

public class Ka implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Ká\nFábrica: Ford\nCategoria:Popular");
    }
}