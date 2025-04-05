package src;

public class Hayvan {
    String sesCikar() {
        return "Hayvan ses çıkartıyor.";
    }
}

class Kedi extends Hayvan {
    String sesCikar() {
        return "Miyav!";
    }
}