import java.lang.reflect.Array;
import java.util.*;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        //basic();
        //taschenrechner(22, 33);
        //vergleichsoperatoren();
        //logischeoperatoren();
        //wecker(25, 67);
        //strings();
        //split();
        //templateApp();
        //arrays();
        lists();
    }

    public static void lists() {
        //#1 erstelle eine ArrayList
        ArrayList<Integer> intList = new ArrayList<>();
        //#2 Befühle mit folgenden Zahlen
        //7, 3, 1, 5, 8, 10, 2, 4, 6, 9
        System.out.println(Arrays.toString(intList.toArray()));
        //#3 sortiere die Zahlen
        /*
        Sorting ArrayList in ascending Order
        Collections.sort(list);
         */
        System.out.println(Arrays.toString(intList.toArray()));
        //#4 Lösche die Zahl 10
        System.out.println(Arrays.toString(intList.toArray()));
        //#5 Lösche das letzte Element
        System.out.println(Arrays.toString(intList.toArray()));
        //#6 Lösche das Element mit dem Value 5
        System.out.println(Arrays.toString(intList.toArray()));
        //#7 Füge and der fünften Stelle die Zahl 5
        System.out.println(Arrays.toString(intList.toArray()));
    }

    public static void arrays() {
        int[] arr = new  int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = -1;    //kann als Platzhalter - "nicht belegt" markiert werden

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        //FOR-EACH-LOOP #2
        for(int i: arr) {
            System.out.println(i);
        }
        //initialisieren
        int[] arr2 = {1,2,3,4,4,5,67,4673,56456,46,346,34634};
        System.out.println(arr2.length);
        int size = arr2.length-1;
        System.out.println(arr2[size]);

        //re-initialisieren
        //Resizing #1
        int[] arr3 = new int[arr2.length + 2];
        //FOR-LOOP #1
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i];
        }
        arr3[12] = 13;
        arr3[13] = 14;
        System.out.println(Arrays.toString(arr3));
        //Resizing #2
        int[] arr4 = new int[arr3.length + 1];
        int i = 0;
        for (int zahl : arr3) {
            arr4[i] = zahl;
            i++;
        }
        arr4[14] = 15;
        System.out.println(Arrays.toString(arr4));
        //Decrementieren
        //Ergebnis: [1, 2, 3, 4, 4, 5, 67, 4673, 56456, 46, 346, 34634]
        //Size zurücksetzen, verkleinern
        //Lösung #1
        int[] arr5 = arr2.clone();
        System.out.println(Arrays.toString(arr5));
        //Lösung #2
        int[] arr55 = new int[arr2.length];
        for(int j = 0; j < arr4.length - 3; j++) {
            arr55[j] = arr4[j];
        }
        System.out.println(Arrays.toString(arr55));
        //Lösung #3
        int[] arr555 = Arrays.copyOfRange(arr4, 0, arr4.length - 3);
        System.out.println(Arrays.toString(arr555));
        System.out.println("===========================");
        //clone vs copy
        int[] arr6 = arr2;
        int[] arr7 = arr2.clone();

        arr2[0] = -1;

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(arr7));

        System.out.println(arr2.hashCode());
        System.out.println(arr6.hashCode());
        System.out.println(arr7.hashCode());

        int[] unsortet = {3,5,1,9,4,8};
        Arrays.sort(unsortet);
        System.out.println(Arrays.toString(unsortet));

        char[] chUnsortet = {'b', 'z', 'a', 'i', 'm'};

        // char => int => sort => int => char
        Arrays.sort(chUnsortet);
        System.out.println(Arrays.toString(chUnsortet));
        System.out.println("===========================");
        //Multidimensional Arrays
        int[][] mArray = new int[10][5];
        mArray[0][0] = 1;
        System.out.println(Arrays.toString(mArray));
        System.out.println(mArray[0][0]);

        System.out.println("length dimension 1: "+ mArray.length);
        System.out.println("length dimension 2: "+ mArray[0].length);

        for(int j = 0; j < mArray.length; j++) {

            for(int y = 0; y < mArray[0].length; y++) {

                System.out.println(mArray[j][y]);
            }
        }

        //Erstellen Sie ein Tabelle mit Spalten und Zeilen
        //Zeile 1:      ID   VORNAME     NACHNAME
        //Zeile 2-5:    1    Yuriy       Beck
        //...
        String[][] table = new String[5][3];
        String[] zeile1 = {"ID", "VORNAME", "NACHNAME"};
        String[] zeile2 = {"1", "Yu", "Be"};
        String[] zeile3 = {"2", "Ge", "Ce"};
        String[] zeile4 = {"3", "Pi", "Po"};
        String[] zeile5 = {"4", "Da", "De"};
        table[0] = zeile1;
        table[1] = zeile2;
        table[2] = zeile3;
        table[3] = zeile4;
        table[4] = zeile5;

        //Schreibe einen Loop der die Tabelle ausliest
        //in einem formattierten Zustand
        //Zeile 1:      ID   VORNAME     NACHNAME
        //Zeile 2-5:    1    Yuriy       Beck
        for(String[] zeile: table) {
            //System.out.println(Arrays.toString(zeile));
            System.out.println(String.format("%s\t%s\t%s", zeile));
            //System.out.println(String.format("%s\t%s\t%s", zeile[0], zeile[1], zeile[2]));
        }
        //eine Methode
        String text = "";
        for(String[] zeile: table) {
            text += String.format("%s\t%s\t%s\n", zeile);
        }

        System.out.println(text);
    }

    public static void templateApp() {
        String csv = "Yuriy;Beck;Am Wallgraben;9;52428;Juelich";

        String template = "Guten Tag <NACHNAME>," +
                "\ndie Rechnung wurde an folgende Adresse versadt:" +
                "\n<STRASSE> <NR>" +
                "\n<PLZ> <STADT>" +
                "\n\nViele Grüße" +
                "\n Euer Team";

        String[] csvList = csv.split(";");
        //Option #1
        String mail = template.replace("<NACHNAME>", csvList[1]);
        mail = mail.replace("<STRASSE>", csvList[2]);
        mail = mail.replace("<NR>", csvList[3]);
        mail = mail.replace("<PLZ>", csvList[4]);
        mail = mail.replace("<STADT>", csvList[5]);
        System.out.println(mail);

        //Option #2
        String template2 = "Guten Tag %s," +
                "\ndie Rechnung wurde an folgende Adresse versadt:" +
                "\n%s %s" +
                "\n%s %s" +
                "\n\nViele Grüße" +
                "\nEuer Team";

        mail = String.
                format(template2, csvList[1],csvList[2],csvList[3],csvList[4],csvList[5]);
        System.out.println(mail);
    }

    public static void split() {
        String name = "Yuriy Beck";
        String[] liste = name.split(" ");
        System.out.println(liste.length);

        String vorname = liste[0];  //index - 1, wenn man den ersten haben möchte => 1 - 1 = 0
        String nachname = liste[1];
        System.out.println(vorname);
        System.out.println(nachname);

        //Aufgabe
        String text = "Hallo Yuriy, heute ist ein schöner Tag, du bist schön.";
        //Hallo Yuriy
        //heute ist ein schöner Tag!
        String[] liste2 = text.split(", ");
        String t1 = liste2[0];
        //String t2 = liste2[1].trim();
        String t2 = liste2[1];
        System.out.println(t1);
        System.out.println(t2);

        //unbekannte Anzahl von Trennungen
        int i = 1;
        for(String t : liste2) {
            System.out.println(i + ": " + t);
            i++;
        }

        //Aufgabe #2
        String csv = "Yuriy;Beck;Am Wallgraben;9;52428;Juelich";
        String[] csvListe = csv.split(";");
        for(String c : csvListe) {
            System.out.println(c);
        }
        String vorname1 = csvListe[0];
        String nachname1 = csvListe[1];
        String strasse = csvListe[2];
        String nr = csvListe[3];
        String plz = csvListe[4];
        String stadt = csvListe[5];
        System.out.println(vorname1 + " " + nachname1);
        System.out.println(strasse + " " + nr);
        System.out.println(plz + " " + stadt);

        String name1 = String.join(" ", vorname1, nachname1);
        System.out.println(name1);

        String csv2 = String.join("\n\t", csvListe);
        System.out.println(csv2);

        String csv_new = csv.replace(";", " ");
        System.out.println(csv_new);

        String replaceText = "Ich wohne an der Straße Kürsten Flöhe 1 in Drämmen.";
        System.out.println(replaceText);
        //Sonderzeichen: ä,ö,ü,ß
        String newText = replaceText.replace("ä", "ae");
        newText = newText.replace("ö", "oe");
        newText = newText.replace("ü", "ue");
        newText = newText.replace("ß", "ss");
        System.out.println(newText);
    }

    public static void strings() {
        char ch = 'a';
        String text1 = "Hallo Welt";
        System.out.println(text1);
        //for-each
        for (char letter : text1.toCharArray()) {
            System.out.println(letter);
        }

        //vergleicht die Objekte nicht die Werte
        //vergleicht die Werte nicht die Objekte
        boolean isEqual = (text1 == "Hello Welt");
        System.out.println(isEqual);

        isEqual = (text1 == "Hallo Welt");
        System.out.println(isEqual);

        isEqual = (text1.equals("Hallo Welt"));
        System.out.println(isEqual);

        //FORMATTING
        String name = "Beck";
        String begruessung = "Guten Tag Herr/Frau ";
        String message = "\nwir wünschen Ihnen einen schönen Tag.\n\nViele Grüße\nUnser Team";
        //option #1
        String text = begruessung + name + "," + message;
        System.out.println(text);
        //option #2
        String message2 = "Guten Tag Herr/Frau %s,\nwir wünschen Ihnen einen schönen Tag.\n\nViele Grüße\nUnser Team";
        String text2 = String.format(message2, name);
        System.out.println(text2);

        System.out.println(name.length());
        System.out.println(message2.length());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die E-Mail Adresse ein > ");
        String email = scanner.nextLine().trim();
        if (!email.isBlank() && email.length() > 10) {
            System.out.println("Email: " + email);
            System.out.print("Bitte geben Sie das Password ein > ");
            String password = scanner.nextLine().trim();

            if (password.isBlank()) {
                System.out.println("Sie haben kein Password eingegeben!!!");
            } else {
                if (password.length() > 13) {
                    System.out.println("Erfolgreich eingeloggt!");
                } else {
                    System.out.println("Passwort ist zu kurz!!!");
                }
            }
        } else {
            System.out.println("Sie haben nichts eingegeben!!!");
        }

    }

    public static void wecker(int hours, int minutes) {
        //hours 1-24
        //minutes 0-59
        if (true) { //bedingung

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
        } else {
            System.out.println("Die eingegebene Zeit ist nicht korrekt!");
        }
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

        System.out.println((int) 10 == (double) 10.0);
        System.out.println((int) 10 == (double) 10.22);   //10.0 == 10.22


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
        System.out.println((int) b1);
        System.out.println((int) b2);

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
        int zahlOhneKomma = (int) kommaZahl;
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
        char unbekantesZeichen = (char) einZeichen;
        System.out.println(unbekantesZeichen);

        float f = (float) 22.2;

        short i = (short) 1231231414;
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
        System.out.println(1 + 3);
        System.out.println(1 - 3);
        System.out.println(1 * 3);
        System.out.println(1 / 3);

        int result = 1 + 3;
        System.out.println(result);
        result = 1 - 3;
        System.out.println(result);
        result = 1 * 3;
        System.out.println(result);
        float result2 = 1 / 3;
        System.out.println(result2);

        float i1 = 1;
        float i2 = 3;
        float result3 = i1 / i2;
        System.out.println(result3);

        float result4 = (float) 1 / (float) 3;
        System.out.println(result4);
        //MODULO
        System.out.println(4 % 2);    //4-2=2-2=0
        System.out.println(100 % 50); //100-50=50-50=0
        System.out.println(100 % 51); //100-51=49

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
        c += 10;  //c = c + x; x = 10;
        System.out.println(c);  //20
        c += 100;
        System.out.println(c);  //120
        c -= 1000;
        System.out.println(c);  //120 - 1000 = -880

        int d = 10;
        for (int y = 0; y < 10; y++) {
            System.out.println(y);
            d += 100; // d = 10 + 100;
            System.out.println(d);
        }
    }
}
