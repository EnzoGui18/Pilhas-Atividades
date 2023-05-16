package questao2;

public class main {
    public static void main(String[] args) {
        Acoes acoes = new Acoes();

        acoes.executarAcao("Correr");
        acoes.executarAcao("Passar pagina");
        acoes.executarAcao("Sambar");

        acoes.removerUltimaAcao();
        acoes.removerUltimaAcao();

    }
}
