package model;

public class Video extends ElementoMultimediale {
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

}
