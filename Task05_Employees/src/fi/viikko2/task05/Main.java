/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee("Aku Ankka");
        System.out.println(a.toString());

        SalariedEmployee b = new SalariedEmployee("Hannu Ankka", 2500.55);
        System.out.println(b.toString());

        HourlyEmployee c = new HourlyEmployee("Tupu Ankka", 13.75, 45);
        System.out.println(c.toString());
        System.out.println(c.monthlyPay());
    }
}