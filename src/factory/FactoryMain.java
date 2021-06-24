package factory;

import factory.model.Homem;

public class FactoryMain {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------- Begin Test Factory");

        var pessoa = FactoryPessoa.criarPessoas("José", "M");

        if (pessoa instanceof Homem) {
            System.out.println("\nCriou uma pessoa do sexo masculino: " + pessoa.nome);
        }

        System.out.println("--------------------------------------------- End Test Factory");
    }

}
