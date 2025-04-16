package musica; //pacote onde esta a classe

public class Compositor //classe publica = pode ser chamada por outros arquivos
    private String nome;
    private String nacionalidade; //atributos privados, so a classe pode acessa-los

public Compositor(String nome, String nacionalidade) {
    this.nome = nome;
    this.nacionalidade = nacionalidade //construtor pra criar objeto compositor, this significa que acessa atributo classe

    @Override
    public String toString() {
        return "Compositor: " + nome + " | Nacionalidade: " + nacionalidade;
    }
}