public class GruppoTuristi {
    private String nome;
    private int numeroTuristi;

    public GruppoTuristi(String nome) {
        this.nome = nome;
        this.numeroTuristi = 25;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTuristi() {
        return numeroTuristi;
    }

    public void notifica(String messaggio) {
        System.out.println(nome.substring(0, 1).toUpperCase() + nome.substring(1) + ": " + messaggio);
    }
}
