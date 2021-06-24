package abstractfactory;

import abstractfactory.model.*;

public class FabricaFord implements FabricaDeCarro {
    @Override
    public CarroSedan criarCarroSedan() {
        return new Fusion();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Ka();
    }
}