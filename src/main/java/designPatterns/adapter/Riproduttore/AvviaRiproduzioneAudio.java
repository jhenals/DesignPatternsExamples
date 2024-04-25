package designPatterns.adapter.Riproduttore;

public class AvviaRiproduzioneAudio implements  RiproduttoreAudio {
    @Override
    public void riproduciAudio(String nomeFile) {
        System.out.println("Riproduce file di nome "+ nomeFile);
    }
}
