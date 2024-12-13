class Traghetto {
    public void viaggia(GruppoTuristi gruppo) {
        gruppo.notifica("Partenza dal porto verso l'isola.");
    }

    public void ritorna(GruppoTuristi gruppo) {
        gruppo.notifica("Ritorno al porto per il prossimo gruppo.");
    }
}