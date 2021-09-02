/*
Program obliczający cieżar człowieka na księżycu.

Nazwa pliku to GravityOfTheMoon.java
*/

class GravityOfTheMoon {
    public static void main(String args[]) {

        float my_weight;
        float gravity_on_moon;

        my_weight = 70;
        gravity_on_moon = my_weight * 17 / 100;

        my_weight = my_weight - gravity_on_moon; 

        System.out.println("moja waga na Księżycu to: " + my_weight);
    }
    
}
