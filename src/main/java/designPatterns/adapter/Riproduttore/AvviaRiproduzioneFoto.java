package designPatterns.adapter.Riproduttore;

public class AvviaRiproduzioneFoto implements RiproduttoreFoto {
    @Override
    public void riproduciFoto(String nomeFile) {
        System.out.println("Riproduce il file di nome "+ nomeFile);
    }
}
