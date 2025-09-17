/**
 * Tehtävä 2 – Main (testaa MathUtil)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo int[] ja double[] ja testaa sum/min/max.
 *  2. Tulosta tulokset.
 *
 * VINKIT:
 *  - Korvaa placeholderit oikeilla metodeilla kun olet valmis.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        double[] b = {1.5,2.5,3.0};
        System.out.println(MathUtil.sum(6, 7));
        System.out.println(MathUtil.sum(4, 7, 1));
        System.out.println(MathUtil.max(a));
        System.out.println(MathUtil.sum(b));
        System.out.println(MathUtil.min(a));
    }
}