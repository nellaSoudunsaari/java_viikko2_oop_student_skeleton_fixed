/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle(int width, int height, String shape){
        super(shape);
        this.width = width;
        this.height = height;
    }


    @Override
    public double area(){ 
        return width * height;
    }

    @Override
    public String toString(){ 
        return shape;
    }

    @Override
    public boolean equals(Object o){ 
        if(this == o) return true;
        if(!(o instanceof Rectangle)) return false;

        Rectangle other = (Rectangle)o;
        return this.width == other.width && java.util.Objects.equals(this.shape, other.shape);
    }
}