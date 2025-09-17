/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape("muoto");
        System.out.println(s.toString());

        Circle c = new Circle(2.8, "circle");
        System.out.println(c.area());
        System.out.println(c.toString());

        Rectangle r = new Rectangle(7, 3, "rectangle");
        System.out.println(r.area());
        System.out.println(r.toString());
    }
}