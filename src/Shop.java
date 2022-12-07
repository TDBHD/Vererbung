public class Shop {
    
    public static void main(String[] args) {
        EinUndAusgabe ea = new EinUndAusgabe();
        System.out.print("Buchpreis: ");
        double buchPreis = ea.leseDouble();
        System.out.print("DVD-Preis: ");
        double dvdPreis = ea.leseDouble();
        Haendler buchHaendler = new Haendler(buchPreis);
        Haendler dvdHaendler = new Haendler(dvdPreis);
        char weiter = 0;
        do {
            System.out.print("Buch oder DVD kaufen (b/d)? ");
            char auswahl = ea.leseChar(); //EinUndAusgabe muss von Ihnen mit leseChar() erweitert werden.
            System.out.print("Anzahl Produkte: ");
            int anzahl = ea.leseInteger();
            if (auswahl == 'b') {
                buchHaendler.kaufen(anzahl);
            } else {
                dvdHaendler.kaufen(anzahl);
            }
            System.out.print("Weiter einkaufen(j/n): ");
            weiter = ea.leseChar();
        } while (weiter == 'j');
        double einnamen = buchHaendler.liefereEinnahmen();
        System.out.println("Einnahmen des Buchhaendlers = " + einnamen);
        einnamen = dvdHaendler.liefereEinnahmen();
        System.out.println("Einnahmen des DVD-Haendlers = " + einnamen);
    }
}