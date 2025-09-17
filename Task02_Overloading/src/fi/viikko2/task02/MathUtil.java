/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task02;

public class MathUtil {
    public static int placeholderInt(){ return 0; }
    public static double placeholderDouble(){ return 0.0; }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static int sum(int[] nums){
        int sum = 0;
        for(int i = 1; i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }

    static double sum(double[] nums){
        double sum = 0.0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    static int max(int[] nums){
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i]> max){
                max = nums[i];
            }
        }
        return max;
    }

    static int min(int[] nums){
        int min = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }

        return min;
    }
}