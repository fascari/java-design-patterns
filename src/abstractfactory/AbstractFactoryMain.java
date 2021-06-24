package abstractfactory;

import abstractfactory.model.FabricaDeCarro;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFiat();
        var sedan = fabrica.criarCarroSedan();
        var popular = fabrica.criarCarroPopular();

        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();

        fabrica = new FabricaFord();
        sedan = fabrica.criarCarroSedan();
        popular = fabrica.criarCarroPopular();

        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
    }
}
