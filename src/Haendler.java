public class Haendler {
    private double preis;
    private int anzahl;

    public Haendler(double preis) {
        this.preis = preis;
    }

    public int kaufen(int anzahl){
        this.anzahl = anzahl;
    return anzahl;
    }

    public double liefereEinnahmen(){
        double einnamen = this.preis * this.anzahl;
        return einnamen;
    }
}
