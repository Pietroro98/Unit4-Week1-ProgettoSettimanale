package model;

public class Video extends ElementoMultimediale implements RiproduciElemento {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }
    public void abbassaVolume() {
        volume--;
    }
    public void aumentaVolume() {
        volume++;
    }
    public void aumentaLuminosita() {
        luminosita++;
    }
    public void diminuisciLuminosita() {
        luminosita--;
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
//            System.out.println(titolo + " " + repeat("!", volume) + repeat("*", luminosita));
            System.out.println(titolo + " " + "*".repeat(luminosita) + "!".repeat(volume));
        }
    }


    }



