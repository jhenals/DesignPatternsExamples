package designPatterns.adapter.Riproduttore;

public class LettoreMultimediale implements  Riproduttore{

    AvviaRiproduzioneAudio avviaRiproduzioneAudio = new AvviaRiproduzioneAudio();
    AvviaRiproduzioneVideo avviaRiproduzioneVideo = new AvviaRiproduzioneVideo();
    AvviaRiproduzioneFoto avviaRiproduzioneFoto = new AvviaRiproduzioneFoto();

    @Override
    public void riproduci(String tipo, String nomeFile) {
        if( tipo.equalsIgnoreCase("mov")){
            avviaRiproduzioneVideo.riproduciVideo(nomeFile);
        } else if (tipo.equalsIgnoreCase("mp3")) {
            avviaRiproduzioneAudio.riproduciAudio(nomeFile);
        } else if (tipo.equalsIgnoreCase("jpeg")) {
            avviaRiproduzioneFoto.riproduciFoto(nomeFile);

        }
    }

    public static void main(String[] args) {
        LettoreMultimediale lm = new LettoreMultimediale();
        lm.riproduci("mov", "tutorial.mov");
        lm.riproduci("mp3", "myPodcast.mp3");
        lm.riproduci("jpeg", "myPhoto.jpeg");
    }
}
