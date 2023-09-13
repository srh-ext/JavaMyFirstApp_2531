import java.util.Date;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        //basic();
        //taschenrechner(22, 33);
        //vergleichsoperatoren();
        //logischeoperatoren();
        wecker(14,28);
    }

    public static void wecker(int hours, int minutes) {
        while (true) {
            Date date = new Date();
            int currentHours = date.getHours();
            int currentMinutes = date.getMinutes();

            if (hours == currentHours && minutes == currentMinutes) {
                System.out.println("Aufstehen!!!!!");
                break;
            } else {
                System.out.println("Schlafen...");
            }
        }

        System.out.println("ich bin wach.");
    }

    public static void logischeoperatoren() {
        int age = 36;
        System.out.println(age >= 18 && age <= 60); // true
        age = 17;
        System.out.println(age >= 18 && age <= 60); // false
        System.out.println(age >= 18 || age <= 60); // true
        age = 18;
        System.out.println(age >= 18 || age <= 60); // true
        age = 99;
        System.out.println((age >= 18 && age <= 60)); // false
        //verneinen
        System.out.println(!(age >= 18 && age <= 60)); // true

        System.out.println((int)10 == (double)10.0);
        System.out.println((int)10 == (double)10.22);   //10.0 == 10.22


    }

    public static void vergleichsoperatoren() {
        int zahl1 = 10;
        int zahl2 = 20;

        System.out.println(zahl1 == zahl2); // false
        System.out.println(zahl1 != zahl2); // true
        System.out.println(zahl1 > zahl2);  // false
        System.out.println(zahl1 < zahl2);  // true
        System.out.println(9 <= 10);        // true
        System.out.println(10 <= 10);       // true

        boolean result = (zahl1 == zahl2);
        System.out.println(result);

        String text1 = "Hallo welt";
        String text2 = "Hello world";
        System.out.println(text1 == text2);
        System.out.println(text1 != text2);
        System.out.println(text1.equals(text2));
        System.out.println(!text1.equals(text2));

        //chars
        char b1 = 'a';
        char b2 = 'A';
        System.out.println((int)b1);
        System.out.println((int)b2);

        boolean result2 = b1 == b2;
        System.out.println(result2);
    }

    public static void taschenrechner(double zahl1, double zahl2) {
        //TODO: addieren
        double result = zahl1 + zahl2;
        System.out.println("Add: " + result);
        //TODO: substrachieren
        result = zahl1 - zahl2;
        System.out.println("Sub: " + result);
        //TODO: multiplizieren
        result = zahl1 * zahl2;
        System.out.println("Multi: " + result);
        //TODO: dividieren
        result = zahl1 / zahl2;
        System.out.println("Div: " + result);
    }

    /**
     * Hier ist die Sammlung von basic funktionen.
     */
    public static void basic() {
        /*
        bla bla block kommentar
         */
        System.out.println("Hello world!");
        int zahl = 10;
        System.out.println(zahl);
        double kommaZahl = 22.5;
        System.out.println(kommaZahl);
        int zahlOhneKomma = (int)kommaZahl;
        System.out.println(zahlOhneKomma);
        double zurueckZuDouble = zahlOhneKomma;
        System.out.println(zurueckZuDouble);

        boolean wahrheit = true;
        System.out.println(wahrheit);

        char zeichen = 'a';
        System.out.println(zeichen);
        int zeichenZahl = zeichen;
        System.out.println(zeichenZahl);
        char grosseA = 'A';
        int zeichenZahlA = grosseA;
        System.out.println(zeichenZahlA);

        int einZeichen = 113;
        char unbekantesZeichen = (char)einZeichen;
        System.out.println(unbekantesZeichen);

        float f = (float)22.2;

        short i = (short)1231231414;
        System.out.println(i);


        String text = "Hello World";

        Integer nonPrimitiveInt = 1;
        System.out.println(nonPrimitiveInt);

        Integer zahl2 = new Integer(20);
        System.out.println(zahl2);

        System.out.println(new Object());

        Byte b1 = 2;
        System.out.println(b1);
        System.out.println("OPERATOREN");
        System.out.println(1+3);
        System.out.println(1-3);
        System.out.println(1*3);
        System.out.println(1/3);

        int result = 1+3;
        System.out.println(result);
        result = 1-3;
        System.out.println(result);
        result = 1*3;
        System.out.println(result);
        float result2 = 1/3;
        System.out.println(result2);

        float i1 = 1;
        float i2 = 3;
        float result3 = i1/i2;
        System.out.println(result3);

        float result4 = (float)1/(float)3;
        System.out.println(result4);
        //MODULO
        System.out.println(4%2);    //4-2=2-2=0
        System.out.println(100%50); //100-50=50-50=0
        System.out.println(100%51); //100-51=49

        int z = 10;
        System.out.println(z);  //10
        z++; //z = z + 1
        System.out.println(z);
        System.out.println("=============");
        int b = 0;
        System.out.println(b++);    //0
        System.out.println(b);      //1
        System.out.println(++b);

        System.out.println(b--);    // b = b - 1
        System.out.println(--b);    // b - 1 = b

        int c = 10;
        System.out.println(c);
        c+=10;  //c = c + x; x = 10;
        System.out.println(c);  //20
        c+=100;
        System.out.println(c);  //120
        c-=1000;
        System.out.println(c);  //120 - 1000 = -880

        int d = 10;
        for (int y = 0; y < 10; y++) {
            System.out.println(y);
            d+=100; // d = 10 + 100;
            System.out.println(d);
        }
    }
}
