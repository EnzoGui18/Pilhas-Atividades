package questao1;

public class Carga{

    private String descricao;
    private int peso;

    public Carga(String descricao, int peso){
        this.descricao = descricao;
        this.peso = peso;
    }
    public String getDescricao() {
        return descricao;
    }

    public int getPeso() {
        return peso;
    }
}
