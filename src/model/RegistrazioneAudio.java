package model;

public class RegistrazioneAudio extends ElementoMultimediale implements RiproduciElemento {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;

    }
    public void aumentaVolume() {
        volume++;
    }
    public void abbassaVolume() {
        volume--;
    }


//    private String repeat(String str, int count) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < count; i++) {
//            result.append(str);
//        }
//        return result.toString();
//    }



    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
//            System.out.println(titolo + " " + repeat("!", volume));
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

}
