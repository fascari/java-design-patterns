package factory;

import factory.model.Homem;
import factory.model.Mulher;
import factory.model.Pessoa;

interface FactoryPessoa {

    static Pessoa criarPessoas(String nome, String sexo) {
        if ("M".equals(sexo)) {
            return new Homem(nome);
        }
        if ("F".equals(sexo)) {
            return new Mulher(nome);
        }
        throw new IllegalArgumentException("Tipo de pessoa não esperado.");
    }
}