package questao1;
import java.util.Stack;

public class Caminhao{
    
    private String placa;
    private String nome;
    private Stack<Carga> pilhacarga;

    public Caminhao(String nome, String placa,Stack<Carga> pilhacarga){
        this.nome = nome;
        this.placa = placa;
        this.pilhacarga = new Stack<>();
    }
    
    public String getPlaca() {
        return placa;
    }

    public String getNome(){
        return nome;
    }

    public void adicionarCarga(Carga carga){
        pilhacarga.push(carga);
    }

    public Carga removerCarga(){
        return pilhacarga.pop();
    }

    public boolean temCarga(){
        return !pilhacarga.isEmpty();
    }
}
