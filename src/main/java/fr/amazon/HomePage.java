package fr.amazon;

public class HomePage {
    static String url = "https://www.amazon.fr/";
    static String title ="Amazon.fr : livres, DVD, jeux vidéo, musique, high-tech, informatique, jouets, vêtements, chaussures, sport, bricolage, maison, beauté, puériculture, épicerie et plus encore !";
    public void goTo(){
        Browser.goTo(url);
    }
    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
