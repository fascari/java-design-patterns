package abstractfactory.model;

public interface FabricaDeCarro {
    CarroSedan criarCarroSedan();

    CarroPopular criarCarroPopular();
}