class Autobus {
    private int numeroBus;

    public Autobus(int numeroBus) {
        this.numeroBus = numeroBus;
    }

    public void partenza(GruppoTuristi gruppo) {
        gruppo.notifica("Partenza dal camping con " + gruppo.getNumeroTuristi() + " turisti.");
    }

    public void arrivo(GruppoTuristi gruppo) {
        gruppo.notifica("Arrivo al porto dei " + gruppo.getNumeroTuristi() + " turisti.");
    }
}