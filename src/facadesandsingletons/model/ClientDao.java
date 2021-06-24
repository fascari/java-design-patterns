package facadesandsingletons.model;

public class ClientDao {

    public Client findByCpf(String cpf) {
        return new Client("Felipe Ascari");
    }

}
