class Porto {
    public void pagamento(GruppoTuristi gruppo) {
        gruppo.notifica("Pagamento del biglietto completato.");
    }

    public void imbarco(GruppoTuristi gruppo) {
        gruppo.notifica("Imbarco completato.");
    }
}