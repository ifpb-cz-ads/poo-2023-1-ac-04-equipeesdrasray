class Time {
    String nome;
    String[] jogadores;
    String treinador;
    int posicao;
    String ultimoAdversario;
    String proximoAdversario;

    public void MostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Treinador: " + treinador);
        System.out.println("Posição: " + posicao);
        System.out.println("Jogadores: \n");
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i]);
        }
    }

    public void MostrarProximoAdversario() {
        System.out.println("O próximo adversário será " + proximoAdversario);
    }

    public void MostrarUltimoAdversario() {
        System.out.println("O último adversário foi " + ultimoAdversario);
    }
}
