package questao2;
import java.util.Stack;

public class Acoes{
    private Stack<Acoes> pilha;

    public void PilhaAcoes() {
        this.pilha = new Stack<>();
    }

    public void executarAcao(Acoes string) {
        pilha.push(string);
        System.out.println("Ação executada: " + string);
    }

    public void removerUltimaAcao() {
        if (!pilha.isEmpty()) {
            Acoes ultimaAcao = pilha.pop();
            System.out.println("Desfazendo ação: " + ultimaAcao);
        } else {
            System.out.println("Sem ações!");
        }
    }

    public void executarAcao(String string) {
    }
}

