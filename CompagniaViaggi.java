import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class CompagniaViaggi {
    private List<GruppoTuristi> gruppi;
    private List<Autobus> autobus;
    private Porto porto;
    private Traghetto traghetto;

    public CompagniaViaggi() {
        this.gruppi = new ArrayList<>();
        this.gruppi.add(new GruppoTuristi("francesi"));
        this.gruppi.add(new GruppoTuristi("tedeschi"));
        this.gruppi.add(new GruppoTuristi("spagnoli"));

        this.autobus = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            this.autobus.add(new Autobus(i));
        }

        this.porto = new Porto();
        this.traghetto = new Traghetto();
    }

    public void gestisciViaggio() {
        for (GruppoTuristi gruppo : gruppi) {
            for (Autobus autobus : this.autobus) {
                autobus.partenza(gruppo);
                autobus.arrivo(gruppo);
                porto.pagamento(gruppo);
                porto.imbarco(gruppo);
                traghetto.viaggia(gruppo);
                traghetto.ritorna(gruppo);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        scriviFile();
    }

    private void scriviFile() {
        Date dataOdierna = new Date();
        try (FileWriter writer = new FileWriter("viaggi.txt", true)) {
            writer.write("Data: " + dataOdierna.toString() + "\n");
            for (GruppoTuristi gruppo : gruppi) {
                writer.write("Viaggio gruppo " + gruppo.getNome() + ": Partenza e ritorno completati.\n");
            }
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
