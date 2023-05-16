package questao3;
import java.util.Stack;

public class AplicativoNota {
    private Stack<Nota> pilhaNotas;

    public AplicativoNota() {
        pilhaNotas = new Stack<>();
    }

    public void adicionarNota(Nota nota) {
        pilhaNotas.push(nota);
    }

    public void exibirNotasEmOrdemInversa() {
        System.out.println("Notas em ordem inversa:");

        while (!pilhaNotas.isEmpty()) {
            Nota nota = pilhaNotas.pop();
            System.out.println("Nota: " + nota.getNota());
        }
    }
}
