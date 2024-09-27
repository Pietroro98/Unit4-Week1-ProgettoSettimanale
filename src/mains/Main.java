package mains;

import model.ElementoMultimediale;
import model.Video;

import java.util.Scanner;

public class Main {
    private static ElementoMultimediale[] elementi = new ElementoMultimediale[5];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci l'elemento (1-Immagine, 2-Audio, 3-Video) da visualizzare: ");
            int opzione = sc.nextInt();
            sc.nextLine();
            System.out.println("Inserisci il un titolo: ");
            String titolo = sc.nextLine();
            switch (opzione) {
                case 1:
                    System.out.println("inserisci la luminosita desiderata: ");
                    int luminosita = sc.nextInt();
                    elementi[i] = new model.Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("inserisci la durata desiderata: ");
                    int durataAudio = sc.nextInt();
                    System.out.println("inserisci il volume desiderato: ");
                    int volumeAudio = sc.nextInt();
                    elementi[i] = new model.RegistrazioneAudio(titolo, durataAudio, volumeAudio );
                    break;
                case 3:
                    System.out.println("inserisci la durata desiderata: ");
                    int durataVideo = sc.nextInt();
                    System.out.println("inserisci il volume desiderato: ");
                    int VolumeVideo = sc.nextInt();
                    System.out.println("inserisci la luminosita desiderata: ");
                    int luminositaVideo = sc.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, VolumeVideo, luminositaVideo);
                    break;
                    default:
                    System.out.println("!! WARNING !! - L'opzione che hai inserito non é valida");
                    i--;
                    break;
            }
        }

    }
}
