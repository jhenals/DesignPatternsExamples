package designPatterns.adapter.Riproduttore;

public class AvviaRiproduzioneVideo implements RiproduttoreVideo {

    @Override
    public void riproduciVideo(String nomeFile) {
        System.out.println("Riproduce il file di nome "+ nomeFile);
    }
}
