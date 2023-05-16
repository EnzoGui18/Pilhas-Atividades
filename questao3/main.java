package questao3;

public class main {
    public static void main(String[] args) {
        AplicativoNota appNota = new AplicativoNota();

        Nota nota1 = new Nota(6);
        Nota nota2 = new Nota(10);
        Nota nota3 = new Nota(7);

        appNota.adicionarNota(nota1);
        appNota.adicionarNota(nota2);
        appNota.adicionarNota(nota3);

        
        appNota.exibirNotasEmOrdemInversa();
    }
}
   