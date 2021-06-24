package factory.model;

public abstract class Pessoa {
    public String nome;
    public String sexo;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}